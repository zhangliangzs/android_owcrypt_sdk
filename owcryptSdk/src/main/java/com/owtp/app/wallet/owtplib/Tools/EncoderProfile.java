package com.owtp.app.wallet.owtplib.Tools;

public class EncoderProfile
{
         String btcAlphabet="123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz";
         String zecAlphabet       = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz";
         String btcBech32Alphabet = "qpzry9x8gf2tvdw0s3jn54khce6mua7l";
         String ltcAlphabet       = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz";
         String ltcBech32Alphabet = "qpzry9x8gf2tvdw0s3jn54khce6mua7l";
         String bchLegacyAlphabet = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz";
         String bchCashAlphabet   = "qpzry9x8gf2tvdw0s3jn54khce6mua7l";
         String xtzAlphabet       = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz";
         String hcAlphabet        = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz";
         String qtumAlphabet      = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz";
         String dcrdAlphabet      = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz";



    //BTC stuff
    AddressType BTC_mainnetAddressP2PKH=new AddressType("base58", btcAlphabet, "doubleSHA256", "h160", 20,new byte[]{0x00},null);
    AddressType BTC_mainnetAddressP2SH          = new AddressType("base58", btcAlphabet, "doubleSHA256", "h160", 20, new byte[]{0x05},null);
    AddressType  BTC_mainnetAddressBech32V0      =new AddressType("bech32", btcBech32Alphabet, "bc", "h160", 20, null, null);
    AddressType BTC_mainnetPrivateWIF           = new AddressType("base58", btcAlphabet, "doubleSHA256", "", 32, new byte[]{(byte)0x80}, null);
    AddressType BTC_mainnetPrivateWIFCompressed = new AddressType("base58", btcAlphabet, "doubleSHA256", "", 32, new byte[]{(byte)0x80}, new byte []{0x01});
    AddressType BTC_mainnetPublicBIP32          = new AddressType("base58", btcAlphabet, "doubleSHA256", "", 74, new byte[]{0x04, (byte)0x88, (byte)0xB2, 0x1E}, null);
    AddressType BTC_mainnetPrivateBIP32         = new AddressType("base58", btcAlphabet, "doubleSHA256", "", 74, new byte[]{0x04, (byte)0x88, (byte)0xAD, (byte)0xE4}, null);
    AddressType BTC_testnetAddressP2PKH         = new AddressType("base58", btcAlphabet, "doubleSHA256", "h160", 20, new byte[]{0x6F},null);
    AddressType BTC_testnetAddressP2SH          = new AddressType("base58", btcAlphabet, "doubleSHA256", "h160", 20, new byte[]{(byte)0xC4}, null);
    AddressType BTC_testnetAddressBech32V0      = new AddressType("bech32", btcBech32Alphabet, "tb", "h160", 20, null,null);
    AddressType BTC_testnetPrivateWIF           = new AddressType("base58", btcAlphabet, "doubleSHA256", "", 32, new byte[]{(byte)0xEF},null);
    AddressType BTC_testnetPrivateWIFCompressed = new AddressType("base58", btcAlphabet, "doubleSHA256", "", 32, new byte[]{(byte)0xEF}, new byte[]{0x01});
    AddressType BTC_testnetPublicBIP32          = new AddressType("base58", btcAlphabet, "doubleSHA256", "", 74, new byte[]{0x04, 0x35, (byte)0x87, (byte)0xCF}, null);
    AddressType BTC_testnetPrivateBIP32         = new AddressType("base58", btcAlphabet, "doubleSHA256", "", 74, new byte[]{0x04, 0x35, (byte)0x83, (byte)0x94}, null);

    //ZEC stuff
    AddressType ZEC_mainnet_t_AddressP2PKH         =new  AddressType("base58", zecAlphabet, "doubleSHA256", "h160", 20,new byte[]{0x1C,(byte)0xB8}, null);
    AddressType ZEC_mainnet_t_AddressP2SH          =new  AddressType("base58", zecAlphabet, "doubleSHA256", "h160", 20, new byte[]{0x1C,(byte)0xBD}, null);
    AddressType ZEC_testnet_t_AddressP2PKH         =new  AddressType("base58", zecAlphabet, "doubleSHA256", "h160", 20, new byte[]{0x1D,0x25}, null);
    AddressType ZEC_testnet_t_AddressP2SH          =new  AddressType("base58", zecAlphabet, "doubleSHA256", "h160", 20, new byte[]{0x1C,(byte)0xBA}, null);

    //LTC stuff
     AddressType LTC_mainnetAddressP2PKH =new  AddressType("base58", ltcAlphabet, "doubleSHA256", "h160", 20, new byte[]{0x30}, null);
     AddressType LTC_mainnetAddressP2SH          =new  AddressType("base58", ltcAlphabet, "doubleSHA256", "h160", 20, new byte[]{0x05}, null);
     AddressType LTC_mainnetAddressP2SH2         =new AddressType("base58", ltcAlphabet, "doubleSHA256", "h160", 20, new byte[]{0x32}, null);
     AddressType LTC_mainnetAddressBech32V0      =new AddressType("bech32", ltcBech32Alphabet, "ltc", "h160", 20, null, null);
     AddressType LTC_mainnetPrivateWIF           =new AddressType("base58", ltcAlphabet, "doubleSHA256", "", 32, new byte[]{(byte)0xB0}, null);
     AddressType  LTC_mainnetPrivateWIFCompressed =new AddressType("base58", ltcAlphabet, "doubleSHA256", "", 32, new byte[]{(byte)0xB0}, new byte[]{0x01});
     AddressType LTC_mainnetPublicBIP32          =new AddressType("base58", btcAlphabet, "doubleSHA256", "", 74, new byte[]{0x04, (byte)0x88, (byte)0xB2, 0x1E},null);
     AddressType LTC_mainnetPrivateBIP32         = new AddressType("base58", btcAlphabet, "doubleSHA256", "", 74, new byte[]{0x04, (byte)0x88, (byte)0xAD, (byte)0xE4}, null);
     AddressType  LTC_testnetAddressP2PKH         =new AddressType("base58", ltcAlphabet, "doubleSHA256", "h160", 20, new byte[]{(byte)0x6F}, null);
     AddressType  LTC_testnetAddressP2SH          =new AddressType("base58", ltcAlphabet, "doubleSHA256", "h160", 20, new byte[]{(byte)0xC4}, null);
     AddressType   LTC_testnetAddressBech32V0      =new AddressType("bech32", ltcBech32Alphabet, "tltc", "h160", 20, null, null);
     AddressType  LTC_testnetPrivateWIF           =new AddressType("base58", ltcAlphabet, "doubleSHA256", "", 32, new byte[]{(byte)0xEF}, null);
     AddressType LTC_testnetPrivateWIFCompressed =new AddressType("base58", ltcAlphabet, "doubleSHA256", "", 32, new byte[]{(byte)0xEF}, new byte[]{(byte)0x01});
     AddressType LTC_testnetPublicBIP32          =new AddressType("base58", btcAlphabet, "doubleSHA256", "", 74, new byte[]{0x04, 0x35, (byte)0x87, (byte)0xCF},null);
     AddressType  LTC_testnetPrivateBIP32         =new AddressType("base58", btcAlphabet, "doubleSHA256", "", 74, new byte[]{0x04, 0x35, (byte)0x83, (byte)0x94}, null);

    //BCH stuff
      AddressType BCH_mainnetAddressLegacy =new AddressType("base58", bchLegacyAlphabet, "doubleSHA256", "h160", 20, new byte[]{0x00}, null);
      AddressType BCH_mainnetAddressCash   =new AddressType("base32PolyMod", bchCashAlphabet, "bitcoincash", "h160", 21, null, null);

    //XTZ stuff
       AddressType  XTZ_mainnetAddress_tz1   =new AddressType("base58", xtzAlphabet, "doubleSHA256", "blake2b160", 20, new byte[]{0x06, (byte)0xA1, (byte)0x9F}, null);
       AddressType XTZ_mainnetAddress_tz2   =new AddressType("base58", xtzAlphabet, "doubleSHA256", "blake2b160", 20, new byte[]{0x06, (byte)0xA1, (byte)0xA1}, null);
       AddressType  XTZ_mainnetAddress_tz3   =new AddressType("base58", xtzAlphabet, "doubleSHA256", "blake2b160", 20,new byte[]{0x06, (byte)0xA1, (byte)0xA4}, null);
       AddressType  XTZ_mainnetPublic_edpk   =new AddressType("base58", xtzAlphabet, "doubleSHA256", "", 32, new byte[]{0x0D, 0x0F, 0x25, (byte)0xD9},null);
       AddressType XTZ_mainnetPrivate_edsk  =new AddressType("base58", xtzAlphabet, "doubleSHA256", "", 64, new byte[]{0x0D, 0x0F, 0x3A, 0x07}, null);
       AddressType XTZ_mainnetPrivate_edsk2 =new AddressType("base58", xtzAlphabet, "doubleSHA256", "", 32, new byte[]{0x2B, (byte)0xF6, 0x4E, 0x07}, null);
       AddressType XTZ_mainnetPrivate_spsk  =new AddressType("base58", xtzAlphabet, "doubleSHA256", "", 32, new byte[]{0x11, (byte)0xA2, (byte)0xE0, (byte)0xC9}, null);
       AddressType XTZ_mainnetPrivate_p2sk  =new AddressType("base58", xtzAlphabet, "doubleSHA256", "blake2b160", 32, new byte[]{0x10, 0x51, (byte)0xEE, (byte)0xBD}, null);
    //HC stuff
     AddressType  HC_mainnetPublicAddress =new AddressType("base58", hcAlphabet, "doubleBlake256", "h160", 20, new byte[]{0x09, 0x7F}, null);
    //ETH stuff
        AddressType ETH_mainnetPublicAddress =new AddressType("eip55", "", "keccak256", "", 20, null, null);

    //QTUM stuff
      AddressType QTUM_mainnetAddressP2PKH=new AddressType("base58", qtumAlphabet, "doubleSHA256", "h160", 20, new byte[]{0x3A}, null);
      AddressType QTUM_mainnetPrivateWIF=new AddressType("base58", qtumAlphabet, "doubleSHA256", "", 32, new byte[]{(byte)0x80}, null);
      AddressType QTUM_mainnetPrivateWIFCompressed =new AddressType("base58", qtumAlphabet, "doubleSHA256", "", 32, new byte[]{(byte)0x80}, new byte[]{0x01});
      AddressType  QTUM_mainnetPublicBIP32=new AddressType("base58", qtumAlphabet, "doubleSHA256", "", 74, new byte[]{0x04, (byte)0x88, (byte)0xB2, 0x1E}, null);
      AddressType  QTUM_mainnetPrivateBIP32 =new AddressType("base58", qtumAlphabet, "doubleSHA256", "", 74, new byte[]{0x04, (byte)0x88, (byte)0xAD, (byte)0xE4}, null);
      AddressType QTUM_testnetAddressP2PKH =new AddressType("base58", qtumAlphabet, "doubleSHA256", "h160", 20, new byte[]{0x78}, null);
      AddressType  QTUM_testnetAddressP2S =new AddressType("base58", qtumAlphabet, "doubleSHA256", "h160", 20, new byte[]{0x6E}, null);
      AddressType  QTUM_testnetPrivateWIF =new AddressType("base58", qtumAlphabet, "doubleSHA256", "", 32, new byte[]{(byte)0xEF}, null);
      AddressType  QTUM_testnetPrivateWIFCompressed =new AddressType("base58", qtumAlphabet, "doubleSHA256", "", 32, new byte[]{(byte)0xEF}, new byte[]{0x01});
      AddressType QTUM_testnetPublicBIP32 =new AddressType("base58", qtumAlphabet, "doubleSHA256", "", 74, new byte[]{0x04, 0x35, (byte)0x87, (byte)0xCF},null);
      AddressType QTUM_testnetPrivateBIP32 =new AddressType("base58", qtumAlphabet, "doubleSHA256", "", 74, new byte[]{0x04, 0x35, (byte)0x83, (byte)0x94}, null);

    //DCRD
     AddressType  DCRD_mainnetAddressP2PKH =new  AddressType("base58", dcrdAlphabet, "doubleBlake256", "ripemd160", 20, new byte[]{0x07, 0x3f}, null);//PubKeyHashAddrID, stars with Ds
     AddressType  DCRD_mainnetAddressP2PK =new  AddressType("base58", dcrdAlphabet, "doubleBlake256", "ripemd160", 20, new byte[]{0x13, (byte)0x86}, null);//PubKeyAddrID,stars with Dk
     AddressType  DCRD_mainnetAddressPKHEdwards =new  AddressType("base58", dcrdAlphabet, "doubleBlake256", "ripemd160", 20, new byte[]{0x07, 0x1f}, null);//PKHEdwardsAddrID,starts with De
     AddressType   DCRD_mainnetAddressPKHSchnorr  =new  AddressType("base58", dcrdAlphabet, "doubleBlake256", "ripemd160", 20, new byte[]{0x07, 0x01}, null);//PKHSchnorrAddrID,starts with DS
     AddressType  DCRD_mainnetAddressP2SH  =new  AddressType("base58", dcrdAlphabet, "doubleBlake256", "ripemd160", 20, new byte[]{0x07, 0x1a}, null); //ScriptHashAddrID,starts with Dc
     AddressType DCRD_mainnetAddressPrivate =new  AddressType("base58", dcrdAlphabet, "doubleBlake256", "ripemd160", 20, new byte[]{0x22, (byte)0xde}, null); // PrivateKeyID, starts with Pm

     AddressType  DCRD_testnetAddressP2PKH=new  AddressType("base58", dcrdAlphabet, "doubleBlake256", "ripemd160", 20, new byte[]{0x0f, 0x21}, null); //PubKeyHashAddrID,starts with Ts
     AddressType  DCRD_testnetAddressP2PK =new  AddressType("base58", dcrdAlphabet, "doubleBlake256", "ripemd160", 20, new byte[]{0x28, (byte)0xf7}, null); //PubKeyAddrID, starts with Tk
     AddressType  DCRD_testnetAddressPKHEdwards    =new  AddressType("base58", dcrdAlphabet, "doubleBlake256", "ripemd160", 20, new byte[]{0x0f, 0x01}, null);//PKHEdwardsAddrID,starts with Te
     AddressType  DCRD_testnetAddressP2PKHSchnorr  =new  AddressType("base58", dcrdAlphabet, "doubleBlake256", "ripemd160", 20, new byte[]{0x0e, (byte)0xe3}, null);//PKHSchnorrAddrID,starts with TS
     AddressType DCRD_testnetAddressP2SH          =new  AddressType("base58", dcrdAlphabet, "doubleBlake256", "ripemd160", 20, new byte[]{0x0e, (byte)0xfc}, null); //ScriptHashAddrID,starts with Tc
     AddressType  DCRD_testnetAddressPrivate       =new  AddressType("base58", dcrdAlphabet, "doubleBlake256", "ripemd160", 20, new byte[]{0x23, 0x0e}, null); //PrivateKeyID,starts with Pt

      AddressType  DCRD_simnetAddressP2PKH          =new  AddressType("base58", dcrdAlphabet, "doubleBlake256", "ripemd160", 20,new byte[]{0x0e, (byte)0x91}, null); //PubKeyHashAddrID,starts with Ss
      AddressType  DCRD_simnetAddressP2PK           =new  AddressType("base58", dcrdAlphabet, "doubleBlake256", "ripemd160", 20, new byte[]{0x27, 0x6f}, null); //PubKeyAddrID,starts with Sk
     AddressType  DCRD_simnetAddressPKHEdwards     =new  AddressType("base58", dcrdAlphabet, "doubleBlake256", "ripemd160", 20, new byte[]{0x0e, 0x71}, null);//PKHEdwardsAddrID,starts with Se
     AddressType  DCRD_simnetAddressPKHSchnorr     =new  AddressType("base58", dcrdAlphabet, "doubleBlake256", "ripemd160", 20, new byte[]{0x0e, 0x53}, null);//PKHSchnorrAddrID,starts with SS
     AddressType   DCRD_simnetAddressP2SH           =new  AddressType("base58", dcrdAlphabet, "doubleBlake256", "ripemd160", 20, new byte[]{0x0e, 0x6c}, null);//ScriptHashAddrID,starts with Sc
     AddressType   DCRD_simnetAddressPrivate        =new  AddressType("base58", dcrdAlphabet, "doubleBlake256", "ripemd160", 20, new byte[]{0x23, 0x07}, null);//PrivateKeyID, starts with
}