package enums;

public enum VariablesMoneda {
	  USD,AED,AFN,ALL,AMD,ANG,AOA,ARS,AUD,AWG,AZN,BAM,BBD,BDT,BGN,BHD,BIF,BMD,BND,BOB,BRL,BSD,BTN,BWP,BYN,
	  BZD,CAD,CDF,CHF,CLP,CNY,COP,CRC,CUP,CVE,CZK,DJF,DKK,DOP,DZD,EGP,ERN,ETB,EUR,FJD,FKP,FOK,GBP,GEL,GGP,
	  GHS,GIP,GMD,GNF,GTQ,GYD,HKD,HNL,HRK,HTG,HUF,IDR,ILS,IMP,IQD,IRR,ISK,JEP,JMD,JOD,JPY,KES,KGS,KHR,KID,
	  KMF,
	  KRW,
	  KWD,
	  KYD,
	  KZT,
	  LAK,
	  LBP,
	  LKR,
	  LRD,
	  LSL,
	  LYD,
	  MAD,
	  MDL,
	  MGA,
	  MKD,
	  MMK,
	  MNT,
	  MOP,
	  MRU,
	  MUR,
	  MVR,
	  MWK,
	  MXN,
	  MYR,
	  MZN,
	  NAD,
	  NGN,
	  NIO,
	  NOK,
	  NPR,
	  NZD,
	  OMR,
	  PAB,
	  PEN,
	  PGK,
	  PHP,
	  PKR,
	  PLN,
	  PYG,
	  QAR,
	  RON,
	  RSD,
	  RUB,
	  RWF,
	  SAR,
	  SBD,
	  SCR,
	  SDG,
	  SEK,
	  SGD,
	  SHP,
	  SLE,
	  SLL,
	  SOS,
	  SRD,
	  SSP,
	  STN,
	  SYP,
	  SZL,
	  THB,
	  TJS,
	  TMT,
	  TND,
	  TOP,
	  TRY,
	  TTD,
	  TWD,
	  TZS,
	  UAH,
	  UGX,
	  UYU,
	  UZS,
	  VES,
	  VND,
	  VUV,
	  XAF,
	  XCD,
	  XDR,
	  XOF,
	  XPF,
	  ZAR,
	  ZMW,
	  ZWL;
	  
		public static String[] monedas() {
		    int states = VariablesMoneda.values().length;
		    String[] names = new String[states];

		    for (int i = 0; i < states; i++) {
		        names[i] = VariablesMoneda.values()[i].name();
		    }
		    return names;
		}
}