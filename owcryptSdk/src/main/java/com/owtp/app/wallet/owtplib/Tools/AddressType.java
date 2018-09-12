package com.owtp.app.wallet.owtplib.Tools;

public class AddressType {
    public String encodeType;    //编码类型
    public String alphabet ;   // string //码表
    public String checksumType; //string //checksum类型(prefix string when encode type is base32PolyMod)
    public String hashType ;    //string //地址hash类型，传入数据为公钥时起效
    public int  hashLen ;     //int    //编码前的数据长度
    public byte[] prefix ;    //   //数据前面的填充
    public  byte[] suffix;     //  []byte //数据后面的填充
    public AddressType(String encodeType,String alphabet,String checksumType,String hashType,int hashLen,byte[]prefix, byte[]suffix)
    {
        this.encodeType=encodeType;
        this.alphabet=alphabet;
        this.checksumType=checksumType;
        this.hashType=hashType;
        this.hashLen=hashLen;
        this.prefix=prefix;
        this.suffix=suffix;
    }

    public String getEncodeType() {
        return encodeType;
    }

    public void setEncodeType(String encodeType) {
        this.encodeType = encodeType;
    }

    public String getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(String alphabet) {
        this.alphabet = alphabet;
    }

    public String getChecksumType() {
        return checksumType;
    }

    public void setChecksumType(String checksumType) {
        this.checksumType = checksumType;
    }

    public String getHashType() {
        return hashType;
    }

    public void setHashType(String hashType) {
        this.hashType = hashType;
    }

    public int getHashLen() {
        return hashLen;
    }

    public void setHashLen(int hashLen) {
        this.hashLen = hashLen;
    }

    public byte[] getPrefix() {
        return prefix;
    }

    public void setPrefix(byte[] prefix) {
        this.prefix = prefix;
    }

    public byte[] getSuffix() {
        return suffix;
    }

    public void setSuffix(byte[] suffix) {
        this.suffix = suffix;
    }
}
