package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: oyy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oyy {
    final ApplicationInfo a;
    final Context b;
    final XmlPullParser c;
    private final TypedValue d = new TypedValue();

    public oyy(ApplicationInfo applicationInfo, Context context, XmlPullParser xmlPullParser) {
        this.a = applicationInfo;
        this.b = context;
        this.c = xmlPullParser;
    }

    private final double a(String str, Bundle bundle) {
        String string = bundle.getString("factor");
        if (string != null) {
            try {
                double parseDouble = Double.parseDouble(string);
                if (parseDouble > 0.0d && parseDouble <= 1.0d) {
                    return parseDouble;
                }
                throw b(string.length() == 0 ? new String("Factor not in range: Must be > 0 and <= 1 ") : "Factor not in range: Must be > 0 and <= 1 ".concat(string));
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder(string.length() + 47);
                sb.append("Parameter factor=");
                sb.append(string);
                sb.append(" must be a number > 0 and <= 1");
                throw b(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder(str.length() + 39);
            sb2.append("Section feature ");
            sb2.append(str);
            sb2.append(" needs parameter factor");
            throw b(sb2.toString());
        }
    }

    private final int b(AttributeSet attributeSet, int i) {
        int a2 = a(attributeSet, i);
        a(attributeSet.getAttributeName(i), a2, true);
        return a2;
    }

    private final String c(AttributeSet attributeSet, int i) {
        int attributeResourceValue = attributeSet.getAttributeResourceValue(i, -1);
        if (attributeResourceValue != -1) {
            return a(attributeSet.getAttributeName(i), attributeResourceValue, false);
        }
        return attributeSet.getAttributeValue(i);
    }

    private final oyx b(String str) {
        throw new oyx(this.b.getPackageName(), this.c, str);
    }

    private final int a(AttributeSet attributeSet, int i) {
        int attributeResourceValue = attributeSet.getAttributeResourceValue(i, -1);
        if (attributeResourceValue != -1) {
            return attributeResourceValue;
        }
        throw b(String.valueOf(attributeSet.getAttributeName(i)).concat(" must be a resource reference."));
    }

    private final oyx a(String str, Throwable th) {
        throw new oyx(this.b.getPackageName(), this.c, str, th);
    }

    /* access modifiers changed from: package-private */
    public final String a(String str, int i, boolean z) {
        if (i == 0) {
            return null;
        }
        try {
            this.b.getResources().getValue(i, this.d, true);
            if (!z) {
                if (this.d.changingConfigurations != 0) {
                    throw b(String.valueOf(str).concat(" must not change between configurations"));
                }
            }
            int i2 = this.d.type;
            if (i2 == 0) {
                return null;
            }
            if (i2 == 3) {
                return this.d.string.toString();
            }
            throw b(String.valueOf(str).concat(" does not refer to a string resource"));
        } catch (Resources.NotFoundException e) {
            throw a(String.valueOf(str).concat(" resource not found"), (Throwable) e);
        } catch (NullPointerException e2) {
            throw a(String.valueOf(str).concat(" getStringResource threw a NPE"), (Throwable) e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01f2, code lost:
        r10 = r8.getAttributeBooleanValue(r14, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01f8, code lost:
        r13 = r8.getAttributeIntValue(r14, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01fe, code lost:
        r15 = r8.getAttributeBooleanValue(r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0204, code lost:
        r7 = r8.getAttributeIntValue(r14, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x020a, code lost:
        if (r7 == 0) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x020d, code lost:
        if (r7 == 1) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0210, code lost:
        if (r7 == 2) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0213, code lost:
        if (r7 == 3) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0216, code lost:
        if (r7 != 4) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0218, code lost:
        r2 = "date";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0221, code lost:
        throw b("Invalid section format");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0222, code lost:
        r2 = "url";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0224, code lost:
        r2 = "rfc822";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0226, code lost:
        r2 = "html";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0229, code lost:
        r2 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r8 = new defpackage.oyw(r1.c);
        r11 = new java.util.ArrayList();
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x022c, code lost:
        r27 = c(r8, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0230, code lost:
        r14 = r14 + 1;
        r12 = r31;
        r5 = r32;
        r3 = r33;
        r7 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x023c, code lost:
        if (r27 == null) goto L_0x04b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x023e, code lost:
        r7 = com.google.android.gms.appdatasearch.RegisterSectionInfo.a(r27);
        r7.a = r2;
        r7.b = r15;
        r7.c = r13;
        r7.d = r10;
        r7.e = r11;
        r7.f = r4;
        r4 = new java.util.HashSet();
        r8 = new defpackage.oyw(r1.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x025e, code lost:
        if (r8.a() == false) goto L_0x04a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0260, code lost:
        r10 = r8.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x026a, code lost:
        if ("SectionFeature".equals(r10) == false) goto L_0x0480;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x026c, code lost:
        r11 = android.util.Xml.asAttributeSet(r1.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0274, code lost:
        if (r11 == null) goto L_0x047a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0276, code lost:
        r13 = "";
        r12 = 0;
        r14 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x027f, code lost:
        if (r12 < r11.getAttributeCount()) goto L_0x043b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0281, code lost:
        r11 = new defpackage.oyw(r1.c);
        r12 = new android.os.Bundle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0291, code lost:
        if (r11.a() == false) goto L_0x033b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0293, code lost:
        r15 = r11.b();
        r27 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x029f, code lost:
        if ("FeatureParam".equals(r15) == false) goto L_0x0318;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02a1, code lost:
        r8 = android.util.Xml.asAttributeSet(r1.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02a7, code lost:
        if (r8 == null) goto L_0x0312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r8.a() != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02a9, code lost:
        r31 = r11;
        r37 = r13;
        r11 = null;
        r13 = null;
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02b0, code lost:
        r38 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02b6, code lost:
        if (r15 >= r8.getAttributeCount()) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02b8, code lost:
        r7 = r8.getAttributeName(r15);
        r39 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02c4, code lost:
        if ("paramName".equals(r7) != false) goto L_0x02ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02cc, code lost:
        if ("paramValue".equals(r7) != false) goto L_0x02e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02ce, code lost:
        r2 = java.lang.String.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02d6, code lost:
        if (r2.length() != 0) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02d8, code lost:
        r2 = new java.lang.String("Invalid attribute name ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r3 = r1.a.packageName;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02de, code lost:
        r2 = "Invalid attribute name ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02e6, code lost:
        throw b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02e7, code lost:
        r13 = c(r8, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02ec, code lost:
        r11 = r8.getAttributeValue(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02f0, code lost:
        r15 = r15 + 1;
        r7 = r38;
        r4 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02f7, code lost:
        r39 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02f9, code lost:
        if (r11 == null) goto L_0x030b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02fb, code lost:
        if (r13 == null) goto L_0x030b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02fd, code lost:
        r12.putString(r11, r13);
        r8 = r27;
        r11 = r31;
        r13 = r37;
        r7 = r38;
        r4 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        return new defpackage.oyv(r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0311, code lost:
        throw b("Both name and value must be specified");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0317, code lost:
        throw b("No attributes specified");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0318, code lost:
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r15).length() + 57);
        r3.append(r26);
        r3.append(r15);
        r3.append(" inside SectionFeature; expected FeatureParam");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x033a, code lost:
        throw b(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x033b, code lost:
        r39 = r4;
        r38 = r7;
        r27 = r8;
        r37 = r13;
        r4 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0346, code lost:
        if (r14 == -1) goto L_0x0434;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0349, code lost:
        if (r14 != 1) goto L_0x0362;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r13 = r8.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x034f, code lost:
        if (r12.isEmpty() == false) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0351, code lost:
        r8 = defpackage.dud.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0361, code lost:
        throw b("Section feature match_global_nicknames does not take set");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0365, code lost:
        if (r14 != 2) goto L_0x037e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:?, code lost:
        r10 = a("demote_common_words", r12);
        r8 = new com.google.android.gms.appdatasearch.Feature(2);
        r8.a("factor", java.lang.String.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        r5 = "Invalid tag ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x037f, code lost:
        if (r14 != 3) goto L_0x039e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0385, code lost:
        if ("rfc822".equals(r2) == false) goto L_0x039e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0387, code lost:
        r10 = a("demote_rfc822_hostnames", r12);
        r8 = new com.google.android.gms.appdatasearch.Feature(3);
        r8.a("factor", java.lang.String.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x039f, code lost:
        if (r14 != 4) goto L_0x03b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03a5, code lost:
        if ("url".equals(r2) == false) goto L_0x03b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03a7, code lost:
        r8 = defpackage.dud.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r3.equals(r13) == false) goto L_0x06af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03b1, code lost:
        if (r14 != 5) goto L_0x03bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03b3, code lost:
        r8 = defpackage.dud.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03bd, code lost:
        if (r14 != 6) goto L_0x0405;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03bf, code lost:
        r8 = defpackage.dud.a("AddressAnnotator", "DateAnnotator", "PhoneAnnotator", "UrlAnnotator");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03da, code lost:
        r11 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03e6, code lost:
        if (r11.contains(java.lang.Integer.valueOf(r8.a)) != false) goto L_0x03fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03e8, code lost:
        r10 = r38;
        r10.a(r8);
        r11.add(java.lang.Integer.valueOf(r8.a));
        r26 = r4;
        r7 = r10;
        r4 = r11;
        r8 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        r13 = " inside Corpus; expected Section or GlobalSearchCorpus";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0404, code lost:
        throw b("Duplicate feature defined for section");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0405, code lost:
        r5 = new java.lang.StringBuilder((java.lang.String.valueOf(r37).length() + 60) + r2.length());
        r5.append("Invalid section feature of type ");
        r5.append(r37);
        r5.append(" inside section with format ");
        r5.append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0433, code lost:
        throw b(r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x043a, code lost:
        throw b("No type specified.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x043b, code lost:
        r16 = r4;
        r27 = r8;
        r4 = r26;
        r8 = r7;
        r7 = r11.getAttributeName(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x044f, code lost:
        if ("featureType".equals(r7) != false) goto L_0x046a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0451, code lost:
        r2 = java.lang.String.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0459, code lost:
        if (r2.length() != 0) goto L_0x0461;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x045b, code lost:
        r2 = new java.lang.String("Invalid attribute name ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0461, code lost:
        r2 = "Invalid attribute name ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0469, code lost:
        throw b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x046a, code lost:
        r14 = r11.getAttributeIntValue(r12, r14);
        r12 = r12 + 1;
        r26 = r4;
        r13 = r7;
        r7 = r8;
        r4 = r16;
        r8 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x047f, code lost:
        throw b("No attributes specified");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0480, code lost:
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r10).length() + 52);
        r3.append(r26);
        r3.append(r10);
        r3.append(r34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04a4, code lost:
        throw b(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04a5, code lost:
        r4 = r26;
        r3 = r33;
        r3.a(r7.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r14 = android.util.Xml.asAttributeSet(r1.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04b9, code lost:
        throw b("No section ID specified.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04bf, code lost:
        throw b("No attributes specified");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04c0, code lost:
        r28 = r2;
        r29 = r4;
        r32 = r5;
        r30 = r11;
        r4 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04d1, code lost:
        if ("GlobalSearchCorpus".equals(r7) != false) goto L_0x0547;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04d9, code lost:
        if ("IMECorpus".equals(r7) == false) goto L_0x0524;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04db, code lost:
        r5 = new defpackage.oyw(r1.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04e8, code lost:
        if (r5.a() == false) goto L_0x0518;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r14 == null) goto L_0x06a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04ea, code lost:
        r7 = r5.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04f4, code lost:
        if ("IMESection".equals(r7) == false) goto L_0x04f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04f7, code lost:
        r5 = new java.lang.StringBuilder(java.lang.String.valueOf(r7).length() + 50);
        r5.append(r4);
        r5.append(r7);
        r5.append(" inside IMECorpus; expected IMESection");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0517, code lost:
        throw b(r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0518, code lost:
        r26 = r4;
        r2 = r28;
        r4 = r29;
        r11 = r30;
        r5 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0524, code lost:
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r7).length() + 66);
        r3.append(r4);
        r3.append(r7);
        r3.append(r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0546, code lost:
        throw b(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0547, code lost:
        r2 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0549, code lost:
        if (r32 != false) goto L_0x0694;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        r23 = r2;
        r18 = r3;
        r20 = r4;
        r19 = r10;
        r22 = r12;
        r24 = "searchEnabled";
        r2 = false;
        r3 = 0;
        r4 = 0;
        r7 = true;
        r10 = false;
        r12 = null;
        r15 = null;
        r21 = null;
        r17 = r8;
        r8 = "0";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x054b, code lost:
        r7 = android.util.Xml.asAttributeSet(r1.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0553, code lost:
        if (r7 == null) goto L_0x059c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0555, code lost:
        r8 = 0;
        r10 = false;
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x055c, code lost:
        if (r8 >= r7.getAttributeCount()) goto L_0x0599;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x055e, code lost:
        r12 = r7.getAttributeName(r8);
        r14 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0568, code lost:
        if (r14.equals(r12) != false) goto L_0x0590;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0570, code lost:
        if ("allowShortcuts".equals(r12) != false) goto L_0x058b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0572, code lost:
        r2 = java.lang.String.valueOf(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        r25 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x057a, code lost:
        if (r2.length() != 0) goto L_0x0582;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x057c, code lost:
        r2 = new java.lang.String("Invalid attribute name ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0582, code lost:
        r2 = "Invalid attribute name ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x058a, code lost:
        throw b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x058b, code lost:
        r10 = r7.getAttributeBooleanValue(r8, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0590, code lost:
        r11 = r7.getAttributeBooleanValue(r8, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0594, code lost:
        r8 = r8 + 1;
        r24 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0599, code lost:
        r14 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x059c, code lost:
        r14 = r24;
        r10 = false;
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        if (r3 >= r14.getAttributeCount()) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05a0, code lost:
        r7 = new int[defpackage.dtb.a()];
        r8 = new defpackage.oyw(r1.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05b1, code lost:
        if (r8.a() == false) goto L_0x065f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05b3, code lost:
        r12 = r8.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x05bd, code lost:
        if ("GlobalSearchSection".equals(r12) == false) goto L_0x063e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x05bf, code lost:
        r12 = android.util.Xml.asAttributeSet(r8.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x05c5, code lost:
        if (r12 == null) goto L_0x0638;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x05c7, code lost:
        r13 = 0;
        r15 = -1;
        r16 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x05cb, code lost:
        r25 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x05d1, code lost:
        if (r13 >= r12.getAttributeCount()) goto L_0x0615;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        r13 = r14.getAttributeName(r3);
        r26 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x05d3, code lost:
        r2 = r12.getAttributeName(r13);
        r26 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x05df, code lost:
        if ("sectionType".equals(r2) != false) goto L_0x0609;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x05e7, code lost:
        if ("sectionContent".equals(r2) != false) goto L_0x0602;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05e9, code lost:
        r2 = java.lang.String.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x05f1, code lost:
        if (r2.length() != 0) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x05f3, code lost:
        r2 = new java.lang.String("Invalid attribute name ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x05f9, code lost:
        r2 = "Invalid attribute name ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0601, code lost:
        throw b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008c, code lost:
        if ("corpusId".equals(r13) != false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0602, code lost:
        r16 = b(r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0609, code lost:
        r15 = r12.getAttributeIntValue(r13, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x060e, code lost:
        r13 = r13 + 1;
        r2 = r25;
        r8 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0615, code lost:
        r26 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0618, code lost:
        if (r15 == -1) goto L_0x0631;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x061a, code lost:
        if (r15 < 0) goto L_0x062a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0620, code lost:
        if (r15 > defpackage.dtb.a()) goto L_0x062a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0622, code lost:
        r7[r15] = r16;
        r2 = r25;
        r8 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0630, code lost:
        throw b("Section ID out of range; badly formed XML?");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0637, code lost:
        throw b("No sectionType specified");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x063d, code lost:
        throw b("No attributes specified");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x063e, code lost:
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r12).length() + 68);
        r3.append(r4);
        r3.append(r12);
        r3.append(" inside GlobalSearchCorpus; expected GlobalSearchSection");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x065e, code lost:
        throw b(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x065f, code lost:
        r25 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0661, code lost:
        if (r11 == false) goto L_0x0684;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0663, code lost:
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        if ("corpusVersion".equals(r13) != false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0668, code lost:
        if (r10 != false) goto L_0x066b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x066b, code lost:
        r2.add(defpackage.dsz.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0672, code lost:
        r5 = new com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig(r7, (com.google.android.gms.appdatasearch.Feature[]) r2.toArray(new com.google.android.gms.appdatasearch.Feature[r2.size()]));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0684, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0685, code lost:
        r3.d = r5;
        r26 = r4;
        r24 = r14;
        r2 = r28;
        r4 = r29;
        r11 = r30;
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x069a, code lost:
        throw b("Duplicate element GlobalSearchCorpus");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x06a1, code lost:
        throw b("No content provider URI specified.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x06a8, code lost:
        throw b("No corpus ID specified.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x06ae, code lost:
        throw b("No attributes specified");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x06af, code lost:
        r18 = r3;
        r20 = r4;
        r4 = r5;
        r17 = r8;
        r19 = r10;
        r30 = r11;
        r22 = r12;
        r14 = "searchEnabled";
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x06c5, code lost:
        if (r2.equals(r13) == false) goto L_0x07a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x06c7, code lost:
        if (r22 != null) goto L_0x07a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x06c9, code lost:
        r3 = android.util.Xml.asAttributeSet(r1.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x06cf, code lost:
        if (r3 == null) goto L_0x079b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x06d1, code lost:
        r36 = r1.a.icon;
        r4 = 0;
        r5 = true;
        r34 = 0;
        r35 = 0;
        r37 = null;
        r38 = null;
        r39 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009c, code lost:
        if ("contentProviderUri".equals(r13) != false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x06e7, code lost:
        if (r4 >= r3.getAttributeCount()) goto L_0x0768;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x06e9, code lost:
        r7 = r3.getAttributeName(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x06f1, code lost:
        if (r14.equals(r7) != false) goto L_0x0760;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x06f9, code lost:
        if ("searchLabel".equals(r7) != false) goto L_0x0759;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0701, code lost:
        if ("settingsDescription".equals(r7) != false) goto L_0x0752;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0709, code lost:
        if ("defaultIntentAction".equals(r7) != false) goto L_0x074d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0711, code lost:
        if ("defaultIntentData".equals(r7) != false) goto L_0x0748;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0719, code lost:
        if ("defaultIntentActivity".equals(r7) != false) goto L_0x0743;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0721, code lost:
        if ("globalSearchIcon".equals(r7) != false) goto L_0x073c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0723, code lost:
        r2 = java.lang.String.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x072b, code lost:
        if (r2.length() != 0) goto L_0x0733;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x072d, code lost:
        r2 = new java.lang.String("Invalid attribute name ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0733, code lost:
        r2 = "Invalid attribute name ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a4, code lost:
        if ("trimmable".equals(r13) != false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x073b, code lost:
        throw b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x073c, code lost:
        r36 = a(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0743, code lost:
        r39 = c(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0748, code lost:
        r38 = c(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x074d, code lost:
        r37 = c(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0752, code lost:
        r35 = b(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0759, code lost:
        r34 = b(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0760, code lost:
        r5 = r3.getAttributeBooleanValue(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0764, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0768, code lost:
        if (r34 == 0) goto L_0x0794;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x076a, code lost:
        if (r5 == false) goto L_0x0785;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x076c, code lost:
        r31 = new com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo(r42, (java.lang.String) null, r34, r35, r36, r37, r38, r39);
        r8 = r17;
        r3 = r18;
        r10 = r19;
        r4 = r20;
        r11 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0785, code lost:
        r8 = r17;
        r3 = r18;
        r10 = r19;
        r4 = r20;
        r11 = r30;
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x079a, code lost:
        throw b("No label specified");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x07a0, code lost:
        throw b("No attributes specified");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x07a7, code lost:
        throw b("Duplicate element GlobalSearch");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ac, code lost:
        if ("schemaOrgType".equals(r13) != false) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x07a8, code lost:
        r5 = new java.lang.StringBuilder(java.lang.String.valueOf(r13).length() + 66);
        r5.append(r4);
        r5.append(r13);
        r5.append(" inside ");
        r5.append(r20);
        r5.append(r19);
        r5.append(r18);
        r5.append(" or ");
        r5.append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x07e1, code lost:
        throw b(r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x07e2, code lost:
        r2 = r1.c.getName();
        r6 = new java.lang.StringBuilder(java.lang.String.valueOf(r2).length() + 41);
        r6.append("Invalid root tag ");
        r6.append(r2);
        r6.append(r10);
        r6.append(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x080f, code lost:
        throw b(r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
        if ("semanticallySearchable".equals(r13) != false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bc, code lost:
        if ("documentMaxAgeSecs".equals(r13) != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c4, code lost:
        if ("perAccountTemplate".equals(r13) != false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c6, code lost:
        r2 = java.lang.String.valueOf(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ce, code lost:
        if (r2.length() != 0) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d0, code lost:
        r2 = new java.lang.String("Invalid attribute name ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d6, code lost:
        r2 = "Invalid attribute name ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00de, code lost:
        throw b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00df, code lost:
        r2 = r14.getAttributeBooleanValue(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e4, code lost:
        r4 = r14.getAttributeIntValue(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e9, code lost:
        r10 = r14.getAttributeBooleanValue(r3, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ef, code lost:
        r15 = c(r14, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f4, code lost:
        r7 = r14.getAttributeBooleanValue(r3, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fa, code lost:
        r5 = c(r14, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fe, code lost:
        if (r5 == null) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0100, code lost:
        r12 = android.net.Uri.parse(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0106, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0108, code lost:
        r8 = c(r14, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010e, code lost:
        r21 = c(r14, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0112, code lost:
        r3 = r3 + 1;
        r13 = r25;
        r5 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011a, code lost:
        r26 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011c, code lost:
        if (r21 == null) goto L_0x06a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011e, code lost:
        if (r12 == null) goto L_0x069b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0120, code lost:
        r3 = com.google.android.gms.appdatasearch.RegisterCorpusInfo.a(r21);
        r3.a = r8;
        r3.b = r12;
        r3.e = r7;
        r3.h = r15;
        r3.i = r10;
        r3.j = r4;
        r4 = new defpackage.oyw(r1.c);
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013c, code lost:
        if (r4.a() != false) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013e, code lost:
        r11.add(new defpackage.oyu(r3.a(), r2));
        r8 = r17;
        r3 = r18;
        r10 = r19;
        r4 = r20;
        r12 = r22;
        r2 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015a, code lost:
        r7 = r4.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0164, code lost:
        if ("Section".equals(r7) == false) goto L_0x04c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0166, code lost:
        r7 = " inside Section; expected SectionFeature";
        r8 = android.util.Xml.asAttributeSet(r1.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x016e, code lost:
        if (r8 == null) goto L_0x04ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0170, code lost:
        r12 = "plain";
        r28 = r2;
        r29 = r4;
        r30 = r11;
        r2 = r12;
        r4 = null;
        r10 = false;
        r11 = null;
        r13 = 1;
        r14 = 0;
        r15 = false;
        r27 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0181, code lost:
        r31 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0187, code lost:
        r32 = r5;
        r33 = r3;
        r34 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0191, code lost:
        if (r14 >= r8.getAttributeCount()) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r12 = r8.getAttributeName(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x019d, code lost:
        if ("sectionId".equals(r12) != false) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a5, code lost:
        if ("sectionFormat".equals(r12) != false) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ad, code lost:
        if ("noIndex".equals(r12) != false) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b5, code lost:
        if ("sectionWeight".equals(r12) != false) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01bd, code lost:
        if ("indexPrefixes".equals(r12) != false) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c5, code lost:
        if ("subsectionSeparator".equals(r12) != false) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r10 = "; expected ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01cd, code lost:
        if ("schemaOrgProperty".equals(r12) != false) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01cf, code lost:
        r2 = java.lang.String.valueOf(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01d7, code lost:
        if (r2.length() != 0) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01d9, code lost:
        r2 = new java.lang.String("Invalid attribute name ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01df, code lost:
        r2 = "Invalid attribute name ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e7, code lost:
        throw b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01e8, code lost:
        r4 = c(r8, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01ed, code lost:
        r11 = c(r8, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r1.c.getName().equals(r4) == false) goto L_0x07e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.oyv a(java.lang.String r42) {
        /*
            r41 = this;
            r1 = r41
            java.lang.String r2 = "GlobalSearch"
            java.lang.String r3 = "Corpus"
            java.lang.String r4 = "AppDataSearch"
        L_0x0008:
            r6 = 1
            org.xmlpull.v1.XmlPullParser r8 = r1.c     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r8 = r8.next()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r8 == r6) goto L_0x081c
            r9 = 2
            if (r8 != r9) goto L_0x0810
            org.xmlpull.v1.XmlPullParser r8 = r1.c     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r8 = r8.getName()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            boolean r8 = r8.equals(r4)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r10 = "; expected "
            if (r8 == 0) goto L_0x07e2
            oyw r8 = new oyw     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            org.xmlpull.v1.XmlPullParser r11 = r1.c     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r8.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r11.<init>()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r12 = 0
        L_0x002f:
            boolean r13 = r8.a()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r13 != 0) goto L_0x003f
            oyv r2 = new oyv     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            android.content.pm.ApplicationInfo r3 = r1.a     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r3 = r3.packageName     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r2.<init>(r11, r12)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            return r2
        L_0x003f:
            java.lang.String r13 = r8.b()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            boolean r14 = r3.equals(r13)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r15 = "searchEnabled"
            java.lang.String r5 = "Invalid tag "
            java.lang.String r9 = "No attributes specified"
            java.lang.String r6 = "Invalid attribute name "
            if (r14 == 0) goto L_0x06af
            java.lang.String r13 = " inside Corpus; expected Section or GlobalSearchCorpus"
            org.xmlpull.v1.XmlPullParser r14 = r1.c     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            android.util.AttributeSet r14 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r14 == 0) goto L_0x06a9
            java.lang.String r17 = "0"
            r23 = r2
            r18 = r3
            r20 = r4
            r19 = r10
            r22 = r12
            r24 = r15
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = 1
            r10 = 0
            r12 = 0
            r15 = 0
            r21 = 0
            r40 = r17
            r17 = r8
            r8 = r40
        L_0x0078:
            r25 = r13
            int r13 = r14.getAttributeCount()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r3 >= r13) goto L_0x011a
            java.lang.String r13 = r14.getAttributeName(r3)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r26 = r5
            java.lang.String r5 = "corpusId"
            boolean r5 = r5.equals(r13)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r5 != 0) goto L_0x010e
            java.lang.String r5 = "corpusVersion"
            boolean r5 = r5.equals(r13)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r5 != 0) goto L_0x0108
            java.lang.String r5 = "contentProviderUri"
            boolean r5 = r5.equals(r13)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r5 != 0) goto L_0x00fa
            java.lang.String r5 = "trimmable"
            boolean r5 = r5.equals(r13)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r5 != 0) goto L_0x00f4
            java.lang.String r5 = "schemaOrgType"
            boolean r5 = r5.equals(r13)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r5 != 0) goto L_0x00ef
            java.lang.String r5 = "semanticallySearchable"
            boolean r5 = r5.equals(r13)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r5 != 0) goto L_0x00e9
            java.lang.String r5 = "documentMaxAgeSecs"
            boolean r5 = r5.equals(r13)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r5 != 0) goto L_0x00e4
            java.lang.String r5 = "perAccountTemplate"
            boolean r5 = r5.equals(r13)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r5 != 0) goto L_0x00df
            java.lang.String r2 = java.lang.String.valueOf(r13)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r3 = r2.length()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r3 != 0) goto L_0x00d6
            java.lang.String r2 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r2.<init>(r6)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            goto L_0x00da
        L_0x00d6:
            java.lang.String r2 = r6.concat(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x00da:
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x00df:
            boolean r2 = r14.getAttributeBooleanValue(r3, r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            goto L_0x0112
        L_0x00e4:
            int r4 = r14.getAttributeIntValue(r3, r4)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            goto L_0x0112
        L_0x00e9:
            boolean r5 = r14.getAttributeBooleanValue(r3, r10)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r10 = r5
            goto L_0x0112
        L_0x00ef:
            java.lang.String r15 = r1.c(r14, r3)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            goto L_0x0112
        L_0x00f4:
            boolean r5 = r14.getAttributeBooleanValue(r3, r7)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r7 = r5
            goto L_0x0112
        L_0x00fa:
            java.lang.String r5 = r1.c(r14, r3)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r5 == 0) goto L_0x0106
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r12 = r5
            goto L_0x0112
        L_0x0106:
            r12 = 0
            goto L_0x0112
        L_0x0108:
            java.lang.String r5 = r1.c(r14, r3)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r8 = r5
            goto L_0x0112
        L_0x010e:
            java.lang.String r21 = r1.c(r14, r3)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x0112:
            int r3 = r3 + 1
            r13 = r25
            r5 = r26
            goto L_0x0078
        L_0x011a:
            r26 = r5
            if (r21 == 0) goto L_0x06a2
            if (r12 == 0) goto L_0x069b
            dtl r3 = com.google.android.gms.appdatasearch.RegisterCorpusInfo.a((java.lang.String) r21)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r3.a = r8     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r3.b = r12     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r3.e = r7     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r3.h = r15     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r3.i = r10     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r3.j = r4     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            oyw r4 = new oyw     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            org.xmlpull.v1.XmlPullParser r5 = r1.c     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r4.<init>(r5)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r5 = 0
        L_0x0138:
            boolean r7 = r4.a()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r7 != 0) goto L_0x015a
            oyu r4 = new oyu     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            com.google.android.gms.appdatasearch.RegisterCorpusInfo r3 = r3.a()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r4.<init>(r3, r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r11.add(r4)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r8 = r17
            r3 = r18
            r10 = r19
            r4 = r20
            r12 = r22
            r2 = r23
            r6 = 1
            r9 = 2
            goto L_0x002f
        L_0x015a:
            java.lang.String r7 = r4.b()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r8 = "Section"
            boolean r8 = r8.equals(r7)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r8 == 0) goto L_0x04c0
            java.lang.String r7 = " inside Section; expected SectionFeature"
            org.xmlpull.v1.XmlPullParser r8 = r1.c     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r8)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r8 == 0) goto L_0x04ba
            java.lang.String r12 = "plain"
            r28 = r2
            r29 = r4
            r30 = r11
            r2 = r12
            r4 = 0
            r10 = 0
            r11 = 0
            r13 = 1
            r14 = 0
            r15 = 0
            r27 = 0
        L_0x0181:
            r31 = r12
            int r12 = r8.getAttributeCount()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r32 = r5
            java.lang.String r5 = "url"
            r33 = r3
            java.lang.String r3 = "rfc822"
            r34 = r7
            if (r14 >= r12) goto L_0x023c
            java.lang.String r12 = r8.getAttributeName(r14)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r7 = "sectionId"
            boolean r7 = r7.equals(r12)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r7 != 0) goto L_0x022c
            java.lang.String r7 = "sectionFormat"
            boolean r7 = r7.equals(r12)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r7 != 0) goto L_0x0204
            java.lang.String r3 = "noIndex"
            boolean r3 = r3.equals(r12)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r3 != 0) goto L_0x01fe
            java.lang.String r3 = "sectionWeight"
            boolean r3 = r3.equals(r12)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r3 != 0) goto L_0x01f8
            java.lang.String r3 = "indexPrefixes"
            boolean r3 = r3.equals(r12)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r3 != 0) goto L_0x01f2
            java.lang.String r3 = "subsectionSeparator"
            boolean r3 = r3.equals(r12)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r3 != 0) goto L_0x01ed
            java.lang.String r3 = "schemaOrgProperty"
            boolean r3 = r3.equals(r12)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r3 != 0) goto L_0x01e8
            java.lang.String r2 = java.lang.String.valueOf(r12)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r3 = r2.length()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r3 != 0) goto L_0x01df
            java.lang.String r2 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r2.<init>(r6)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            goto L_0x01e3
        L_0x01df:
            java.lang.String r2 = r6.concat(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x01e3:
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x01e8:
            java.lang.String r4 = r1.c(r8, r14)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            goto L_0x0230
        L_0x01ed:
            java.lang.String r11 = r1.c(r8, r14)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            goto L_0x0230
        L_0x01f2:
            boolean r3 = r8.getAttributeBooleanValue(r14, r10)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r10 = r3
            goto L_0x0230
        L_0x01f8:
            int r3 = r8.getAttributeIntValue(r14, r13)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r13 = r3
            goto L_0x0230
        L_0x01fe:
            boolean r3 = r8.getAttributeBooleanValue(r14, r15)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r15 = r3
            goto L_0x0230
        L_0x0204:
            r2 = 0
            int r7 = r8.getAttributeIntValue(r14, r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r7 == 0) goto L_0x0229
            r2 = 1
            if (r7 == r2) goto L_0x0226
            r2 = 2
            if (r7 == r2) goto L_0x0224
            r2 = 3
            if (r7 == r2) goto L_0x0222
            r2 = 4
            if (r7 != r2) goto L_0x021b
            java.lang.String r2 = "date"
            goto L_0x0230
        L_0x021b:
            java.lang.String r2 = "Invalid section format"
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x0222:
            r2 = r5
            goto L_0x0230
        L_0x0224:
            r2 = r3
            goto L_0x0230
        L_0x0226:
            java.lang.String r2 = "html"
            goto L_0x0230
        L_0x0229:
            r2 = r31
            goto L_0x0230
        L_0x022c:
            java.lang.String r27 = r1.c(r8, r14)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x0230:
            int r14 = r14 + 1
            r12 = r31
            r5 = r32
            r3 = r33
            r7 = r34
            goto L_0x0181
        L_0x023c:
            if (r27 == 0) goto L_0x04b3
            dtn r7 = com.google.android.gms.appdatasearch.RegisterSectionInfo.a((java.lang.String) r27)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r7.a = r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r7.b = r15     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r7.c = r13     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r7.d = r10     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r7.e = r11     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r7.f = r4     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            oyw r8 = new oyw     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            org.xmlpull.v1.XmlPullParser r10 = r1.c     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r8.<init>(r10)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x025a:
            boolean r10 = r8.a()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r10 == 0) goto L_0x04a5
            java.lang.String r10 = r8.b()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r11 = "SectionFeature"
            boolean r11 = r11.equals(r10)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r11 == 0) goto L_0x0480
            java.lang.String r10 = " inside SectionFeature; expected FeatureParam"
            org.xmlpull.v1.XmlPullParser r11 = r1.c     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            android.util.AttributeSet r11 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r11 == 0) goto L_0x047a
            java.lang.String r12 = ""
            r13 = r12
            r12 = 0
            r14 = -1
        L_0x027b:
            int r15 = r11.getAttributeCount()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r12 < r15) goto L_0x043b
            oyw r11 = new oyw     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            org.xmlpull.v1.XmlPullParser r12 = r1.c     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r11.<init>(r12)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            android.os.Bundle r12 = new android.os.Bundle     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r12.<init>()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x028d:
            boolean r15 = r11.a()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r15 == 0) goto L_0x033b
            java.lang.String r15 = r11.b()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r27 = r8
            java.lang.String r8 = "FeatureParam"
            boolean r8 = r8.equals(r15)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r8 == 0) goto L_0x0318
            org.xmlpull.v1.XmlPullParser r8 = r1.c     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r8)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r8 == 0) goto L_0x0312
            r31 = r11
            r37 = r13
            r11 = 0
            r13 = 0
            r15 = 0
        L_0x02b0:
            r38 = r7
            int r7 = r8.getAttributeCount()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r15 >= r7) goto L_0x02f7
            java.lang.String r7 = r8.getAttributeName(r15)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r39 = r4
            java.lang.String r4 = "paramName"
            boolean r4 = r4.equals(r7)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r4 != 0) goto L_0x02ec
            java.lang.String r4 = "paramValue"
            boolean r4 = r4.equals(r7)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r4 != 0) goto L_0x02e7
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r3 = r2.length()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r3 != 0) goto L_0x02de
            java.lang.String r2 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r2.<init>(r6)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            goto L_0x02e2
        L_0x02de:
            java.lang.String r2 = r6.concat(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x02e2:
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x02e7:
            java.lang.String r13 = r1.c(r8, r15)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            goto L_0x02f0
        L_0x02ec:
            java.lang.String r11 = r8.getAttributeValue(r15)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x02f0:
            int r15 = r15 + 1
            r7 = r38
            r4 = r39
            goto L_0x02b0
        L_0x02f7:
            r39 = r4
            if (r11 == 0) goto L_0x030b
            if (r13 == 0) goto L_0x030b
            r12.putString(r11, r13)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r8 = r27
            r11 = r31
            r13 = r37
            r7 = r38
            r4 = r39
            goto L_0x028d
        L_0x030b:
            java.lang.String r2 = "Both name and value must be specified"
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x0312:
            oyx r2 = r1.b(r9)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x0318:
            java.lang.String r2 = java.lang.String.valueOf(r15)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r2 = r2.length()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r2 = r2 + 57
            r3.<init>(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r4 = r26
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r3.append(r15)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r3.append(r10)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r2 = r3.toString()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x033b:
            r39 = r4
            r38 = r7
            r27 = r8
            r37 = r13
            r4 = r26
            r7 = -1
            if (r14 == r7) goto L_0x0434
            r7 = 1
            if (r14 != r7) goto L_0x0362
            boolean r7 = r12.isEmpty()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r7 == 0) goto L_0x035b
            com.google.android.gms.appdatasearch.Feature r7 = defpackage.dud.a()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r8 = r7
            r7 = 4
            r13 = 3
            r15 = 2
            goto L_0x03da
        L_0x035b:
            java.lang.String r2 = "Section feature match_global_nicknames does not take set"
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x0362:
            java.lang.String r7 = "factor"
            r8 = 2
            if (r14 != r8) goto L_0x037e
            java.lang.String r8 = "demote_common_words"
            double r10 = r1.a((java.lang.String) r8, (android.os.Bundle) r12)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            com.google.android.gms.appdatasearch.Feature r8 = new com.google.android.gms.appdatasearch.Feature     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r12 = 2
            r8.<init>(r12)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r8.a((java.lang.String) r7, (java.lang.String) r10)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r7 = 4
            r13 = 3
            r15 = 2
            goto L_0x03da
        L_0x037e:
            r8 = 3
            if (r14 != r8) goto L_0x039e
            boolean r8 = r3.equals(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r8 == 0) goto L_0x039e
            java.lang.String r8 = "demote_rfc822_hostnames"
            double r10 = r1.a((java.lang.String) r8, (android.os.Bundle) r12)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            com.google.android.gms.appdatasearch.Feature r8 = new com.google.android.gms.appdatasearch.Feature     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r12 = 3
            r8.<init>(r12)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r8.a((java.lang.String) r7, (java.lang.String) r10)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r7 = 4
            r13 = 3
            r15 = 2
            goto L_0x03da
        L_0x039e:
            r7 = 4
            if (r14 != r7) goto L_0x03b0
            boolean r7 = r5.equals(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r7 == 0) goto L_0x03b0
            com.google.android.gms.appdatasearch.Feature r7 = defpackage.dud.b()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r8 = r7
            r7 = 4
            r13 = 3
            r15 = 2
            goto L_0x03da
        L_0x03b0:
            r7 = 5
            if (r14 != r7) goto L_0x03bc
            com.google.android.gms.appdatasearch.Feature r7 = defpackage.dud.c()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r8 = r7
            r7 = 4
            r13 = 3
            r15 = 2
            goto L_0x03da
        L_0x03bc:
            r7 = 6
            if (r14 != r7) goto L_0x0405
            r7 = 4
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r10 = "AddressAnnotator"
            r11 = 0
            r8[r11] = r10     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r10 = "DateAnnotator"
            r11 = 1
            r8[r11] = r10     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r10 = "PhoneAnnotator"
            r15 = 2
            r8[r15] = r10     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r10 = "UrlAnnotator"
            r13 = 3
            r8[r13] = r10     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            com.google.android.gms.appdatasearch.Feature r8 = defpackage.dud.a((java.lang.String[]) r8)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x03da:
            int r10 = r8.a     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r11 = r39
            boolean r10 = r11.contains(r10)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r10 != 0) goto L_0x03fe
            r10 = r38
            r10.a(r8)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r8 = r8.a     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r11.add(r8)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r26 = r4
            r7 = r10
            r4 = r11
            r8 = r27
            goto L_0x025a
        L_0x03fe:
            java.lang.String r2 = "Duplicate feature defined for section"
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x0405:
            java.lang.String r3 = java.lang.String.valueOf(r37)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r3 = r3.length()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r4 = r2.length()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r3 = r3 + 60
            int r3 = r3 + r4
            r5.<init>(r3)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r3 = "Invalid section feature of type "
            r5.append(r3)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r12 = r37
            r5.append(r12)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r3 = " inside section with format "
            r5.append(r3)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r5.append(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r2 = r5.toString()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x0434:
            java.lang.String r2 = "No type specified."
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x043b:
            r16 = r4
            r27 = r8
            r4 = r26
            r13 = 3
            r15 = 2
            r8 = r7
            r7 = 4
            java.lang.String r7 = r11.getAttributeName(r12)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r13 = "featureType"
            boolean r13 = r13.equals(r7)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r13 != 0) goto L_0x046a
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r3 = r2.length()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r3 != 0) goto L_0x0461
            java.lang.String r2 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r2.<init>(r6)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            goto L_0x0465
        L_0x0461:
            java.lang.String r2 = r6.concat(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x0465:
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x046a:
            int r14 = r11.getAttributeIntValue(r12, r14)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r12 = r12 + 1
            r26 = r4
            r13 = r7
            r7 = r8
            r4 = r16
            r8 = r27
            goto L_0x027b
        L_0x047a:
            oyx r2 = r1.b(r9)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x0480:
            r4 = r26
            java.lang.String r2 = java.lang.String.valueOf(r10)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r2 = r2.length()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r2 = r2 + 52
            r3.<init>(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r3.append(r10)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r2 = r34
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r2 = r3.toString()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x04a5:
            r8 = r7
            r4 = r26
            r15 = 2
            com.google.android.gms.appdatasearch.RegisterSectionInfo r2 = r8.a()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r3 = r33
            r3.a((com.google.android.gms.appdatasearch.RegisterSectionInfo) r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            goto L_0x0518
        L_0x04b3:
            java.lang.String r2 = "No section ID specified."
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x04ba:
            oyx r2 = r1.b(r9)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x04c0:
            r28 = r2
            r29 = r4
            r32 = r5
            r30 = r11
            r4 = r26
            r15 = 2
            java.lang.String r2 = "GlobalSearchCorpus"
            boolean r2 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r2 != 0) goto L_0x0547
            java.lang.String r2 = "IMECorpus"
            boolean r2 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r2 == 0) goto L_0x0524
            java.lang.String r2 = " inside IMECorpus; expected IMESection"
            oyw r5 = new oyw     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            org.xmlpull.v1.XmlPullParser r7 = r1.c     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r5.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x04e4:
            boolean r7 = r5.a()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r7 == 0) goto L_0x0518
            java.lang.String r7 = r5.b()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r8 = "IMESection"
            boolean r8 = r8.equals(r7)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r8 == 0) goto L_0x04f7
            goto L_0x04e4
        L_0x04f7:
            java.lang.String r3 = java.lang.String.valueOf(r7)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r3 = r3.length()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r3 = r3 + 50
            r5.<init>(r3)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r5.append(r4)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r5.append(r7)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r5.append(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r2 = r5.toString()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x0518:
            r26 = r4
            r2 = r28
            r4 = r29
            r11 = r30
            r5 = r32
            goto L_0x0138
        L_0x0524:
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r2 = r2.length()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r2 = r2 + 66
            r3.<init>(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r3.append(r7)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r2 = r25
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r2 = r3.toString()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x0547:
            r2 = r25
            if (r32 != 0) goto L_0x0694
            java.lang.String r5 = " inside GlobalSearchCorpus; expected GlobalSearchSection"
            org.xmlpull.v1.XmlPullParser r7 = r1.c     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r7 == 0) goto L_0x059c
            r8 = 0
            r10 = 0
            r11 = 1
        L_0x0558:
            int r12 = r7.getAttributeCount()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r8 >= r12) goto L_0x0599
            java.lang.String r12 = r7.getAttributeName(r8)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r14 = r24
            boolean r13 = r14.equals(r12)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r13 != 0) goto L_0x0590
            java.lang.String r13 = "allowShortcuts"
            boolean r13 = r13.equals(r12)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r13 != 0) goto L_0x058b
            java.lang.String r2 = java.lang.String.valueOf(r12)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r3 = r2.length()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r3 != 0) goto L_0x0582
            java.lang.String r2 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r2.<init>(r6)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            goto L_0x0586
        L_0x0582:
            java.lang.String r2 = r6.concat(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x0586:
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x058b:
            boolean r10 = r7.getAttributeBooleanValue(r8, r10)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            goto L_0x0594
        L_0x0590:
            boolean r11 = r7.getAttributeBooleanValue(r8, r11)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x0594:
            int r8 = r8 + 1
            r24 = r14
            goto L_0x0558
        L_0x0599:
            r14 = r24
            goto L_0x05a0
        L_0x059c:
            r14 = r24
            r10 = 0
            r11 = 1
        L_0x05a0:
            int r7 = defpackage.dtb.a()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int[] r7 = new int[r7]     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            oyw r8 = new oyw     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            org.xmlpull.v1.XmlPullParser r12 = r1.c     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r8.<init>(r12)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x05ad:
            boolean r12 = r8.a()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r12 == 0) goto L_0x065f
            java.lang.String r12 = r8.b()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r13 = "GlobalSearchSection"
            boolean r13 = r13.equals(r12)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r13 == 0) goto L_0x063e
            org.xmlpull.v1.XmlPullParser r12 = r8.a     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            android.util.AttributeSet r12 = android.util.Xml.asAttributeSet(r12)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r12 == 0) goto L_0x0638
            r13 = 0
            r15 = -1
            r16 = 0
        L_0x05cb:
            r25 = r2
            int r2 = r12.getAttributeCount()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r13 >= r2) goto L_0x0615
            java.lang.String r2 = r12.getAttributeName(r13)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r26 = r8
            java.lang.String r8 = "sectionType"
            boolean r8 = r8.equals(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r8 != 0) goto L_0x0609
            java.lang.String r8 = "sectionContent"
            boolean r8 = r8.equals(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r8 != 0) goto L_0x0602
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r3 = r2.length()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r3 != 0) goto L_0x05f9
            java.lang.String r2 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r2.<init>(r6)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            goto L_0x05fd
        L_0x05f9:
            java.lang.String r2 = r6.concat(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x05fd:
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x0602:
            int r2 = r1.b(r12, r13)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r16 = r2
            goto L_0x060e
        L_0x0609:
            int r2 = r12.getAttributeIntValue(r13, r15)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r15 = r2
        L_0x060e:
            int r13 = r13 + 1
            r2 = r25
            r8 = r26
            goto L_0x05cb
        L_0x0615:
            r26 = r8
            r2 = -1
            if (r15 == r2) goto L_0x0631
            if (r15 < 0) goto L_0x062a
            int r8 = defpackage.dtb.a()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r15 > r8) goto L_0x062a
            r7[r15] = r16     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r2 = r25
            r8 = r26
            r15 = 2
            goto L_0x05ad
        L_0x062a:
            java.lang.String r2 = "Section ID out of range; badly formed XML?"
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x0631:
            java.lang.String r2 = "No sectionType specified"
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x0638:
            oyx r2 = r1.b(r9)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x063e:
            java.lang.String r2 = java.lang.String.valueOf(r12)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r2 = r2.length()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r2 = r2 + 68
            r3.<init>(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r3.append(r12)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r3.append(r5)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r2 = r3.toString()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x065f:
            r25 = r2
            if (r11 == 0) goto L_0x0684
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r10 != 0) goto L_0x066b
            goto L_0x0672
        L_0x066b:
            com.google.android.gms.appdatasearch.Feature r5 = defpackage.dsz.a()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r2.add(r5)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x0672:
            com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig r5 = new com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r8 = r2.size()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            com.google.android.gms.appdatasearch.Feature[] r8 = new com.google.android.gms.appdatasearch.Feature[r8]     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.Object[] r2 = r2.toArray(r8)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            com.google.android.gms.appdatasearch.Feature[] r2 = (com.google.android.gms.appdatasearch.Feature[]) r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r5.<init>(r7, r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            goto L_0x0685
        L_0x0684:
            r5 = 0
        L_0x0685:
            r3.d = r5     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r26 = r4
            r24 = r14
            r2 = r28
            r4 = r29
            r11 = r30
            r5 = 1
            goto L_0x0138
        L_0x0694:
            java.lang.String r2 = "Duplicate element GlobalSearchCorpus"
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x069b:
            java.lang.String r2 = "No content provider URI specified."
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x06a2:
            java.lang.String r2 = "No corpus ID specified."
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x06a9:
            oyx r2 = r1.b(r9)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x06af:
            r23 = r2
            r18 = r3
            r20 = r4
            r4 = r5
            r17 = r8
            r19 = r10
            r30 = r11
            r22 = r12
            r14 = r15
            r2 = r23
            boolean r3 = r2.equals(r13)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r3 == 0) goto L_0x07a8
            if (r22 != 0) goto L_0x07a1
            org.xmlpull.v1.XmlPullParser r3 = r1.c     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r3)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r3 == 0) goto L_0x079b
            android.content.pm.ApplicationInfo r4 = r1.a     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r4 = r4.icon     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r36 = r4
            r4 = 0
            r5 = 1
            r34 = 0
            r35 = 0
            r37 = 0
            r38 = 0
            r39 = 0
        L_0x06e3:
            int r7 = r3.getAttributeCount()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r4 >= r7) goto L_0x0768
            java.lang.String r7 = r3.getAttributeName(r4)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            boolean r8 = r14.equals(r7)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r8 != 0) goto L_0x0760
            java.lang.String r8 = "searchLabel"
            boolean r8 = r8.equals(r7)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r8 != 0) goto L_0x0759
            java.lang.String r8 = "settingsDescription"
            boolean r8 = r8.equals(r7)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r8 != 0) goto L_0x0752
            java.lang.String r8 = "defaultIntentAction"
            boolean r8 = r8.equals(r7)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r8 != 0) goto L_0x074d
            java.lang.String r8 = "defaultIntentData"
            boolean r8 = r8.equals(r7)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r8 != 0) goto L_0x0748
            java.lang.String r8 = "defaultIntentActivity"
            boolean r8 = r8.equals(r7)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r8 != 0) goto L_0x0743
            java.lang.String r8 = "globalSearchIcon"
            boolean r8 = r8.equals(r7)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r8 != 0) goto L_0x073c
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r3 = r2.length()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            if (r3 != 0) goto L_0x0733
            java.lang.String r2 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r2.<init>(r6)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            goto L_0x0737
        L_0x0733:
            java.lang.String r2 = r6.concat(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x0737:
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x073c:
            int r7 = r1.a((android.util.AttributeSet) r3, (int) r4)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r36 = r7
            goto L_0x0764
        L_0x0743:
            java.lang.String r39 = r1.c(r3, r4)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            goto L_0x0764
        L_0x0748:
            java.lang.String r38 = r1.c(r3, r4)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            goto L_0x0764
        L_0x074d:
            java.lang.String r37 = r1.c(r3, r4)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            goto L_0x0764
        L_0x0752:
            int r7 = r1.b(r3, r4)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r35 = r7
            goto L_0x0764
        L_0x0759:
            int r7 = r1.b(r3, r4)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r34 = r7
            goto L_0x0764
        L_0x0760:
            boolean r5 = r3.getAttributeBooleanValue(r4, r5)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x0764:
            int r4 = r4 + 1
            goto L_0x06e3
        L_0x0768:
            if (r34 == 0) goto L_0x0794
            if (r5 == 0) goto L_0x0785
            com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo r12 = new com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r33 = 0
            r31 = r12
            r32 = r42
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r8 = r17
            r3 = r18
            r10 = r19
            r4 = r20
            r11 = r30
            r6 = 1
            r9 = 2
            goto L_0x002f
        L_0x0785:
            r8 = r17
            r3 = r18
            r10 = r19
            r4 = r20
            r11 = r30
            r6 = 1
            r9 = 2
            r12 = 0
            goto L_0x002f
        L_0x0794:
            java.lang.String r2 = "No label specified"
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x079b:
            oyx r2 = r1.b(r9)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x07a1:
            java.lang.String r2 = "Duplicate element GlobalSearch"
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x07a8:
            java.lang.String r3 = java.lang.String.valueOf(r13)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r3 = r3.length()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r3 = r3 + 66
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r5.<init>(r3)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r5.append(r4)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r5.append(r13)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r3 = " inside "
            r5.append(r3)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r3 = r20
            r5.append(r3)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r4 = r19
            r5.append(r4)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r4 = r18
            r5.append(r4)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r3 = " or "
            r5.append(r3)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r5.append(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r2 = r5.toString()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x07e2:
            r3 = r4
            r4 = r10
            org.xmlpull.v1.XmlPullParser r2 = r1.c     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r2 = r2.getName()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r5 = r5.length()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            int r5 = r5 + 41
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r6.<init>(r5)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r5 = "Invalid root tag "
            r6.append(r5)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r6.append(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r6.append(r4)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            r6.append(r3)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            java.lang.String r2 = r6.toString()     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x0810:
            r40 = r4
            r4 = r3
            r3 = r40
            r40 = r4
            r4 = r3
            r3 = r40
            goto L_0x0008
        L_0x081c:
            java.lang.String r2 = "No start tag found!"
            oyx r2 = r1.b(r2)     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0825, IOException -> 0x0823 }
        L_0x0823:
            r0 = move-exception
            goto L_0x0826
        L_0x0825:
            r0 = move-exception
        L_0x0826:
            r2 = r0
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            android.content.pm.ApplicationInfo r4 = r1.a
            java.lang.String r4 = r4.packageName
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "Failed to read search metadata from package %s"
            defpackage.oso.b((java.lang.Throwable) r2, (java.lang.String) r4, (java.lang.Object[]) r3)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oyy.a(java.lang.String):oyv");
    }
}
