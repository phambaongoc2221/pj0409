package dao;

import context.DBContext;

import entity.Food;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

   public List<Food> getAllFood(){
        List<Food> list = new ArrayList<>();
        String query = "select * from food";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
                list.add(new Food(rs.getInt(1),
                                    rs.getString(2),
                                    rs.getString(3),
                                    rs.getDouble(4),
                                    rs.getString(5)));
            }
        }catch (Exception e){

        }
        return list;
    }
   public static void main(String[] args) {
        DAO dao = new DAO();
        List<Food> list = dao.getAllFood();
        for(Food food : list){
            System.out.println(food);
        }
     }

}
