package com.owtp.app.wallet.owtplib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.owtp.app.wallet.owtplib.Tools.KeyUtil;
import com.owtp.app.wallet.owtplib.sdk.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView action_text=findViewById(R.id.action_text);
        String seedContent= KeyUtil.getSeedWordStr(this);
        action_text.setText(seedContent);

        KeyUtil.genMasterPriKeyHex(seedContent);
        new TestClass().test();
        new TestClass().Test_GenPublicChild_fromPrivate_secp256k1_normal();
        new TestClass().Test_GenPrivateChild_fromPrivate_secp256k1_hd();
        new TestClass().Test_GenPublicChild_fromPrivate_secp256k1_hd();
        new TestClass().Test_GenPublicChild_fromPublic_secp256k1_normal();
        new TestClass().test1();
        new TestClass().Test_GenPublicChild_fromPublic_ed25519_normal();
    }
}
