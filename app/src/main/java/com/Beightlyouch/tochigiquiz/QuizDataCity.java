package com.Beightlyouch.tochigiquiz;

public class QuizDataCity {
    private static final String poolcity[] []= new String[][]{{"ashikaga","hoga","ichikai","kamisangawa","kanuma"
            ,"mashiko","mibu","mogi","moka","nakagawa","nasu","nasukarasuyama","nasushiobara","nikko"
            ,"nogi","otabara","oyama","sakura","sano","shino","shioya","takanesawa","tochigi"
            ,"utsunomiya","yaita"},
            {"足利市","芳賀町","市貝町","上三川町","鹿沼市",
                    "益子町","壬生町","茂木町","真岡市","那賀川町","那須町","那須烏山市","那須塩原市","日光市",
                    "野木町","大田原市","小山市","さくら市","佐野市","下野市"/*しもつけ*/,"塩谷町","高根沢町","栃木市"
                    ,"宇都宮市","矢板市"}};

    public static String[][] getPoolcity(){
        return QuizDataCity.poolcity;
    }

    public static int getSize(){
        return poolcity.length;
    }
}
