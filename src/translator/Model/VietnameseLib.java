/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package translator.Model;

import java.util.*;

/**
 *
 * @author anhinox
 */
public class VietnameseLib
{
// NormalWordToTeencode = nwtt
    public HashMap<String, String> nwtt = new HashMap<>();

    public VietnameseLib()
    {
        nwtt.put("a", "4");
        nwtt.put("à", "4");
        nwtt.put("á", "4");
        nwtt.put("ả", "4");
        nwtt.put("ã", "4");
        nwtt.put("ạ", "4");
        nwtt.put("À", "4");
        nwtt.put("Á", "4");
        nwtt.put("Ả", "4");
        nwtt.put("Ã", "4");
        nwtt.put("Ạ", "4");
        nwtt.put("ă", "4");
        nwtt.put("ằ", "4");
        nwtt.put("ẳ", "4");
        nwtt.put("ắ", "4");
        nwtt.put("ẵ", "4");
        nwtt.put("ặ", "4");
        nwtt.put("Ă", "4");
        nwtt.put("Ằ", "4");
        nwtt.put("Ắ", "4");
        nwtt.put("Ẳ", "4");
        nwtt.put("Ẵ", "4");
        nwtt.put("Ặ", "4");
        nwtt.put("â", "4");
        nwtt.put("ầ", "4");
        nwtt.put("ấ", "4");
        nwtt.put("ẩ", "4");
        nwtt.put("ẫ", "4");
        nwtt.put("ậ", "4");
        nwtt.put("Â", "4");
        nwtt.put("Ầ", "4");
        nwtt.put("Ấ", "4");
        nwtt.put("Ẫ", "4");
        nwtt.put("Ậ", "4");
        nwtt.put("đ", "d");
        nwtt.put("Đ", "d");
        nwtt.put("e", "3");
        nwtt.put("è", "3");
        nwtt.put("é", "3");
        nwtt.put("ẻ", "3");
        nwtt.put("ẽ", "3");
        nwtt.put("ẹ", "3");
        nwtt.put("È", "3");
        nwtt.put("É", "3");
        nwtt.put("Ẻ", "3");
        nwtt.put("Ẽ", "3");
        nwtt.put("Ẹ", "3");
        nwtt.put("ê", "3");
        nwtt.put("ề", "3");
        nwtt.put("ế", "3");
        nwtt.put("ể", "3");
        nwtt.put("ễ", "3");
        nwtt.put("ệ", "3");
        nwtt.put("Ê", "3");
        nwtt.put("Ề", "3");
        nwtt.put("Ế", "3");
        nwtt.put("Ể", "3");
        nwtt.put("Ễ", "3");
        nwtt.put("Ệ", "3");
        nwtt.put("g", "q");
        nwtt.put("h", "k");
        nwtt.put("i", "j");
        nwtt.put("ì", "j");
        nwtt.put("í", "j");
        nwtt.put("ỉ", "j");
        nwtt.put("ĩ", "j");
        nwtt.put("ị", "j");
        nwtt.put("Ì", "j");
        nwtt.put("Í", "j");
        nwtt.put("Ỉ", "j");
        nwtt.put("Ĩ", "j");
        nwtt.put("Ị", "j");
        nwtt.put("o", "0");
        nwtt.put("ò", "0");
        nwtt.put("ó", "0");
        nwtt.put("ỏ", "0");
        nwtt.put("õ", "0");
        nwtt.put("ọ", "0");
        nwtt.put("Ò", "0");
        nwtt.put("Ó", "0");
        nwtt.put("Ỏ", "0");
        nwtt.put("Õ", "0");
        nwtt.put("Ọ", "0");
        nwtt.put("ô", "0");
        nwtt.put("ồ", "0");
        nwtt.put("ố", "0");
        nwtt.put("ổ", "0");
        nwtt.put("ỗ", "0");
        nwtt.put("ộ", "0");
        nwtt.put("Ô", "0");
        nwtt.put("Ồ", "0");
        nwtt.put("Ố", "0");
        nwtt.put("Ổ", "0");
        nwtt.put("Ỗ", "0");
        nwtt.put("Ộ", "0");
        nwtt.put("ơ", "0");
        nwtt.put("ờ", "0");
        nwtt.put("ớ", "0");
        nwtt.put("ở", "0");
        nwtt.put("ỡ", "0");
        nwtt.put("ợ", "0");
        nwtt.put("Ơ", "0");
        nwtt.put("Ờ", "0");
        nwtt.put("Ớ", "0");
        nwtt.put("Ở", "0");
        nwtt.put("Ỡ", "0");
        nwtt.put("Ợ", "0");
        nwtt.put("ù", "u");
        nwtt.put("ú", "u");
        nwtt.put("ủ", "u");
        nwtt.put("ũ", "u");
        nwtt.put("ụ", "u");
        nwtt.put("Ù", "u");
        nwtt.put("Ú", "U");
        nwtt.put("Ủ", "U");
        nwtt.put("Ũ", "U");
        nwtt.put("Ụ", "U");
        nwtt.put("ư", "u");
        nwtt.put("ừ", "u");
        nwtt.put("ứ", "u");
        nwtt.put("ử", "u");
        nwtt.put("ữ", "u");
        nwtt.put("ự", "u");
        nwtt.put("Ư", "u");
        nwtt.put("Ừ", "u");
        nwtt.put("Ứ", "U");
        nwtt.put("Ử", "U");
        nwtt.put("Ữ", "U");
        nwtt.put("Ự", "U");
        nwtt.put("y", "ij");
        nwtt.put("ỳ", "ij");
        nwtt.put("ý", "ij");
        nwtt.put("ỷ", "ij");
        nwtt.put("ỹ", "ij");
        nwtt.put("ỵ", "ij");
        nwtt.put("Y", "ij");
        nwtt.put("Ỳ", "ij");
        nwtt.put("Ý", "ij");
        nwtt.put("Ỷ", "ij");
        nwtt.put("Ỹ", "ij");
        nwtt.put("Ỵ", "ij");
    }
}
