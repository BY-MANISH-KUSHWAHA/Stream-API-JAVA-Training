package com.Stream_Intermediate_Operation_Assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class JavaStreamDistinct {

    public static void main(String[] args) {
        List<Data> dataList = new ArrayList<>();
        dataList.add(new Data(10));
        dataList.add(new Data(20));
        dataList.add(new Data(10));
        dataList.add(new Data(20));

        System.out.println("Data List = "+dataList);

        List<Data> uniqueDataList = dataList.stream().distinct().collect(Collectors.toList());

        System.out.println("Unique Data List = "+uniqueDataList);
    }

}

class Data {
    private int id;

    Data(int i) {
        this.setId(i);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Data[%d]", this.id);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Data equals method");
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Data other = (Data) obj;
        if (id != other.id)
            return false;
        return true;
    }
}