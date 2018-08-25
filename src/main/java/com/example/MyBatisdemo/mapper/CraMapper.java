package com.example.MyBatisdemo.mapper;

import com.example.MyBatisdemo.Pojo.Car;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;

@Mapper
public interface CraMapper{

    @Insert(" Insert into CAR(make, model ,year) values ( #{make} , #{model} , #{year})")


    @Select(" Select * from CAR ")
    Collection<Car> selectAll();
        }