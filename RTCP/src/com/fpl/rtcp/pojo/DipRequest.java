
package com.fpl.rtcp.pojo;

public class DipRequest
{
    private String phone_number;

    public String getPhone_number()
    {
        return phone_number;
    }

    public void setPhone_number(String phone_number)
    {
        this.phone_number = phone_number;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [phone_number = " + phone_number + "]";
    }
}
