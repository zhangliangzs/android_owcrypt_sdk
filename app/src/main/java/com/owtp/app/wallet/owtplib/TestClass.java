package com.owtp.app.wallet.owtplib;

import android.util.Log;

import com.owtp.app.wallet.owtplib.Encrypt.EccSet;
import com.owtp.app.wallet.owtplib.Tools.Extendedkey;

public class TestClass {
    private boolean passFlag = true;
    private int zero=0;
    //test cases based on secp256k1
    //set root private key
    public byte[] rootPri = {(byte) 0x9e, (byte) 0xa1, (byte) 0x9e, 0x6e, (byte) 0xc2, 0x59, (byte) 0xf7, (byte) 0x85, 0x4e, (byte) 0xe4, 0x1b, 0x53, 0x07, (byte) 0xcf, (byte) 0xc4, (byte) 0xb8, (byte) 0xf4, 0x47, 0x75, 0x34, 0x20, 0x5e, (byte) 0xc9, (byte) 0x83, (byte) 0xc4, (byte) 0xd3, (byte) 0xa9, (byte) 0xb5, 0x6c, 0x0b, 0x27, 0x0c};
    public byte[] rootChainCode = {(byte) 0xab, (byte) 0xc9, (byte) 0xcc, 0x46, (byte) 0xa8, 0x16, 0x6d, (byte) 0x81, 0x55, (byte) 0xac, 0x1e, (byte) 0xd1, 0x2b, (byte) 0xe4, 0x11, (byte) 0xcd, 0x21, 0x3a, 0x3e, 0x28, (byte) 0xe4, (byte) 0xef, 0x46, 0x46, (byte) 0xfe, 0x03, (byte) 0xd7, 0x00, 0x2f, (byte) 0xef, 0x15, 0x2c};
    public byte[] rootParentFP = {0, 0, 0, 0};

    public void test() {
        Extendedkey rooPriKey = new Extendedkey(0, rootParentFP, zero, rootChainCode, rootPri, true, EccSet.ECC_CURVE_SECP256K1);
        Log.e("++","JNIUTIL");
        int a=0x80000000;
        Log.e("父私钥 -----> 普通子私钥", "JNIUTIL");
        Log.e("root private key data:", "JNIUTIL");
        Log.e("key:" + rooPriKey.byteArrayToHex(rooPriKey.key), "JNIUTIL");
        Log.e("chaincode:" + rooPriKey.byteArrayToHex(rooPriKey.chainCode), "JNIUTIL");
        Log.e("parent FP:" + rooPriKey.byteArrayToHex(rooPriKey.parentFP), "JNIUTIL");
        Log.e("dpth:" + rooPriKey.depth + "", "JNIUTIL");
        Log.e("serializes" + rooPriKey.serializes + "", "JNIUTIL");
        Log.e("private flag:" + rooPriKey.isPrivate + "", "JNIUTIL");
        Log.e("+++++++", "JNIUTIL");
        int serialize = 0;
        String expectChildPri = "f938a2e7fef45315b9b0c31b4db08e23a84b362e71876e7fc1880b2ea94e38f1";
        String expectChildChainCode = "a9e25b8ef131d1180292e8b7ef967347004ed436abf02ea14929325952f72809";
        String expectChildParentFP = "fb080f46";
        Extendedkey childPriKey = rooPriKey.GenPrivateChild(rooPriKey, zero);
        Log.e("child private key data:", "JNIUTIL");
        Log.e("key:" + childPriKey.byteArrayToHex(childPriKey.key), "JNIUTIL");
        Log.e("chaincode:" + childPriKey.byteArrayToHex(childPriKey.chainCode), "JNIUTIL");
        Log.e("parent FP:" + childPriKey.byteArrayToHex(childPriKey.parentFP), "JNIUTIL");
        Log.e("dpth:" + childPriKey.depth + "", "JNIUTIL");
        Log.e("serializes" + childPriKey.serializes + "", "JNIUTIL");
        Log.e("private flag:" + childPriKey.isPrivate + "", "JNIUTIL");
        Log.e("++", "JNIUTIL");

        Log.e("父私钥 -----> 普通子私钥", "JNIUTIL_Test");
        if(childPriKey.byteArrayToHex(childPriKey.key).equals("f938a2e7fef45315b9b0c31b4db08e23a84b362e71876e7fc1880b2ea94e38f1"))
        {
            Log.e("通过测试，私钥:"+childPriKey.key, "JNIUTIL_Test");
        }else
        {
            Log.e("不通过", "JNIUTIL_Test");
        }

        if(childPriKey.byteArrayToHex(childPriKey.chainCode).equals("a9e25b8ef131d1180292e8b7ef967347004ed436abf02ea14929325952f72809"))
        {
            Log.e("通过测试，chainCode:"+childPriKey.chainCode, "JNIUTIL_Test");
        }else
        {
            Log.e("不通过", "JNIUTIL_Test");
        }

        if(childPriKey.byteArrayToHex(childPriKey.parentFP).equals("fb080f46"))
        {
            Log.e("通过测试，parentFP:"+childPriKey.parentFP, "JNIUTIL_Test");
        }else
        {
            Log.e("不通过", "JNIUTIL_Test");
        }
    }

    public void Test_GenPublicChild_fromPrivate_secp256k1_normal() {
        Extendedkey rooPriKey = new Extendedkey(0, rootParentFP, zero, rootChainCode, rootPri, true, EccSet.ECC_CURVE_SECP256K1);
        //print root private key
        Log.e("++++", "JNIUTIL");
        Log.e("父私钥->普通子公钥", "JNIUTIL");
        Log.e("root private key data:", "JNIUTIL");
        Log.e("key:", rooPriKey.byteArrayToHex(rooPriKey.key));
        Log.e("chaincode:", rooPriKey.byteArrayToHex(rooPriKey.chainCode));
        Log.e("parent FP:", rooPriKey.byteArrayToHex(rooPriKey.parentFP));
        Log.e("dpth:", rooPriKey.depth + "");
        Log.e("serializes", rooPriKey.serializes + "");
        Log.e("private flag:", rooPriKey.isPrivate + "");
        Log.e("+++++++++++++", "JNIUTIL");

        //normal extend , serializes = 0x0
        //  int serialize = 0;
        //expect data
        //    expectChildPub := "0347e1f04775f36482cf78ea6d028ac71ab423199e37e04cbb448f31f973a63bba"
        //    expectChildChainCode := "a9e25b8ef131d1180292e8b7ef967347004ed436abf02ea14929325952f72809"
        //     expectChildParentFP := "fb080f46"
        Extendedkey childPubKey = rooPriKey.GenPublicChild(rooPriKey, zero);
        //print child private key
        Log.e("child public key data:", "JNIUTIL");
        Log.e("key:", childPubKey.byteArrayToHex(childPubKey.key));
        Log.e("chaincode:", childPubKey.byteArrayToHex(childPubKey.chainCode));
        Log.e("parent FP:", childPubKey.byteArrayToHex(childPubKey.parentFP));
        Log.e("dpth:", childPubKey.depth + "");
        Log.e("serializes", childPubKey.serializes + "");
        Log.e("private flag:", childPubKey.isPrivate + "");
        Log.e("+++++++", "JNIUTIL");


        Log.e("父私钥->普通子公钥", "JNIUTIL_Test");
        if(childPubKey.byteArrayToHex(childPubKey.key).equals("0347e1f04775f36482cf78ea6d028ac71ab423199e37e04cbb448f31f973a63bba"))
        {
            Log.e("通过测试，私钥:"+childPubKey.key, "JNIUTIL_Test");
        }else
        {
            Log.e("不通过", "JNIUTIL_Test");
        }

        if(childPubKey.byteArrayToHex(childPubKey.chainCode).equals("a9e25b8ef131d1180292e8b7ef967347004ed436abf02ea14929325952f72809"))
        {
            Log.e("通过测试，chainCode:"+childPubKey.chainCode, "JNIUTIL_Test");
        }else
        {
            Log.e("不通过", "JNIUTIL_Test");
        }

        if(childPubKey.byteArrayToHex(childPubKey.parentFP).equals("fb080f46"))
        {
            Log.e("通过测试，parentFP:"+childPubKey.parentFP, "JNIUTIL_Test");
        }else
        {
            Log.e("不通过", "JNIUTIL_Test");
        }
    }


    //HD private key extend based on secp256k1 private key
    public void Test_GenPrivateChild_fromPrivate_secp256k1_hd() {


        Extendedkey rooPriKey = new Extendedkey(0, rootParentFP, zero, rootChainCode, rootPri, true, EccSet.ECC_CURVE_SECP256K1);

        //print root private key
        Log.e("+++++++++++", "JNIUTIL");
        Log.e("父私钥 -----> 强化子私钥", "JNIUTIL");
        Log.e("root private key data:", "JNIUTIL");
        Log.e("key:", rooPriKey.byteArrayToHex(rooPriKey.key));
        Log.e("chaincode:", rooPriKey.byteArrayToHex(rooPriKey.chainCode));
        Log.e("parent FP:", rooPriKey.byteArrayToHex(rooPriKey.parentFP));
        Log.e("dpth:", rooPriKey.depth + "");
        Log.e("serializes", rooPriKey.serializes + "");
        Log.e("private flag:", rooPriKey.isPrivate + "");

        Log.e("+++++++++++++++++++++", "JNIUTIL");
        String expectChildPri="54d5bf2f8f82107ef1cd6a55c10a852643bde4653bfd4faa8d5ca1c14d9e7120";
        String expectChildChainCode ="8f1b8987c2d267d31980afce919f0276cb93e98972d6e27d3ba79550f729cce1";
        String expectChildParentFP="fb080f46";

        int serialize=0x80000000;
        Extendedkey childPriKey = rooPriKey.GenPrivateChild(rooPriKey,serialize);

        Log.e("child private key data:", "JNIUTIL");
        Log.e("key:", rooPriKey.byteArrayToHex(childPriKey.key));
        Log.e("chaincode:", rooPriKey.byteArrayToHex(childPriKey.chainCode));
        Log.e("parent FP:",rooPriKey.byteArrayToHex(childPriKey.parentFP));
        Log.e("dpth:", childPriKey.depth+"");
        Log.e("serializes", childPriKey.serializes+"");
        Log.e("private flag:", childPriKey.isPrivate+"");
        Log.e("+++++++++++++", "JNIUTIL");



        Log.e("父私钥 -----> 强化子私钥", "JNIUTIL_Test");
        if(childPriKey.byteArrayToHex(childPriKey.key).equals("54d5bf2f8f82107ef1cd6a55c10a852643bde4653bfd4faa8d5ca1c14d9e7120"))
        {
            Log.e("通过测试，私钥:"+childPriKey.key, "JNIUTIL_Test");
        }else
        {
            Log.e("不通过", "JNIUTIL_Test");
        }

        if(childPriKey.byteArrayToHex(childPriKey.chainCode).equals("8f1b8987c2d267d31980afce919f0276cb93e98972d6e27d3ba79550f729cce1"))
        {
            Log.e("通过测试，chainCode:"+childPriKey.chainCode, "JNIUTIL_Test");
        }else
        {
            Log.e("不通过", "JNIUTIL_Test");
        }

        if(childPriKey.byteArrayToHex(childPriKey.parentFP).equals("fb080f46"))
        {
            Log.e("通过测试，parentFP:"+childPriKey.parentFP, "JNIUTIL_Test");
        }else
        {
            Log.e("不通过", "JNIUTIL_Test");
        }
    }

    //HD public key extend based on secp256k1 private key
    public void Test_GenPublicChild_fromPrivate_secp256k1_hd() {
        Extendedkey rooPriKey = new Extendedkey(0, rootParentFP, zero, rootChainCode, rootPri, true, EccSet.ECC_CURVE_SECP256K1);
        //print root private key
        Log.e("++++++++++", "JNIUTIL");
        Log.e("父私钥 -----> 强化子公钥", "JNIUTIL");
        Log.e("root private key data:", "JNIUTIL");
        Log.e("key:", rooPriKey.byteArrayToHex(rooPriKey.key));
        Log.e("chaincode:", rooPriKey.byteArrayToHex(rooPriKey.chainCode));
        Log.e("parent FP:", rooPriKey.byteArrayToHex(rooPriKey.parentFP));
        Log.e("dpth:", rooPriKey.depth+"");
        Log.e("serializes", rooPriKey.serializes+"");
        Log.e("private flag:", rooPriKey.isPrivate+"");
        Log.e("++++++++++", "JNIUTIL");

        int  serialize = 0x80000000;

        String  expectChildPub = "03f6130e91673fea46204c6f05115c501421fd1ff038ab8c3371e8e81a6060a8e4";
        String expectChildChainCode = "8f1b8987c2d267d31980afce919f0276cb93e98972d6e27d3ba79550f729cce1";
        String expectChildParentFP = "fb080f46";


        Extendedkey childPubKey= rooPriKey.GenPublicChild(rooPriKey,serialize);

        Log.e("child public key data:", "JNIUTIL");
        Log.e("key:", rooPriKey.byteArrayToHex(childPubKey.key));
        Log.e("chaincode:", rooPriKey.byteArrayToHex(childPubKey.chainCode));
        Log.e("parent FP:", rooPriKey.byteArrayToHex(childPubKey.parentFP));
        Log.e("dpth:", childPubKey.depth+"");
        Log.e("serializes", childPubKey.serializes+"");
        Log.e("private flag:", childPubKey.isPrivate+"");
        Log.e("+++++", "JNIUTIL");



        Log.e("父私钥 -----> 强化子私钥", "JNIUTIL_Test");
        if(childPubKey.byteArrayToHex(childPubKey.key).equals("03f6130e91673fea46204c6f05115c501421fd1ff038ab8c3371e8e81a6060a8e4"))
        {
            Log.e("通过测试，私钥:"+childPubKey.key, "JNIUTIL_Test");
        }else
        {
            Log.e("不通过", "JNIUTIL_Test");
        }

        if(childPubKey.byteArrayToHex(childPubKey.chainCode).equals("8f1b8987c2d267d31980afce919f0276cb93e98972d6e27d3ba79550f729cce1"))
        {
            Log.e("通过测试，chainCode:"+childPubKey.chainCode, "JNIUTIL_Test");
        }else
        {
            Log.e("不通过", "JNIUTIL_Test");
        }

        if(childPubKey.byteArrayToHex(childPubKey.parentFP).equals("fb080f46"))
        {
            Log.e("通过测试，parentFP:"+childPubKey.parentFP, "JNIUTIL_Test");
        }else
        {
            Log.e("不通过", "JNIUTIL_Test");
        }

    }

    //normal public key extend based on secp256k1 public key
    public void Test_GenPublicChild_fromPublic_secp256k1_normal() {
        Extendedkey rooPriKey = new Extendedkey(0, rootParentFP, zero, rootChainCode, rootPri, true, EccSet.ECC_CURVE_SECP256K1);

        //print root private key
        Log.e("++++++", "JNIUTIL");
        Log.e("父公钥 -----> 普通子公钥", "JNIUTIL");
        Log.e("root private key data:", "JNIUTIL");
        Log.e("key:", rooPriKey.byteArrayToHex(rooPriKey.key));
        Log.e("chaincode:", rooPriKey.byteArrayToHex(rooPriKey.chainCode));
        Log.e("parent FP:", rooPriKey.byteArrayToHex(rooPriKey.parentFP));
        Log.e("dpth:", rooPriKey.depth+"");
        Log.e("serializes", rooPriKey.serializes+"");
        Log.e("private flag:", rooPriKey.isPrivate+"");

        Log.e("++++","JNIUTIL");
        int  serialize =0;
        //expect data
        String expectChildPub = "0347e1f04775f36482cf78ea6d028ac71ab423199e37e04cbb448f31f973a63bba";
        String  expectChildChainCode = "a9e25b8ef131d1180292e8b7ef967347004ed436abf02ea14929325952f72809";
        String  expectChildParentFP = "fb080f46";
        int expectChildDpth=1;
        int expectChildSerialize = serialize;
        boolean  expectChildPriFlag = false;
        Extendedkey childPubKey= rooPriKey.GenPublicChild(rooPriKey,serialize);


        Log.e("child public key data:", "JNIUTIL");
        Log.e("key:", rooPriKey.byteArrayToHex(childPubKey.key));
        Log.e("chaincode:", rooPriKey.byteArrayToHex(childPubKey.chainCode));
        Log.e("parent FP:", rooPriKey.byteArrayToHex(childPubKey.parentFP));
        Log.e("dpth:", childPubKey.depth+"");
        Log.e("serializes", childPubKey.serializes+"");
        Log.e("private flag:", childPubKey.isPrivate+"");
        Log.e("++++++++", "JNIUTIL");


        Log.e("父公钥 -----> 普通子公钥", "JNIUTIL_Test");
        if(childPubKey.byteArrayToHex(childPubKey.key).equals("0347e1f04775f36482cf78ea6d028ac71ab423199e37e04cbb448f31f973a63bba"))
        {
            Log.e("通过测试，私钥:"+childPubKey.key, "JNIUTIL_Test");
        }else
        {
            Log.e("不通过", "JNIUTIL_Test");
        }

        if(childPubKey.byteArrayToHex(childPubKey.chainCode).equals("a9e25b8ef131d1180292e8b7ef967347004ed436abf02ea14929325952f72809"))
        {
            Log.e("通过测试，chainCode:"+childPubKey.chainCode, "JNIUTIL_Test");
        }else
        {
            Log.e("不通过", "JNIUTIL_Test");
        }

        if(childPubKey.byteArrayToHex(childPubKey.parentFP).equals("fb080f46"))
        {
            Log.e("通过测试，parentFP:"+childPubKey.parentFP, "JNIUTIL_Test");
        }else
        {
            Log.e("不通过", "JNIUTIL_Test");
        }

    }



    //normal public key extend based on secp256k1 public key
    public void Test_GenPublicChild_fromPublic_ed25519_normal() {

        byte[] rootPri ={0x60,0x38,(byte)0x98,0x37,0x1B,(byte)0xC8,(byte)0x8A,(byte)0xDD,0x67,(byte)0xA9,(byte)0xA3,0x3F,0x4E,0x2C,(byte)0xC8,0x15,0x7D,(byte)0x9E,(byte)0xE5,0x77,0x12,0x39,0x74,(byte)0xF2,(byte)0xCD,(byte)0x8B,0x51,0x6C,0x5E,(byte)0x95,(byte)0xDE,(byte)0x85};
        byte[] rootChainCode = {(byte)0xab, (byte)0xc9,(byte) 0xcc, 0x46, (byte)0xa8, 0x16, 0x6d, (byte)0x81, 0x55, (byte)0xac, 0x1e, (byte)0xd1, 0x2b, (byte)0xe4, 0x11, (byte)0xcd, 0x21, 0x3a, 0x3e, 0x28, (byte)0xe4, (byte)0xef, 0x46, 0x46,(byte) 0xfe, 0x03, (byte)0xd7, 0x00, 0x2f, (byte)0xef, 0x15, 0x2c};
        byte[] rootParentFP = {0, 0, 0, 0};
        int  serialize =0;
        Extendedkey rooPriKey = new Extendedkey(0, rootParentFP, serialize, rootChainCode, rootPri, false, EccSet.ECC_CURVE_ED25519);

        Log.e("++++++", "JNIUTIL");
        Log.e("父公钥 -----> 普通子公钥", "JNIUTIL");
        Log.e("root private key data:", "JNIUTIL");
        Log.e("key:", rooPriKey.byteArrayToHex(rooPriKey.key));
        Log.e("chaincode:", rooPriKey.byteArrayToHex(rooPriKey.chainCode));
        Log.e("parent FP:", rooPriKey.byteArrayToHex(rooPriKey.parentFP));
        Log.e("dpth:", rooPriKey.depth+"");
        Log.e("serializes", rooPriKey.serializes+"");
        Log.e("private flag:", rooPriKey.isPrivate+"");
        Log.e("++++","JNIUTIL");

        Extendedkey childPubKey= rooPriKey.GenPublicChild(rooPriKey,serialize);
        Log.e("child public key data:", "JNIUTIL");
        Log.e("key:", rooPriKey.byteArrayToHex(childPubKey.key));
        Log.e("chaincode:", rooPriKey.byteArrayToHex(childPubKey.chainCode));
        Log.e("parent FP:", rooPriKey.byteArrayToHex(childPubKey.parentFP));
        Log.e("dpth:", childPubKey.depth+"");
        Log.e("serializes", childPubKey.serializes+"");
        Log.e("private flag:", childPubKey.isPrivate+"");
        Log.e("++++++++", "JNIUTIL");


        Log.e("父公钥 -----> 普通子公钥", "JNIUTIL_Test");
        if(childPubKey.byteArrayToHex(childPubKey.key).equals("ba5579bed9e5d97095a25f1e906291a52e41dae2a7e7d8714dfe29bbb40c977d"))
        {
            Log.e("通过测试，私钥:"+childPubKey.key, "JNIUTIL_Test");
        }else
        {
            Log.e("不通过", "JNIUTIL_Test");
        }

        if(childPubKey.byteArrayToHex(childPubKey.chainCode).equals("42982d2d067a0ad0e6499eea684458c106aeff868e481cccecb20c4eb9fbe1a3"))
        {
            Log.e("通过测试，chainCode:"+childPubKey.chainCode, "JNIUTIL_Test");
        }else
        {
            Log.e("不通过", "JNIUTIL_Test");
        }

        if(childPubKey.byteArrayToHex(childPubKey.parentFP).equals("081885e3"))
        {
            Log.e("通过测试，parentFP:"+childPubKey.parentFP, "JNIUTIL_Test");
        }else
        {
            Log.e("不通过", "JNIUTIL_Test");
        }


    }

    public void test1()
    {
        byte[] rootPri={(byte) 0xc0,0x61,0x12,(byte)0xad,(byte)0xbe,0x1b,(byte)0xc6,0x4b,0x75,0x6c,(byte)0xb6,(byte)0xb7,0x58,(byte)0xb6,0x5b,0x06,0x46,(byte)0xe7,0x0b,0x55,0x13,(byte)0xe1,(byte)0xf9,(byte)0x9e,0x46,(byte)0xba,(byte)0xb6,0x46,(byte)0xdd,0x57,0x5f,0x7e};
        byte[]  rootChainCode= {(byte)0xd4,0x6b,(byte)0xc7,0x60,0x0b,0x45,(byte)0xfe,0x1f,(byte)0xdd,0x4c,0x00,(byte)0xa0,0x08,0x69,(byte)0xf8,(byte)0x93,(byte)0xbb,0x1e,0x30,(byte)0xb4,(byte)0x85,(byte)0xd3,0x41,(byte)0xd3,(byte)0x95,0x10,(byte)0xab,0x27,(byte)0x94,(byte)0xc5,(byte)0x81,0x29};
        byte[] rootParentFP ={0, 0, 0, 0};

        int serialize = 0x80000000;

        Extendedkey rooPriKey = new Extendedkey(0, rootParentFP, serialize, rootChainCode, rootPri, true, EccSet.ECC_CURVE_ED25519);

        //print root private key
        Log.e("++++", "JNIUTIL");
        Log.e("父私钥->普通子公钥", "JNIUTIL");
        Log.e("root private key data:", "JNIUTIL");
        Log.e("key:", rooPriKey.byteArrayToHex(rooPriKey.key));
        Log.e("chaincode:", rooPriKey.byteArrayToHex(rooPriKey.chainCode));
        Log.e("parent FP:", rooPriKey.byteArrayToHex(rooPriKey.parentFP));
        Log.e("dpth:", rooPriKey.depth + "");
        Log.e("serializes", rooPriKey.serializes + "");
        Log.e("private flag:", rooPriKey.isPrivate + "");
        Log.e("+++++++++++++", "JNIUTIL");

        int expectChildDpth = 1;

        boolean expectChildPriFlag = false;
        Extendedkey childPubKey = rooPriKey.GenPrivateChild(rooPriKey, serialize);

        //print child private key
        Log.e("child public key data:", "JNIUTIL");
        Log.e("key:", childPubKey.byteArrayToHex(childPubKey.key));
        Log.e("chaincode:", childPubKey.byteArrayToHex(childPubKey.chainCode));
        Log.e("parent FP:", childPubKey.byteArrayToHex(childPubKey.parentFP));
        Log.e("dpth:", childPubKey.depth + "");
        Log.e("serializes", childPubKey.serializes + "");
        Log.e("private flag:", childPubKey.isPrivate + "");
        Log.e("+++++++", "JNIUTIL");



        Log.e("父私钥->普通子公钥", "JNIUTIL_Test");
        if(childPubKey.byteArrayToHex(childPubKey.key).equals("8a79fd7e014fd4ef1f9a929920069b97647263e3d5f5a35ee8e312413c845e95"))
        {
            Log.e("通过测试，私钥:"+childPubKey.key, "JNIUTIL_Test");
        }else
        {
            Log.e("不通过", "JNIUTIL_Test");
        }

        if(childPubKey.byteArrayToHex(childPubKey.chainCode).equals("a9e25b8ef131d1180292e8b7ef967347004ed436abf02ea14929325952f72809"))
        {
            Log.e("通过测试，chainCode:"+childPubKey.chainCode, "JNIUTIL_Test");
        }else
        {
            Log.e("不通过", "JNIUTIL_Test");
        }

        if(childPubKey.byteArrayToHex(childPubKey.parentFP).equals("fb080f46"))
        {
            Log.e("通过测试，parentFP:"+childPubKey.parentFP, "JNIUTIL_Test");
        }else
        {
            Log.e("不通过", "JNIUTIL_Test");
        }

    }
}
