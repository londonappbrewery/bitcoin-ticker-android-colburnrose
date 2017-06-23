package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Colburn on 6/23/2017.
 */

public class BitcoinDataModel {

    private String mCoin;

    public String getCoin(){
        return mCoin;
    }

    //TODO: Create a BitcoinDataModel from JSON:
    public static BitcoinDataModel fromJson(JSONObject jsonObject){
        try{
            BitcoinDataModel bitcoinData = new BitcoinDataModel();
            bitcoinData.mCoin = jsonObject.getJSONObject("changes").getJSONObject("price").getString("week");

            return bitcoinData;

        }catch(JSONException e){
            e.printStackTrace();
            return null;
        }
    }

}
