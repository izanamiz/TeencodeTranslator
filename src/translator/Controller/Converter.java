package translator.Controller;

import translator.Model.*;
import java.util.*;

public class Converter
{

    public HashMap<String, String> VnToTcLib = new HashMap();
    private HashMap<String, String> TcToVnLib = new HashMap();

    private TeencodeLib tc;
    private VietnameseLib vn;

    public Converter()
    {
        tc = new TeencodeLib();
        vn = new VietnameseLib();

        TcToVnLib = tc.ttnw;
        VnToTcLib = vn.nwtt;
    }

    public String VietnameseToTeencode(String input)
    {
        StringBuffer buffer = new StringBuffer();
        for (char c : input.toCharArray())
        {
            int flag = 0;
            if (Character.isUpperCase(c))
            {
                flag = 1;
            }

            if (VnToTcLib.containsKey(String.valueOf(c).toLowerCase()))

            {
                if (flag == 1)
                {
                    buffer.append(VnToTcLib.get(String.valueOf(c).toLowerCase()).toUpperCase());
                } else
                {
                    buffer.append(VnToTcLib.get(String.valueOf(c).toLowerCase()));
                }

            } else
            {
                buffer.append(String.valueOf(c));
            }

        }
        return buffer.toString();
    }

    public String TeencodeToVietnamese(String input)
    {
        StringBuffer buffer = new StringBuffer();
        int upper = 0, flag = 0;
        int len = input.length();
        for (int i = 0; i < len; i++)
        {
            char c = input.charAt(i);
            flag = 0;
            upper = 0;
            if (Character.isUpperCase(c))
            {
                upper = 1;
                c = Character.toLowerCase(c);
            }

            if (i < len - 1)
            {
                char x = input.charAt(i + 1);
                x = Character.toLowerCase(x);
                if (Character.compare(c, 'i') == 0 && Character.compare(x, 'j') == 0)
                {
                    c = 'y';
                    flag = 1;
                    i++;
                }
                if (Character.compare(c, 'q') == 0 && Character.compare(x, 'u') != 0)
                {
                    c = 'g';
                    flag = 1;
                }
            }
            if (i > 0 && Character.compare(c, 'k') == 0)
            {
                char y = input.charAt(i - 1);
                y = Character.toLowerCase(y);

                if (Character.compare(y, 'n') == 0 || Character.compare(y, 'c') == 0 || Character.compare(y, 'g') == 0 || Character.compare(y, 't') == 0 || Character.compare(y, 'k') == 0 || Character.compare(y, 'p') == 0)
                {
                    if (i < len - 1)
                    {
                        char x = input.charAt(i + 1);
                        x = Character.toLowerCase(x);

                        if (Character.compare(x, 'h') != 0)
                        {
                            c = 'h';
                            flag = 1;
                        }
                    }
                } else
                {
                    c = 'k';
                    flag = 1;
                }
            }

            if (flag == 0 && TcToVnLib.containsKey(String.valueOf(c)))
            {
                if (upper == 1)
                {
                    buffer.append(TcToVnLib.get(String.valueOf(c).toUpperCase()));
                } else
                {
                    buffer.append(TcToVnLib.get(String.valueOf(c)));
                }
            } else
            {
                if (upper == 1)
                {
                    buffer.append(String.valueOf(c).toUpperCase());
                } else
                {
                    buffer.append(String.valueOf(c));
                }

            }
        }

        return buffer.toString();
    }
}
