package defpackage;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: actm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class actm extends actp {
    private static final Pattern h = Pattern.compile("\\((.*)\\)$");
    private static final Pattern i = Pattern.compile("\\[(.*)]$");
    private static final Pattern j = Pattern.compile("\\{(.*)\\}$");
    private static final Pattern k = Pattern.compile("([^:][^=]*)=([^:^=]+)");
    private static final Pattern l = Pattern.compile("([^:][^=^{]*)[{]?([^=^{^}]*)[}]?=([^:^=]+)");
    private static final amsk m = amsk.a(10);
    private static final amsk n = amsk.a(':');
    private static final amsk o = amsk.a('=');
    private static final amsk p = amsk.a(',');
    private static final amsk q = amsk.a('|');
    private static final amsk r = amsk.a('&');
    private static final amsk s = amsk.a(':');
    private boolean t = false;
    private long u = 1000;
    private String v;
    private StringBuilder w;

    public actm() {
        super("Mediastats", "media.metrics", "MEDIA_STATS", false);
    }

    private static final auhg a(String str, String str2, int i2) {
        aucd o2 = auhg.c.o();
        if ("error".equals(str2)) {
            long parseLong = Long.parseLong(str);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            auhg auhg = (auhg) o2.b;
            auhg.a = 2;
            auhg.b = Long.valueOf(parseLong);
        } else if (str2.isEmpty()) {
            aucd o3 = auhf.c.o();
            if (i2 == 1) {
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                auhf auhf = (auhf) o3.b;
                str.getClass();
                auhf.a = 1;
                auhf.b = str;
            } else if (i2 != 2) {
                double parseDouble = Double.parseDouble(str);
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                auhf auhf2 = (auhf) o3.b;
                auhf2.a = 3;
                auhf2.b = Double.valueOf(parseDouble);
            } else {
                long parseLong2 = Long.parseLong(str);
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                auhf auhf3 = (auhf) o3.b;
                auhf3.a = 2;
                auhf3.b = Long.valueOf(parseLong2);
            }
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            auhg auhg2 = (auhg) o2.b;
            auhf auhf4 = (auhf) o3.i();
            auhf4.getClass();
            auhg2.b = auhf4;
            auhg2.a = 1;
        } else {
            String valueOf = String.valueOf(str2);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid namePart ") : "Invalid namePart ".concat(valueOf));
        }
        return (auhg) o2.i();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final defpackage.auhb b(java.lang.String r11, defpackage.aucd r12) {
        /*
            auhb r0 = defpackage.auhb.aM
            aucd r0 = r0.o()
            int r1 = r11.hashCode()
            r2 = 2
            r3 = 1
            r4 = 32
            r5 = 8
            r6 = 4
            r7 = 0
            switch(r1) {
                case -1947587429: goto L_0x01ab;
                case -1702683776: goto L_0x01a1;
                case -1628684513: goto L_0x0196;
                case -1620898610: goto L_0x018b;
                case -1611186791: goto L_0x0180;
                case -1598153226: goto L_0x0175;
                case -1422448340: goto L_0x016b;
                case -1370456159: goto L_0x0160;
                case -1245833798: goto L_0x0155;
                case -1049880535: goto L_0x0149;
                case -1030748828: goto L_0x013d;
                case -1017544539: goto L_0x0131;
                case -811197757: goto L_0x0125;
                case -730734919: goto L_0x011a;
                case -425857162: goto L_0x010e;
                case -291024563: goto L_0x0102;
                case -234066487: goto L_0x00f6;
                case -58944306: goto L_0x00ea;
                case -46610547: goto L_0x00de;
                case -12996734: goto L_0x00d2;
                case 134998671: goto L_0x00c6;
                case 155634742: goto L_0x00bb;
                case 243584211: goto L_0x00af;
                case 442974238: goto L_0x00a3;
                case 537304374: goto L_0x0097;
                case 677972631: goto L_0x008b;
                case 973684433: goto L_0x007f;
                case 985428678: goto L_0x0073;
                case 1086182044: goto L_0x0067;
                case 1162162658: goto L_0x005b;
                case 1179386944: goto L_0x004f;
                case 1457135939: goto L_0x0043;
                case 1464269552: goto L_0x0038;
                case 1691719810: goto L_0x002d;
                case 1758976879: goto L_0x0022;
                case 1969925557: goto L_0x0017;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x01b6
        L_0x0017:
            java.lang.String r1 = "/drm/widevine/cdm_engine/restore_key/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 7
            goto L_0x01b7
        L_0x0022:
            java.lang.String r1 = "/drm/widevine/cdm_engine/get_provisioning_request/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 3
            goto L_0x01b7
        L_0x002d:
            java.lang.String r1 = "/drm/widevine/cdm_engine/add_key/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 0
            goto L_0x01b7
        L_0x0038:
            java.lang.String r1 = "/drm/widevine/cdm_engine/generate_key_request/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 2
            goto L_0x01b7
        L_0x0043:
            java.lang.String r1 = "/drm/widevine/oemcrypto/generate_rsa_signature/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 20
            goto L_0x01b7
        L_0x004f:
            java.lang.String r1 = "/drm/widevine/crypto_session/update_usage_information/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 15
            goto L_0x01b7
        L_0x005b:
            java.lang.String r1 = "/drm/widevine/oemcrypto/install_keybox/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 28
            goto L_0x01b7
        L_0x0067:
            java.lang.String r1 = "/drm/widevine/oemcrypto/copy_buffer/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 16
            goto L_0x01b7
        L_0x0073:
            java.lang.String r1 = "/drm/widevine/oemcrypto/generate_derived_keys/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 19
            goto L_0x01b7
        L_0x007f:
            java.lang.String r1 = "/drm/widevine/oemcrypto/generic_verify/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 25
            goto L_0x01b7
        L_0x008b:
            java.lang.String r1 = "/drm/widevine/crypto_session/generic_verify/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 12
            goto L_0x01b7
        L_0x0097:
            java.lang.String r1 = "/drm/widevine/oemcrypto/load_device_rsa_key/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 29
            goto L_0x01b7
        L_0x00a3:
            java.lang.String r1 = "/drm/widevine/oemcrypto/derive_keys_from_session_key/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 18
            goto L_0x01b7
        L_0x00af:
            java.lang.String r1 = "/drm/widevine/crypto_session/generic_sign/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 11
            goto L_0x01b7
        L_0x00bb:
            java.lang.String r1 = "/drm/widevine/cdm_engine/decrypt/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 1
            goto L_0x01b7
        L_0x00c6:
            java.lang.String r1 = "/drm/widevine/oemcrypto/rewrap_device_rsa_key_30/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 32
            goto L_0x01b7
        L_0x00d2:
            java.lang.String r1 = "/drm/widevine/oemcrypto/initialize/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 27
            goto L_0x01b7
        L_0x00de:
            java.lang.String r1 = "/drm/widevine/oemcrypto/generic_sign/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 24
            goto L_0x01b7
        L_0x00ea:
            java.lang.String r1 = "/drm/widevine/cdm_session/renew_key/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 8
            goto L_0x01b7
        L_0x00f6:
            java.lang.String r1 = "/drm/widevine/oemcrypto/generic_encrypt/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 23
            goto L_0x01b7
        L_0x0102:
            java.lang.String r1 = "/drm/widevine/oemcrypto/rewrap_device_rsa_key/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 33
            goto L_0x01b7
        L_0x010e:
            java.lang.String r1 = "/drm/widevine/crypto_session/load_certificate_private_key/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 13
            goto L_0x01b7
        L_0x011a:
            java.lang.String r1 = "/drm/widevine/cdm_engine/handle_provisioning_response/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 5
            goto L_0x01b7
        L_0x0125:
            java.lang.String r1 = "/drm/widevine/crypto_session/generic_encrypt/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 10
            goto L_0x01b7
        L_0x0131:
            java.lang.String r1 = "/drm/widevine/oemcrypto/wrap_keybox/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 35
            goto L_0x01b7
        L_0x013d:
            java.lang.String r1 = "/drm/widevine/oemcrypto/generate_signature/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 21
            goto L_0x01b7
        L_0x0149:
            java.lang.String r1 = "/drm/widevine/oemcrypto/decrypt_cenc/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 17
            goto L_0x01b7
        L_0x0155:
            java.lang.String r1 = "/drm/widevine/oemcrypto/refresh_keys/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 31
            goto L_0x01b7
        L_0x0160:
            java.lang.String r1 = "/drm/widevine/oemcrypto/generic_decrypt/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 22
            goto L_0x01b7
        L_0x016b:
            java.lang.String r1 = "/drm/widevine/cdm_engine/query_key_status/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 6
            goto L_0x01b7
        L_0x0175:
            java.lang.String r1 = "/drm/widevine/oemcrypto/select_key/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 34
            goto L_0x01b7
        L_0x0180:
            java.lang.String r1 = "/drm/widevine/oemcrypto/load_keys/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 30
            goto L_0x01b7
        L_0x018b:
            java.lang.String r1 = "/drm/widevine/crypto_session/open/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 14
            goto L_0x01b7
        L_0x0196:
            java.lang.String r1 = "/drm/widevine/oemcrypto/get_key_data/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 26
            goto L_0x01b7
        L_0x01a1:
            java.lang.String r1 = "/drm/widevine/cdm_engine/get_usage_info/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 4
            goto L_0x01b7
        L_0x01ab:
            java.lang.String r1 = "/drm/widevine/crypto_session/generic_decrypt/time"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x01b6
            r11 = 9
            goto L_0x01b7
        L_0x01b6:
            r11 = -1
        L_0x01b7:
            r1 = 32768(0x8000, float:4.5918E-41)
            r8 = 536870912(0x20000000, float:1.0842022E-19)
            r9 = 67108864(0x4000000, float:1.5046328E-36)
            r10 = 1048576(0x100000, float:1.469368E-39)
            switch(r11) {
                case 0: goto L_0x0640;
                case 1: goto L_0x0621;
                case 2: goto L_0x0602;
                case 3: goto L_0x05e2;
                case 4: goto L_0x05c1;
                case 5: goto L_0x05a0;
                case 6: goto L_0x057f;
                case 7: goto L_0x055d;
                case 8: goto L_0x053d;
                case 9: goto L_0x051d;
                case 10: goto L_0x04fb;
                case 11: goto L_0x04d9;
                case 12: goto L_0x04b9;
                case 13: goto L_0x0499;
                case 14: goto L_0x0479;
                case 15: goto L_0x0459;
                case 16: goto L_0x0438;
                case 17: goto L_0x0417;
                case 18: goto L_0x03f7;
                case 19: goto L_0x03d5;
                case 20: goto L_0x03b3;
                case 21: goto L_0x0393;
                case 22: goto L_0x0371;
                case 23: goto L_0x034f;
                case 24: goto L_0x032d;
                case 25: goto L_0x030b;
                case 26: goto L_0x02eb;
                case 27: goto L_0x02cb;
                case 28: goto L_0x02a9;
                case 29: goto L_0x0289;
                case 30: goto L_0x0269;
                case 31: goto L_0x0248;
                case 32: goto L_0x0227;
                case 33: goto L_0x0206;
                case 34: goto L_0x01e5;
                case 35: goto L_0x01c5;
                default: goto L_0x01c3;
            }
        L_0x01c3:
            r11 = 0
            return r11
        L_0x01c5:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x01ca
            goto L_0x01cf
        L_0x01ca:
            r0.c()
            r0.c = r7
        L_0x01cf:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.aI = r12
            int r12 = r11.c
            r12 = r12 | r1
            r11.c = r12
            goto L_0x065e
        L_0x01e5:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x01ea
            goto L_0x01ef
        L_0x01ea:
            r0.c()
            r0.c = r7
        L_0x01ef:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.aF = r12
            int r12 = r11.c
            r12 = r12 | 4096(0x1000, float:5.74E-42)
            r11.c = r12
            goto L_0x065e
        L_0x0206:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x020b
            goto L_0x0210
        L_0x020b:
            r0.c()
            r0.c = r7
        L_0x0210:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.aC = r12
            int r12 = r11.c
            r12 = r12 | 512(0x200, float:7.175E-43)
            r11.c = r12
            goto L_0x065e
        L_0x0227:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x022c
            goto L_0x0231
        L_0x022c:
            r0.c()
            r0.c = r7
        L_0x0231:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.aD = r12
            int r12 = r11.c
            r12 = r12 | 1024(0x400, float:1.435E-42)
            r11.c = r12
            goto L_0x065e
        L_0x0248:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x024d
            goto L_0x0252
        L_0x024d:
            r0.c()
            r0.c = r7
        L_0x0252:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.aA = r12
            int r12 = r11.c
            r12 = r12 | 128(0x80, float:1.794E-43)
            r11.c = r12
            goto L_0x065e
        L_0x0269:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x026e
            goto L_0x0273
        L_0x026e:
            r0.c()
            r0.c = r7
        L_0x0273:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.av = r12
            int r12 = r11.c
            r12 = r12 | r6
            r11.c = r12
            goto L_0x065e
        L_0x0289:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x028e
            goto L_0x0293
        L_0x028e:
            r0.c()
            r0.c = r7
        L_0x0293:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.au = r12
            int r12 = r11.c
            r12 = r12 | r2
            r11.c = r12
            goto L_0x065e
        L_0x02a9:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x02ae
            goto L_0x02b3
        L_0x02ae:
            r0.c()
            r0.c = r7
        L_0x02b3:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.ar = r12
            int r12 = r11.b
            r1 = 1073741824(0x40000000, float:2.0)
            r12 = r12 | r1
            r11.b = r12
            goto L_0x065e
        L_0x02cb:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x02d0
            goto L_0x02d5
        L_0x02d0:
            r0.c()
            r0.c = r7
        L_0x02d5:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.aq = r12
            int r12 = r11.b
            r12 = r12 | r8
            r11.b = r12
            goto L_0x065e
        L_0x02eb:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x02f0
            goto L_0x02f5
        L_0x02f0:
            r0.c()
            r0.c = r7
        L_0x02f5:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.an = r12
            int r12 = r11.b
            r12 = r12 | r9
            r11.b = r12
            goto L_0x065e
        L_0x030b:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x0310
            goto L_0x0315
        L_0x0310:
            r0.c()
            r0.c = r7
        L_0x0315:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.al = r12
            int r12 = r11.b
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r12 = r12 | r1
            r11.b = r12
            goto L_0x065e
        L_0x032d:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x0332
            goto L_0x0337
        L_0x0332:
            r0.c()
            r0.c = r7
        L_0x0337:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.ak = r12
            int r12 = r11.b
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r12 = r12 | r1
            r11.b = r12
            goto L_0x065e
        L_0x034f:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x0354
            goto L_0x0359
        L_0x0354:
            r0.c()
            r0.c = r7
        L_0x0359:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.aj = r12
            int r12 = r11.b
            r1 = 4194304(0x400000, float:5.877472E-39)
            r12 = r12 | r1
            r11.b = r12
            goto L_0x065e
        L_0x0371:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x0376
            goto L_0x037b
        L_0x0376:
            r0.c()
            r0.c = r7
        L_0x037b:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.ai = r12
            int r12 = r11.b
            r1 = 2097152(0x200000, float:2.938736E-39)
            r12 = r12 | r1
            r11.b = r12
            goto L_0x065e
        L_0x0393:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x0398
            goto L_0x039d
        L_0x0398:
            r0.c()
            r0.c = r7
        L_0x039d:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.ah = r12
            int r12 = r11.b
            r12 = r12 | r10
            r11.b = r12
            goto L_0x065e
        L_0x03b3:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x03b8
            goto L_0x03bd
        L_0x03b8:
            r0.c()
            r0.c = r7
        L_0x03bd:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.ag = r12
            int r12 = r11.b
            r1 = 524288(0x80000, float:7.34684E-40)
            r12 = r12 | r1
            r11.b = r12
            goto L_0x065e
        L_0x03d5:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x03da
            goto L_0x03df
        L_0x03da:
            r0.c()
            r0.c = r7
        L_0x03df:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.ae = r12
            int r12 = r11.b
            r1 = 131072(0x20000, float:1.83671E-40)
            r12 = r12 | r1
            r11.b = r12
            goto L_0x065e
        L_0x03f7:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x03fc
            goto L_0x0401
        L_0x03fc:
            r0.c()
            r0.c = r7
        L_0x0401:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.ac = r12
            int r12 = r11.b
            r12 = r12 | r1
            r11.b = r12
            goto L_0x065e
        L_0x0417:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x041c
            goto L_0x0421
        L_0x041c:
            r0.c()
            r0.c = r7
        L_0x0421:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.Z = r12
            int r12 = r11.b
            r12 = r12 | 4096(0x1000, float:5.74E-42)
            r11.b = r12
            goto L_0x065e
        L_0x0438:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x043d
            goto L_0x0442
        L_0x043d:
            r0.c()
            r0.c = r7
        L_0x0442:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.W = r12
            int r12 = r11.b
            r12 = r12 | 512(0x200, float:7.175E-43)
            r11.b = r12
            goto L_0x065e
        L_0x0459:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x045e
            goto L_0x0463
        L_0x045e:
            r0.c()
            r0.c = r7
        L_0x0463:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.O = r12
            int r12 = r11.b
            r12 = r12 | r4
            r11.b = r12
            goto L_0x065e
        L_0x0479:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x047e
            goto L_0x0483
        L_0x047e:
            r0.c()
            r0.c = r7
        L_0x0483:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.M = r12
            int r12 = r11.b
            r12 = r12 | r5
            r11.b = r12
            goto L_0x065e
        L_0x0499:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x049e
            goto L_0x04a3
        L_0x049e:
            r0.c()
            r0.c = r7
        L_0x04a3:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.L = r12
            int r12 = r11.b
            r12 = r12 | r6
            r11.b = r12
            goto L_0x065e
        L_0x04b9:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x04be
            goto L_0x04c3
        L_0x04be:
            r0.c()
            r0.c = r7
        L_0x04c3:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.G = r12
            int r12 = r11.a
            r12 = r12 | r8
            r11.a = r12
            goto L_0x065e
        L_0x04d9:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x04de
            goto L_0x04e3
        L_0x04de:
            r0.c()
            r0.c = r7
        L_0x04e3:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.F = r12
            int r12 = r11.a
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r12 = r12 | r1
            r11.a = r12
            goto L_0x065e
        L_0x04fb:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x0500
            goto L_0x0505
        L_0x0500:
            r0.c()
            r0.c = r7
        L_0x0505:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.E = r12
            int r12 = r11.a
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r12 = r12 | r1
            r11.a = r12
            goto L_0x065e
        L_0x051d:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x0522
            goto L_0x0527
        L_0x0522:
            r0.c()
            r0.c = r7
        L_0x0527:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.D = r12
            int r12 = r11.a
            r12 = r12 | r9
            r11.a = r12
            goto L_0x065e
        L_0x053d:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x0542
            goto L_0x0547
        L_0x0542:
            r0.c()
            r0.c = r7
        L_0x0547:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.x = r12
            int r12 = r11.a
            r12 = r12 | r10
            r11.a = r12
            goto L_0x065e
        L_0x055d:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x0562
            goto L_0x0567
        L_0x0562:
            r0.c()
            r0.c = r7
        L_0x0567:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.t = r12
            int r12 = r11.a
            r1 = 65536(0x10000, float:9.18355E-41)
            r12 = r12 | r1
            r11.a = r12
            goto L_0x065e
        L_0x057f:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x0584
            goto L_0x0589
        L_0x0584:
            r0.c()
            r0.c = r7
        L_0x0589:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.p = r12
            int r12 = r11.a
            r12 = r12 | 4096(0x1000, float:5.74E-42)
            r11.a = r12
            goto L_0x065e
        L_0x05a0:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x05a5
            goto L_0x05aa
        L_0x05a5:
            r0.c()
            r0.c = r7
        L_0x05aa:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.l = r12
            int r12 = r11.a
            r12 = r12 | 256(0x100, float:3.59E-43)
            r11.a = r12
            goto L_0x065e
        L_0x05c1:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x05c6
            goto L_0x05cb
        L_0x05c6:
            r0.c()
            r0.c = r7
        L_0x05cb:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.k = r12
            int r12 = r11.a
            r12 = r12 | 128(0x80, float:1.794E-43)
            r11.a = r12
            goto L_0x065e
        L_0x05e2:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x05e7
            goto L_0x05ec
        L_0x05e7:
            r0.c()
            r0.c = r7
        L_0x05ec:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.j = r12
            int r12 = r11.a
            r12 = r12 | 64
            r11.a = r12
            goto L_0x065e
        L_0x0602:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x0607
            goto L_0x060c
        L_0x0607:
            r0.c()
            r0.c = r7
        L_0x060c:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.i = r12
            int r12 = r11.a
            r12 = r12 | r4
            r11.a = r12
            goto L_0x065e
        L_0x0621:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x0626
            goto L_0x062b
        L_0x0626:
            r0.c()
            r0.c = r7
        L_0x062b:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.g = r12
            int r12 = r11.a
            r12 = r12 | r5
            r11.a = r12
            goto L_0x065e
        L_0x0640:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x0645
            goto L_0x064a
        L_0x0645:
            r0.c()
            r0.c = r7
        L_0x064a:
            aucj r11 = r0.b
            auhb r11 = (defpackage.auhb) r11
            aucj r12 = r12.i()
            auhe r12 = (defpackage.auhe) r12
            r12.getClass()
            r11.d = r12
            int r12 = r11.a
            r12 = r12 | r3
            r11.a = r12
        L_0x065e:
            aucj r11 = r0.i()
            auhb r11 = (defpackage.auhb) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.actm.b(java.lang.String, aucd):auhb");
    }

    public static final auhj e(String str) {
        List c = p.a(5).c(str);
        if (c.size() != 5) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Illegal histogram attributes: ") : "Illegal histogram attributes: ".concat(valueOf));
        }
        float parseFloat = Float.parseFloat((String) c.get(1));
        if (parseFloat > 0.0f) {
            int parseInt = Integer.parseInt((String) c.get(2));
            if (parseInt <= 0 || parseInt > 50) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Illegal histogram bin number: ");
                sb.append(parseInt);
                throw new IllegalArgumentException(sb.toString());
            }
            float parseFloat2 = Float.parseFloat((String) c.get(3));
            ArrayList arrayList = new ArrayList(Collections.nCopies(parseInt + 2, 0));
            Matcher matcher = j.matcher((CharSequence) c.get(4));
            if (!matcher.find()) {
                String valueOf2 = String.valueOf(str);
                throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Illegal histogram attributes: ") : "Illegal histogram attributes: ".concat(valueOf2));
            }
            for (String c2 : p.a((CharSequence) matcher.group(1))) {
                List c3 = q.c(c2);
                if (c3.size() == 2) {
                    try {
                        int parseInt2 = Integer.parseInt((String) c3.get(0));
                        int parseInt3 = Integer.parseInt((String) c3.get(1));
                        if (parseInt2 >= -1 && parseInt2 <= parseInt && parseInt3 > 0) {
                            arrayList.set(parseInt2 + 1, Integer.valueOf(parseInt3));
                        }
                    } catch (NumberFormatException e) {
                    }
                }
            }
            aucd o2 = auhj.f.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            auhj auhj = (auhj) o2.b;
            int i2 = 1 | auhj.a;
            auhj.a = i2;
            auhj.b = parseFloat;
            int i3 = i2 | 2;
            auhj.a = i3;
            auhj.c = parseInt;
            auhj.a = i3 | 4;
            auhj.d = parseFloat2;
            if (!auhj.e.a()) {
                auhj.e = aucj.a(auhj.e);
            }
            auab.a((Iterable) arrayList, (List) auhj.e);
            return (auhj) o2.i();
        }
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("Illegal histogram bin size: ");
        sb2.append(parseFloat);
        throw new IllegalArgumentException(sb2.toString());
    }

    private final void f(String str) {
        if (this.t && ((long) (this.w.length() + str.length())) < this.u) {
            StringBuilder sb = this.w;
            sb.append(str);
            sb.append(":");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final defpackage.auhd g(java.lang.String r9) {
        /*
            auhd r0 = defpackage.auhd.j
            aucd r0 = r0.o()
            amsk r1 = r
            java.lang.Iterable r9 = r1.a((java.lang.CharSequence) r9)
            java.util.Iterator r9 = r9.iterator()
        L_0x0010:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0177
            java.lang.Object r1 = r9.next()
            java.lang.String r1 = (java.lang.String) r1
            amsk r2 = s
            java.util.List r1 = r2.c(r1)
            int r2 = r1.size()
            r3 = 2
            if (r2 != r3) goto L_0x0010
            r2 = 0
            java.lang.Object r4 = r1.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            r5 = 1
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r4.hashCode()     // Catch:{ IllegalArgumentException -> 0x0174 }
            r7 = 4
            r8 = -1
            switch(r6) {
                case -1867169789: goto L_0x0087;
                case -1400483146: goto L_0x007d;
                case -1266716235: goto L_0x0073;
                case -1106363674: goto L_0x0069;
                case -783714637: goto L_0x005f;
                case -430165023: goto L_0x0055;
                case -362150459: goto L_0x004b;
                case 96784904: goto L_0x0041;
                default: goto L_0x0040;
            }     // Catch:{ IllegalArgumentException -> 0x0174 }
        L_0x0040:
            goto L_0x0090
        L_0x0041:
            java.lang.String r6 = "error"
            boolean r4 = r4.equals(r6)     // Catch:{ IllegalArgumentException -> 0x0174 }
            if (r4 == 0) goto L_0x0040
            r8 = 0
            goto L_0x0090
        L_0x004b:
            java.lang.String r6 = "security_level"
            boolean r4 = r4.equals(r6)     // Catch:{ IllegalArgumentException -> 0x0174 }
            if (r4 == 0) goto L_0x0040
            r8 = 2
            goto L_0x0090
        L_0x0055:
            java.lang.String r6 = "oemcrypto_error"
            boolean r4 = r4.equals(r6)     // Catch:{ IllegalArgumentException -> 0x0174 }
            if (r4 == 0) goto L_0x0040
            r8 = 7
            goto L_0x0090
        L_0x005f:
            java.lang.String r6 = "encryption_algorithm"
            boolean r4 = r4.equals(r6)     // Catch:{ IllegalArgumentException -> 0x0174 }
            if (r4 == 0) goto L_0x0040
            r8 = 5
            goto L_0x0090
        L_0x0069:
            java.lang.String r6 = "length"
            boolean r4 = r4.equals(r6)     // Catch:{ IllegalArgumentException -> 0x0174 }
            if (r4 == 0) goto L_0x0040
            r8 = 4
            goto L_0x0090
        L_0x0073:
            java.lang.String r6 = "signing_algorithm"
            boolean r4 = r4.equals(r6)     // Catch:{ IllegalArgumentException -> 0x0174 }
            if (r4 == 0) goto L_0x0040
            r8 = 6
            goto L_0x0090
        L_0x007d:
            java.lang.String r6 = "requested_security_level"
            boolean r4 = r4.equals(r6)     // Catch:{ IllegalArgumentException -> 0x0174 }
            if (r4 == 0) goto L_0x0040
            r8 = 3
            goto L_0x0090
        L_0x0087:
            java.lang.String r6 = "success"
            boolean r4 = r4.equals(r6)     // Catch:{ IllegalArgumentException -> 0x0174 }
            if (r4 == 0) goto L_0x0040
            r8 = 1
        L_0x0090:
            switch(r8) {
                case 0: goto L_0x0159;
                case 1: goto L_0x013a;
                case 2: goto L_0x011f;
                case 3: goto L_0x0103;
                case 4: goto L_0x00e7;
                case 5: goto L_0x00cc;
                case 6: goto L_0x00b1;
                case 7: goto L_0x0095;
                default: goto L_0x0093;
            }     // Catch:{ IllegalArgumentException -> 0x0174 }
        L_0x0093:
            goto L_0x0010
        L_0x0095:
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ IllegalArgumentException -> 0x0174 }
            boolean r3 = r0.c     // Catch:{ IllegalArgumentException -> 0x0174 }
            if (r3 != 0) goto L_0x009e
            goto L_0x00a3
        L_0x009e:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x0174 }
            r0.c = r2     // Catch:{ IllegalArgumentException -> 0x0174 }
        L_0x00a3:
            aucj r2 = r0.b     // Catch:{ IllegalArgumentException -> 0x0174 }
            auhd r2 = (defpackage.auhd) r2     // Catch:{ IllegalArgumentException -> 0x0174 }
            int r3 = r2.a     // Catch:{ IllegalArgumentException -> 0x0174 }
            r3 = r3 | 128(0x80, float:1.794E-43)
            r2.a = r3     // Catch:{ IllegalArgumentException -> 0x0174 }
            r2.i = r1     // Catch:{ IllegalArgumentException -> 0x0174 }
            goto L_0x0010
        L_0x00b1:
            boolean r3 = r0.c     // Catch:{ IllegalArgumentException -> 0x0174 }
            if (r3 != 0) goto L_0x00b6
            goto L_0x00bb
        L_0x00b6:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x0174 }
            r0.c = r2     // Catch:{ IllegalArgumentException -> 0x0174 }
        L_0x00bb:
            aucj r2 = r0.b     // Catch:{ IllegalArgumentException -> 0x0174 }
            auhd r2 = (defpackage.auhd) r2     // Catch:{ IllegalArgumentException -> 0x0174 }
            r1.getClass()     // Catch:{ IllegalArgumentException -> 0x0174 }
            int r3 = r2.a     // Catch:{ IllegalArgumentException -> 0x0174 }
            r3 = r3 | 64
            r2.a = r3     // Catch:{ IllegalArgumentException -> 0x0174 }
            r2.h = r1     // Catch:{ IllegalArgumentException -> 0x0174 }
            goto L_0x0010
        L_0x00cc:
            boolean r3 = r0.c     // Catch:{ IllegalArgumentException -> 0x0174 }
            if (r3 != 0) goto L_0x00d1
            goto L_0x00d6
        L_0x00d1:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x0174 }
            r0.c = r2     // Catch:{ IllegalArgumentException -> 0x0174 }
        L_0x00d6:
            aucj r2 = r0.b     // Catch:{ IllegalArgumentException -> 0x0174 }
            auhd r2 = (defpackage.auhd) r2     // Catch:{ IllegalArgumentException -> 0x0174 }
            r1.getClass()     // Catch:{ IllegalArgumentException -> 0x0174 }
            int r3 = r2.a     // Catch:{ IllegalArgumentException -> 0x0174 }
            r3 = r3 | 32
            r2.a = r3     // Catch:{ IllegalArgumentException -> 0x0174 }
            r2.g = r1     // Catch:{ IllegalArgumentException -> 0x0174 }
            goto L_0x0010
        L_0x00e7:
            long r3 = java.lang.Long.parseLong(r1)     // Catch:{ IllegalArgumentException -> 0x0174 }
            boolean r1 = r0.c     // Catch:{ IllegalArgumentException -> 0x0174 }
            if (r1 != 0) goto L_0x00f0
            goto L_0x00f5
        L_0x00f0:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x0174 }
            r0.c = r2     // Catch:{ IllegalArgumentException -> 0x0174 }
        L_0x00f5:
            aucj r1 = r0.b     // Catch:{ IllegalArgumentException -> 0x0174 }
            auhd r1 = (defpackage.auhd) r1     // Catch:{ IllegalArgumentException -> 0x0174 }
            int r2 = r1.a     // Catch:{ IllegalArgumentException -> 0x0174 }
            r2 = r2 | 16
            r1.a = r2     // Catch:{ IllegalArgumentException -> 0x0174 }
            r1.f = r3     // Catch:{ IllegalArgumentException -> 0x0174 }
            goto L_0x0010
        L_0x0103:
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ IllegalArgumentException -> 0x0174 }
            boolean r3 = r0.c     // Catch:{ IllegalArgumentException -> 0x0174 }
            if (r3 != 0) goto L_0x010c
            goto L_0x0111
        L_0x010c:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x0174 }
            r0.c = r2     // Catch:{ IllegalArgumentException -> 0x0174 }
        L_0x0111:
            aucj r2 = r0.b     // Catch:{ IllegalArgumentException -> 0x0174 }
            auhd r2 = (defpackage.auhd) r2     // Catch:{ IllegalArgumentException -> 0x0174 }
            int r3 = r2.a     // Catch:{ IllegalArgumentException -> 0x0174 }
            r3 = r3 | 8
            r2.a = r3     // Catch:{ IllegalArgumentException -> 0x0174 }
            r2.e = r1     // Catch:{ IllegalArgumentException -> 0x0174 }
            goto L_0x0010
        L_0x011f:
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ IllegalArgumentException -> 0x0174 }
            boolean r3 = r0.c     // Catch:{ IllegalArgumentException -> 0x0174 }
            if (r3 != 0) goto L_0x0128
            goto L_0x012d
        L_0x0128:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x0174 }
            r0.c = r2     // Catch:{ IllegalArgumentException -> 0x0174 }
        L_0x012d:
            aucj r2 = r0.b     // Catch:{ IllegalArgumentException -> 0x0174 }
            auhd r2 = (defpackage.auhd) r2     // Catch:{ IllegalArgumentException -> 0x0174 }
            int r3 = r2.a     // Catch:{ IllegalArgumentException -> 0x0174 }
            r3 = r3 | r7
            r2.a = r3     // Catch:{ IllegalArgumentException -> 0x0174 }
            r2.d = r1     // Catch:{ IllegalArgumentException -> 0x0174 }
            goto L_0x0010
        L_0x013a:
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ IllegalArgumentException -> 0x0174 }
            if (r1 != r5) goto L_0x0141
            goto L_0x0142
        L_0x0141:
            r5 = 0
        L_0x0142:
            boolean r1 = r0.c     // Catch:{ IllegalArgumentException -> 0x0174 }
            if (r1 != 0) goto L_0x0147
            goto L_0x014c
        L_0x0147:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x0174 }
            r0.c = r2     // Catch:{ IllegalArgumentException -> 0x0174 }
        L_0x014c:
            aucj r1 = r0.b     // Catch:{ IllegalArgumentException -> 0x0174 }
            auhd r1 = (defpackage.auhd) r1     // Catch:{ IllegalArgumentException -> 0x0174 }
            int r2 = r1.a     // Catch:{ IllegalArgumentException -> 0x0174 }
            r2 = r2 | r3
            r1.a = r2     // Catch:{ IllegalArgumentException -> 0x0174 }
            r1.c = r5     // Catch:{ IllegalArgumentException -> 0x0174 }
            goto L_0x0010
        L_0x0159:
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ IllegalArgumentException -> 0x0174 }
            boolean r3 = r0.c     // Catch:{ IllegalArgumentException -> 0x0174 }
            if (r3 != 0) goto L_0x0162
            goto L_0x0167
        L_0x0162:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x0174 }
            r0.c = r2     // Catch:{ IllegalArgumentException -> 0x0174 }
        L_0x0167:
            aucj r2 = r0.b     // Catch:{ IllegalArgumentException -> 0x0174 }
            auhd r2 = (defpackage.auhd) r2     // Catch:{ IllegalArgumentException -> 0x0174 }
            int r3 = r2.a     // Catch:{ IllegalArgumentException -> 0x0174 }
            r3 = r3 | r5
            r2.a = r3     // Catch:{ IllegalArgumentException -> 0x0174 }
            r2.b = r1     // Catch:{ IllegalArgumentException -> 0x0174 }
            goto L_0x0010
        L_0x0174:
            r1 = move-exception
            goto L_0x0010
        L_0x0177:
            aucj r9 = r0.i()
            auhd r9 = (defpackage.auhd) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.actm.g(java.lang.String):auhd");
    }

    private static final Pair h(String str) {
        List c = o.c(str);
        if (c.size() == 2) {
            return Pair.create((String) c.get(0), (String) c.get(1));
        }
        return null;
    }

    private static final anax i() {
        return anax.a("/drm/widevine/cdm_engine/add_key/time", "/drm/widevine/cdm_engine/decrypt/time", "/drm/widevine/cdm_engine/generate_key_request/time", "/drm/widevine/cdm_engine/get_provisioning_request/time", "/drm/widevine/cdm_engine/get_usage_info/time", "/drm/widevine/cdm_engine/handle_provisioning_response/time", "/drm/widevine/cdm_engine/query_key_status/time", "/drm/widevine/cdm_engine/restore_key/time", "/drm/widevine/cdm_session/renew_key/time", "/drm/widevine/crypto_session/generic_decrypt/time", "/drm/widevine/crypto_session/generic_encrypt/time", "/drm/widevine/crypto_session/generic_sign/time", "/drm/widevine/crypto_session/generic_verify/time", "/drm/widevine/crypto_session/load_certificate_private_key/time", "/drm/widevine/crypto_session/open/time", "/drm/widevine/crypto_session/update_usage_information/time", "/drm/widevine/oemcrypto/copy_buffer/time", "/drm/widevine/oemcrypto/decrypt_cenc/time", "/drm/widevine/oemcrypto/derive_keys_from_session_key/time", "/drm/widevine/oemcrypto/generate_derived_keys/time", "/drm/widevine/oemcrypto/generate_rsa_signature/time", "/drm/widevine/oemcrypto/generate_signature/time", "/drm/widevine/oemcrypto/generic_decrypt/time", "/drm/widevine/oemcrypto/generic_encrypt/time", "/drm/widevine/oemcrypto/generic_sign/time", "/drm/widevine/oemcrypto/generic_verify/time", "/drm/widevine/oemcrypto/get_key_data/time", "/drm/widevine/oemcrypto/initialize/time", "/drm/widevine/oemcrypto/install_keybox/time", "/drm/widevine/oemcrypto/load_device_rsa_key/time", "/drm/widevine/oemcrypto/load_keys/time", "/drm/widevine/oemcrypto/refresh_keys/time", "/drm/widevine/oemcrypto/rewrap_device_rsa_key_30/time", "/drm/widevine/oemcrypto/rewrap_device_rsa_key/time", "/drm/widevine/oemcrypto/select_key/time", "/drm/widevine/oemcrypto/wrap_keybox/time");
    }

    public final long c() {
        return aznn.a.a().e();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.augs d(java.lang.String r14) {
        /*
            r13 = this;
            augs r0 = defpackage.augs.l
            aucd r0 = r0.o()
            amsk r1 = n
            java.util.List r14 = r1.c(r14)
            java.util.Iterator r14 = r14.iterator()
        L_0x0010:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x021a
            java.lang.Object r1 = r14.next()
            java.lang.String r1 = (java.lang.String) r1
            android.util.Pair r2 = h(r1)
            if (r2 == 0) goto L_0x0010
            java.lang.Object r3 = r2.second
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.first     // Catch:{ IllegalArgumentException -> 0x0217 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IllegalArgumentException -> 0x0217 }
            int r4 = r2.hashCode()     // Catch:{ IllegalArgumentException -> 0x0217 }
            r5 = 5
            r6 = 8
            r7 = 3
            r8 = 4
            r9 = 1
            r10 = 2
            r11 = 0
            r12 = -1
            switch(r4) {
                case -1903324807: goto L_0x0099;
                case -1496781117: goto L_0x008e;
                case -1492325567: goto L_0x0084;
                case -1061548717: goto L_0x007a;
                case -778309071: goto L_0x0070;
                case -404860911: goto L_0x0065;
                case -386822775: goto L_0x005b;
                case 689199507: goto L_0x0051;
                case 1205161411: goto L_0x0047;
                case 1952397122: goto L_0x003d;
                default: goto L_0x003a;
            }     // Catch:{ IllegalArgumentException -> 0x0217 }
        L_0x003a:
            r2 = -1
            goto L_0x00a2
        L_0x003d:
            java.lang.String r4 = "android.media.audiothread.workMs.hist"
            boolean r2 = r2.equals(r4)     // Catch:{ IllegalArgumentException -> 0x0217 }
            if (r2 == 0) goto L_0x003a
            r2 = 4
            goto L_0x00a2
        L_0x0047:
            java.lang.String r4 = "android.media.audiothread.latencyMs.hist"
            boolean r2 = r2.equals(r4)     // Catch:{ IllegalArgumentException -> 0x0217 }
            if (r2 == 0) goto L_0x003a
            r2 = 3
            goto L_0x00a2
        L_0x0051:
            java.lang.String r4 = "android.media.audiothread.overruns"
            boolean r2 = r2.equals(r4)     // Catch:{ IllegalArgumentException -> 0x0217 }
            if (r2 == 0) goto L_0x003a
            r2 = 7
            goto L_0x00a2
        L_0x005b:
            java.lang.String r4 = "android.media.audiothread.underruns"
            boolean r2 = r2.equals(r4)     // Catch:{ IllegalArgumentException -> 0x0217 }
            if (r2 == 0) goto L_0x003a
            r2 = 6
            goto L_0x00a2
        L_0x0065:
            java.lang.String r4 = "android.media.audiothread.durationMs"
            boolean r2 = r2.equals(r4)     // Catch:{ IllegalArgumentException -> 0x0217 }
            if (r2 == 0) goto L_0x003a
            r2 = 9
            goto L_0x00a2
        L_0x0070:
            java.lang.String r4 = "android.media.audiothread.type"
            boolean r2 = r2.equals(r4)     // Catch:{ IllegalArgumentException -> 0x0217 }
            if (r2 == 0) goto L_0x003a
            r2 = 0
            goto L_0x00a2
        L_0x007a:
            java.lang.String r4 = "android.media.audiothread.warmupMs.hist"
            boolean r2 = r2.equals(r4)     // Catch:{ IllegalArgumentException -> 0x0217 }
            if (r2 == 0) goto L_0x003a
            r2 = 5
            goto L_0x00a2
        L_0x0084:
            java.lang.String r4 = "android.media.audiothread.samplerate"
            boolean r2 = r2.equals(r4)     // Catch:{ IllegalArgumentException -> 0x0217 }
            if (r2 == 0) goto L_0x003a
            r2 = 1
            goto L_0x00a2
        L_0x008e:
            java.lang.String r4 = "android.media.audiothread.activeMs"
            boolean r2 = r2.equals(r4)     // Catch:{ IllegalArgumentException -> 0x0217 }
            if (r2 == 0) goto L_0x003a
            r2 = 8
            goto L_0x00a2
        L_0x0099:
            java.lang.String r4 = "android.media.audiothread.framecount"
            boolean r2 = r2.equals(r4)     // Catch:{ IllegalArgumentException -> 0x0217 }
            if (r2 == 0) goto L_0x003a
            r2 = 2
        L_0x00a2:
            switch(r2) {
                case 0: goto L_0x01ac;
                case 1: goto L_0x0191;
                case 2: goto L_0x0176;
                case 3: goto L_0x0158;
                case 4: goto L_0x0139;
                case 5: goto L_0x011a;
                case 6: goto L_0x00fe;
                case 7: goto L_0x00e2;
                case 8: goto L_0x00c6;
                case 9: goto L_0x00aa;
                default: goto L_0x00a5;
            }     // Catch:{ IllegalArgumentException -> 0x0217 }
        L_0x00a5:
            r13.f(r1)     // Catch:{ IllegalArgumentException -> 0x0217 }
            goto L_0x0010
        L_0x00aa:
            long r1 = java.lang.Long.parseLong(r3)     // Catch:{ IllegalArgumentException -> 0x0217 }
            boolean r3 = r0.c     // Catch:{ IllegalArgumentException -> 0x0217 }
            if (r3 != 0) goto L_0x00b3
            goto L_0x00b8
        L_0x00b3:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x0217 }
            r0.c = r11     // Catch:{ IllegalArgumentException -> 0x0217 }
        L_0x00b8:
            aucj r3 = r0.b     // Catch:{ IllegalArgumentException -> 0x0217 }
            augs r3 = (defpackage.augs) r3     // Catch:{ IllegalArgumentException -> 0x0217 }
            int r4 = r3.a     // Catch:{ IllegalArgumentException -> 0x0217 }
            r4 = r4 | 512(0x200, float:7.175E-43)
            r3.a = r4     // Catch:{ IllegalArgumentException -> 0x0217 }
            r3.k = r1     // Catch:{ IllegalArgumentException -> 0x0217 }
            goto L_0x0010
        L_0x00c6:
            long r1 = java.lang.Long.parseLong(r3)     // Catch:{ IllegalArgumentException -> 0x0217 }
            boolean r3 = r0.c     // Catch:{ IllegalArgumentException -> 0x0217 }
            if (r3 != 0) goto L_0x00cf
            goto L_0x00d4
        L_0x00cf:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x0217 }
            r0.c = r11     // Catch:{ IllegalArgumentException -> 0x0217 }
        L_0x00d4:
            aucj r3 = r0.b     // Catch:{ IllegalArgumentException -> 0x0217 }
            augs r3 = (defpackage.augs) r3     // Catch:{ IllegalArgumentException -> 0x0217 }
            int r4 = r3.a     // Catch:{ IllegalArgumentException -> 0x0217 }
            r4 = r4 | 256(0x100, float:3.59E-43)
            r3.a = r4     // Catch:{ IllegalArgumentException -> 0x0217 }
            r3.j = r1     // Catch:{ IllegalArgumentException -> 0x0217 }
            goto L_0x0010
        L_0x00e2:
            long r1 = java.lang.Long.parseLong(r3)     // Catch:{ IllegalArgumentException -> 0x0217 }
            boolean r3 = r0.c     // Catch:{ IllegalArgumentException -> 0x0217 }
            if (r3 != 0) goto L_0x00eb
            goto L_0x00f0
        L_0x00eb:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x0217 }
            r0.c = r11     // Catch:{ IllegalArgumentException -> 0x0217 }
        L_0x00f0:
            aucj r3 = r0.b     // Catch:{ IllegalArgumentException -> 0x0217 }
            augs r3 = (defpackage.augs) r3     // Catch:{ IllegalArgumentException -> 0x0217 }
            int r4 = r3.a     // Catch:{ IllegalArgumentException -> 0x0217 }
            r4 = r4 | 128(0x80, float:1.794E-43)
            r3.a = r4     // Catch:{ IllegalArgumentException -> 0x0217 }
            r3.i = r1     // Catch:{ IllegalArgumentException -> 0x0217 }
            goto L_0x0010
        L_0x00fe:
            long r1 = java.lang.Long.parseLong(r3)     // Catch:{ IllegalArgumentException -> 0x0217 }
            boolean r3 = r0.c     // Catch:{ IllegalArgumentException -> 0x0217 }
            if (r3 != 0) goto L_0x0107
            goto L_0x010c
        L_0x0107:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x0217 }
            r0.c = r11     // Catch:{ IllegalArgumentException -> 0x0217 }
        L_0x010c:
            aucj r3 = r0.b     // Catch:{ IllegalArgumentException -> 0x0217 }
            augs r3 = (defpackage.augs) r3     // Catch:{ IllegalArgumentException -> 0x0217 }
            int r4 = r3.a     // Catch:{ IllegalArgumentException -> 0x0217 }
            r4 = r4 | 64
            r3.a = r4     // Catch:{ IllegalArgumentException -> 0x0217 }
            r3.h = r1     // Catch:{ IllegalArgumentException -> 0x0217 }
            goto L_0x0010
        L_0x011a:
            auhj r1 = e(r3)     // Catch:{ IllegalArgumentException -> 0x0217 }
            boolean r2 = r0.c     // Catch:{ IllegalArgumentException -> 0x0217 }
            if (r2 != 0) goto L_0x0123
            goto L_0x0128
        L_0x0123:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x0217 }
            r0.c = r11     // Catch:{ IllegalArgumentException -> 0x0217 }
        L_0x0128:
            aucj r2 = r0.b     // Catch:{ IllegalArgumentException -> 0x0217 }
            augs r2 = (defpackage.augs) r2     // Catch:{ IllegalArgumentException -> 0x0217 }
            r1.getClass()     // Catch:{ IllegalArgumentException -> 0x0217 }
            r2.g = r1     // Catch:{ IllegalArgumentException -> 0x0217 }
            int r1 = r2.a     // Catch:{ IllegalArgumentException -> 0x0217 }
            r1 = r1 | 32
            r2.a = r1     // Catch:{ IllegalArgumentException -> 0x0217 }
            goto L_0x0010
        L_0x0139:
            auhj r1 = e(r3)     // Catch:{ IllegalArgumentException -> 0x0217 }
            boolean r2 = r0.c     // Catch:{ IllegalArgumentException -> 0x0217 }
            if (r2 != 0) goto L_0x0142
            goto L_0x0147
        L_0x0142:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x0217 }
            r0.c = r11     // Catch:{ IllegalArgumentException -> 0x0217 }
        L_0x0147:
            aucj r2 = r0.b     // Catch:{ IllegalArgumentException -> 0x0217 }
            augs r2 = (defpackage.augs) r2     // Catch:{ IllegalArgumentException -> 0x0217 }
            r1.getClass()     // Catch:{ IllegalArgumentException -> 0x0217 }
            r2.f = r1     // Catch:{ IllegalArgumentException -> 0x0217 }
            int r1 = r2.a     // Catch:{ IllegalArgumentException -> 0x0217 }
            r1 = r1 | 16
            r2.a = r1     // Catch:{ IllegalArgumentException -> 0x0217 }
            goto L_0x0010
        L_0x0158:
            auhj r1 = e(r3)     // Catch:{ IllegalArgumentException -> 0x0217 }
            boolean r2 = r0.c     // Catch:{ IllegalArgumentException -> 0x0217 }
            if (r2 != 0) goto L_0x0161
            goto L_0x0166
        L_0x0161:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x0217 }
            r0.c = r11     // Catch:{ IllegalArgumentException -> 0x0217 }
        L_0x0166:
            aucj r2 = r0.b     // Catch:{ IllegalArgumentException -> 0x0217 }
            augs r2 = (defpackage.augs) r2     // Catch:{ IllegalArgumentException -> 0x0217 }
            r1.getClass()     // Catch:{ IllegalArgumentException -> 0x0217 }
            r2.e = r1     // Catch:{ IllegalArgumentException -> 0x0217 }
            int r1 = r2.a     // Catch:{ IllegalArgumentException -> 0x0217 }
            r1 = r1 | r6
            r2.a = r1     // Catch:{ IllegalArgumentException -> 0x0217 }
            goto L_0x0010
        L_0x0176:
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ IllegalArgumentException -> 0x0217 }
            boolean r2 = r0.c     // Catch:{ IllegalArgumentException -> 0x0217 }
            if (r2 != 0) goto L_0x017f
            goto L_0x0184
        L_0x017f:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x0217 }
            r0.c = r11     // Catch:{ IllegalArgumentException -> 0x0217 }
        L_0x0184:
            aucj r2 = r0.b     // Catch:{ IllegalArgumentException -> 0x0217 }
            augs r2 = (defpackage.augs) r2     // Catch:{ IllegalArgumentException -> 0x0217 }
            int r3 = r2.a     // Catch:{ IllegalArgumentException -> 0x0217 }
            r3 = r3 | r8
            r2.a = r3     // Catch:{ IllegalArgumentException -> 0x0217 }
            r2.d = r1     // Catch:{ IllegalArgumentException -> 0x0217 }
            goto L_0x0010
        L_0x0191:
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ IllegalArgumentException -> 0x0217 }
            boolean r2 = r0.c     // Catch:{ IllegalArgumentException -> 0x0217 }
            if (r2 != 0) goto L_0x019a
            goto L_0x019f
        L_0x019a:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x0217 }
            r0.c = r11     // Catch:{ IllegalArgumentException -> 0x0217 }
        L_0x019f:
            aucj r2 = r0.b     // Catch:{ IllegalArgumentException -> 0x0217 }
            augs r2 = (defpackage.augs) r2     // Catch:{ IllegalArgumentException -> 0x0217 }
            int r3 = r2.a     // Catch:{ IllegalArgumentException -> 0x0217 }
            r3 = r3 | r10
            r2.a = r3     // Catch:{ IllegalArgumentException -> 0x0217 }
            r2.c = r1     // Catch:{ IllegalArgumentException -> 0x0217 }
            goto L_0x0010
        L_0x01ac:
            int r1 = r3.hashCode()
            switch(r1) {
                case -1522623219: goto L_0x01dc;
                case 73372649: goto L_0x01d2;
                case 433141802: goto L_0x01c8;
                case 821863242: goto L_0x01be;
                case 1270567718: goto L_0x01b4;
                default: goto L_0x01b3;
            }
        L_0x01b3:
            goto L_0x01e6
        L_0x01b4:
            java.lang.String r1 = "CAPTURE"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x01b3
            r1 = 2
            goto L_0x01e7
        L_0x01be:
            java.lang.String r1 = "FASTCAPTURE"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x01b3
            r1 = 4
            goto L_0x01e7
        L_0x01c8:
            java.lang.String r1 = "UNKNOWN"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x01b3
            r1 = 0
            goto L_0x01e7
        L_0x01d2:
            java.lang.String r1 = "MIXER"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x01b3
            r1 = 1
            goto L_0x01e7
        L_0x01dc:
            java.lang.String r1 = "FASTMIXER"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x01b3
            r1 = 3
            goto L_0x01e7
        L_0x01e6:
            r1 = -1
        L_0x01e7:
            if (r1 == 0) goto L_0x01fe
            if (r1 == r9) goto L_0x01fc
            if (r1 == r10) goto L_0x01fa
            if (r1 == r7) goto L_0x01f8
            if (r1 != r8) goto L_0x01f2
            goto L_0x01ff
        L_0x01f2:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0217 }
            r1.<init>()     // Catch:{ IllegalArgumentException -> 0x0217 }
            throw r1     // Catch:{ IllegalArgumentException -> 0x0217 }
        L_0x01f8:
            r5 = 4
            goto L_0x01ff
        L_0x01fa:
            r5 = 3
            goto L_0x01ff
        L_0x01fc:
            r5 = 2
            goto L_0x01ff
        L_0x01fe:
            r5 = 1
        L_0x01ff:
            boolean r1 = r0.c     // Catch:{ IllegalArgumentException -> 0x0217 }
            if (r1 != 0) goto L_0x0204
            goto L_0x0209
        L_0x0204:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x0217 }
            r0.c = r11     // Catch:{ IllegalArgumentException -> 0x0217 }
        L_0x0209:
            aucj r1 = r0.b     // Catch:{ IllegalArgumentException -> 0x0217 }
            augs r1 = (defpackage.augs) r1     // Catch:{ IllegalArgumentException -> 0x0217 }
            int r5 = r5 + r12
            r1.b = r5     // Catch:{ IllegalArgumentException -> 0x0217 }
            int r2 = r1.a     // Catch:{ IllegalArgumentException -> 0x0217 }
            r2 = r2 | r9
            r1.a = r2     // Catch:{ IllegalArgumentException -> 0x0217 }
            goto L_0x0010
        L_0x0217:
            r1 = move-exception
            goto L_0x0010
        L_0x021a:
            aucj r14 = r0.i()
            augs r14 = (defpackage.augs) r14
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.actm.d(java.lang.String):augs");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.augq c(java.lang.String r12) {
        /*
            r11 = this;
            augq r0 = defpackage.augq.l
            aucd r0 = r0.o()
            amsk r1 = n
            java.util.List r12 = r1.c(r12)
            java.util.Iterator r12 = r12.iterator()
        L_0x0010:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x01bb
            java.lang.Object r1 = r12.next()
            java.lang.String r1 = (java.lang.String) r1
            android.util.Pair r2 = h(r1)
            if (r2 == 0) goto L_0x0010
            java.lang.Object r3 = r2.second
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.first     // Catch:{ NumberFormatException -> 0x01b8 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x01b8 }
            int r4 = r2.hashCode()     // Catch:{ NumberFormatException -> 0x01b8 }
            r5 = 8
            r6 = 4
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = -1
            switch(r4) {
                case -1911472853: goto L_0x0096;
                case -1445783058: goto L_0x008c;
                case -964318566: goto L_0x0082;
                case 123146090: goto L_0x0078;
                case 285523870: goto L_0x006e;
                case 1006892256: goto L_0x0064;
                case 1285488227: goto L_0x005a;
                case 1416415682: goto L_0x004f;
                case 1416511129: goto L_0x0044;
                case 1668432222: goto L_0x003a;
                default: goto L_0x0038;
            }     // Catch:{ NumberFormatException -> 0x01b8 }
        L_0x0038:
            goto L_0x009f
        L_0x003a:
            java.lang.String r4 = "android.media.audiorecord.n"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x01b8 }
            if (r2 == 0) goto L_0x0038
            r10 = 7
            goto L_0x009f
        L_0x0044:
            java.lang.String r4 = "android.media.audiorecord.errfunc"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x01b8 }
            if (r2 == 0) goto L_0x0038
            r10 = 9
            goto L_0x009f
        L_0x004f:
            java.lang.String r4 = "android.media.audiorecord.errcode"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x01b8 }
            if (r2 == 0) goto L_0x0038
            r10 = 8
            goto L_0x009f
        L_0x005a:
            java.lang.String r4 = "android.media.audiorecord.encoding"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x01b8 }
            if (r2 == 0) goto L_0x0038
            r10 = 0
            goto L_0x009f
        L_0x0064:
            java.lang.String r4 = "android.media.audiorecord.channels"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x01b8 }
            if (r2 == 0) goto L_0x0038
            r10 = 4
            goto L_0x009f
        L_0x006e:
            java.lang.String r4 = "android.media.audiorecord.createdMs"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x01b8 }
            if (r2 == 0) goto L_0x0038
            r10 = 5
            goto L_0x009f
        L_0x0078:
            java.lang.String r4 = "android.media.audiorecord.durationMs"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x01b8 }
            if (r2 == 0) goto L_0x0038
            r10 = 6
            goto L_0x009f
        L_0x0082:
            java.lang.String r4 = "android.media.audiorecord.samplerate"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x01b8 }
            if (r2 == 0) goto L_0x0038
            r10 = 3
            goto L_0x009f
        L_0x008c:
            java.lang.String r4 = "android.media.audiorecord.latency"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x01b8 }
            if (r2 == 0) goto L_0x0038
            r10 = 2
            goto L_0x009f
        L_0x0096:
            java.lang.String r4 = "android.media.audiorecord.source"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x01b8 }
            if (r2 == 0) goto L_0x0038
            r10 = 1
        L_0x009f:
            switch(r10) {
                case 0: goto L_0x019e;
                case 1: goto L_0x0184;
                case 2: goto L_0x0169;
                case 3: goto L_0x014e;
                case 4: goto L_0x0132;
                case 5: goto L_0x0116;
                case 6: goto L_0x00fa;
                case 7: goto L_0x00de;
                case 8: goto L_0x00c2;
                case 9: goto L_0x00a7;
                default: goto L_0x00a2;
            }     // Catch:{ NumberFormatException -> 0x01b8 }
        L_0x00a2:
            r11.f(r1)     // Catch:{ NumberFormatException -> 0x01b8 }
            goto L_0x0010
        L_0x00a7:
            boolean r1 = r0.c     // Catch:{ NumberFormatException -> 0x01b8 }
            if (r1 != 0) goto L_0x00ac
            goto L_0x00b1
        L_0x00ac:
            r0.c()     // Catch:{ NumberFormatException -> 0x01b8 }
            r0.c = r9     // Catch:{ NumberFormatException -> 0x01b8 }
        L_0x00b1:
            aucj r1 = r0.b     // Catch:{ NumberFormatException -> 0x01b8 }
            augq r1 = (defpackage.augq) r1     // Catch:{ NumberFormatException -> 0x01b8 }
            r3.getClass()     // Catch:{ NumberFormatException -> 0x01b8 }
            int r2 = r1.a     // Catch:{ NumberFormatException -> 0x01b8 }
            r2 = r2 | 512(0x200, float:7.175E-43)
            r1.a = r2     // Catch:{ NumberFormatException -> 0x01b8 }
            r1.k = r3     // Catch:{ NumberFormatException -> 0x01b8 }
            goto L_0x0010
        L_0x00c2:
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x01b8 }
            boolean r2 = r0.c     // Catch:{ NumberFormatException -> 0x01b8 }
            if (r2 != 0) goto L_0x00cb
            goto L_0x00d0
        L_0x00cb:
            r0.c()     // Catch:{ NumberFormatException -> 0x01b8 }
            r0.c = r9     // Catch:{ NumberFormatException -> 0x01b8 }
        L_0x00d0:
            aucj r2 = r0.b     // Catch:{ NumberFormatException -> 0x01b8 }
            augq r2 = (defpackage.augq) r2     // Catch:{ NumberFormatException -> 0x01b8 }
            int r3 = r2.a     // Catch:{ NumberFormatException -> 0x01b8 }
            r3 = r3 | 256(0x100, float:3.59E-43)
            r2.a = r3     // Catch:{ NumberFormatException -> 0x01b8 }
            r2.j = r1     // Catch:{ NumberFormatException -> 0x01b8 }
            goto L_0x0010
        L_0x00de:
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x01b8 }
            boolean r2 = r0.c     // Catch:{ NumberFormatException -> 0x01b8 }
            if (r2 != 0) goto L_0x00e7
            goto L_0x00ec
        L_0x00e7:
            r0.c()     // Catch:{ NumberFormatException -> 0x01b8 }
            r0.c = r9     // Catch:{ NumberFormatException -> 0x01b8 }
        L_0x00ec:
            aucj r2 = r0.b     // Catch:{ NumberFormatException -> 0x01b8 }
            augq r2 = (defpackage.augq) r2     // Catch:{ NumberFormatException -> 0x01b8 }
            int r3 = r2.a     // Catch:{ NumberFormatException -> 0x01b8 }
            r3 = r3 | 128(0x80, float:1.794E-43)
            r2.a = r3     // Catch:{ NumberFormatException -> 0x01b8 }
            r2.i = r1     // Catch:{ NumberFormatException -> 0x01b8 }
            goto L_0x0010
        L_0x00fa:
            long r1 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x01b8 }
            boolean r3 = r0.c     // Catch:{ NumberFormatException -> 0x01b8 }
            if (r3 != 0) goto L_0x0103
            goto L_0x0108
        L_0x0103:
            r0.c()     // Catch:{ NumberFormatException -> 0x01b8 }
            r0.c = r9     // Catch:{ NumberFormatException -> 0x01b8 }
        L_0x0108:
            aucj r3 = r0.b     // Catch:{ NumberFormatException -> 0x01b8 }
            augq r3 = (defpackage.augq) r3     // Catch:{ NumberFormatException -> 0x01b8 }
            int r4 = r3.a     // Catch:{ NumberFormatException -> 0x01b8 }
            r4 = r4 | 64
            r3.a = r4     // Catch:{ NumberFormatException -> 0x01b8 }
            r3.h = r1     // Catch:{ NumberFormatException -> 0x01b8 }
            goto L_0x0010
        L_0x0116:
            long r1 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x01b8 }
            boolean r3 = r0.c     // Catch:{ NumberFormatException -> 0x01b8 }
            if (r3 != 0) goto L_0x011f
            goto L_0x0124
        L_0x011f:
            r0.c()     // Catch:{ NumberFormatException -> 0x01b8 }
            r0.c = r9     // Catch:{ NumberFormatException -> 0x01b8 }
        L_0x0124:
            aucj r3 = r0.b     // Catch:{ NumberFormatException -> 0x01b8 }
            augq r3 = (defpackage.augq) r3     // Catch:{ NumberFormatException -> 0x01b8 }
            int r4 = r3.a     // Catch:{ NumberFormatException -> 0x01b8 }
            r4 = r4 | 32
            r3.a = r4     // Catch:{ NumberFormatException -> 0x01b8 }
            r3.g = r1     // Catch:{ NumberFormatException -> 0x01b8 }
            goto L_0x0010
        L_0x0132:
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x01b8 }
            boolean r2 = r0.c     // Catch:{ NumberFormatException -> 0x01b8 }
            if (r2 != 0) goto L_0x013b
            goto L_0x0140
        L_0x013b:
            r0.c()     // Catch:{ NumberFormatException -> 0x01b8 }
            r0.c = r9     // Catch:{ NumberFormatException -> 0x01b8 }
        L_0x0140:
            aucj r2 = r0.b     // Catch:{ NumberFormatException -> 0x01b8 }
            augq r2 = (defpackage.augq) r2     // Catch:{ NumberFormatException -> 0x01b8 }
            int r3 = r2.a     // Catch:{ NumberFormatException -> 0x01b8 }
            r3 = r3 | 16
            r2.a = r3     // Catch:{ NumberFormatException -> 0x01b8 }
            r2.f = r1     // Catch:{ NumberFormatException -> 0x01b8 }
            goto L_0x0010
        L_0x014e:
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x01b8 }
            boolean r2 = r0.c     // Catch:{ NumberFormatException -> 0x01b8 }
            if (r2 != 0) goto L_0x0157
            goto L_0x015c
        L_0x0157:
            r0.c()     // Catch:{ NumberFormatException -> 0x01b8 }
            r0.c = r9     // Catch:{ NumberFormatException -> 0x01b8 }
        L_0x015c:
            aucj r2 = r0.b     // Catch:{ NumberFormatException -> 0x01b8 }
            augq r2 = (defpackage.augq) r2     // Catch:{ NumberFormatException -> 0x01b8 }
            int r3 = r2.a     // Catch:{ NumberFormatException -> 0x01b8 }
            r3 = r3 | r5
            r2.a = r3     // Catch:{ NumberFormatException -> 0x01b8 }
            r2.e = r1     // Catch:{ NumberFormatException -> 0x01b8 }
            goto L_0x0010
        L_0x0169:
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x01b8 }
            boolean r2 = r0.c     // Catch:{ NumberFormatException -> 0x01b8 }
            if (r2 != 0) goto L_0x0172
            goto L_0x0177
        L_0x0172:
            r0.c()     // Catch:{ NumberFormatException -> 0x01b8 }
            r0.c = r9     // Catch:{ NumberFormatException -> 0x01b8 }
        L_0x0177:
            aucj r2 = r0.b     // Catch:{ NumberFormatException -> 0x01b8 }
            augq r2 = (defpackage.augq) r2     // Catch:{ NumberFormatException -> 0x01b8 }
            int r3 = r2.a     // Catch:{ NumberFormatException -> 0x01b8 }
            r3 = r3 | r6
            r2.a = r3     // Catch:{ NumberFormatException -> 0x01b8 }
            r2.d = r1     // Catch:{ NumberFormatException -> 0x01b8 }
            goto L_0x0010
        L_0x0184:
            boolean r1 = r0.c     // Catch:{ NumberFormatException -> 0x01b8 }
            if (r1 != 0) goto L_0x0189
            goto L_0x018e
        L_0x0189:
            r0.c()     // Catch:{ NumberFormatException -> 0x01b8 }
            r0.c = r9     // Catch:{ NumberFormatException -> 0x01b8 }
        L_0x018e:
            aucj r1 = r0.b     // Catch:{ NumberFormatException -> 0x01b8 }
            augq r1 = (defpackage.augq) r1     // Catch:{ NumberFormatException -> 0x01b8 }
            r3.getClass()     // Catch:{ NumberFormatException -> 0x01b8 }
            int r2 = r1.a     // Catch:{ NumberFormatException -> 0x01b8 }
            r2 = r2 | r7
            r1.a = r2     // Catch:{ NumberFormatException -> 0x01b8 }
            r1.c = r3     // Catch:{ NumberFormatException -> 0x01b8 }
            goto L_0x0010
        L_0x019e:
            boolean r1 = r0.c     // Catch:{ NumberFormatException -> 0x01b8 }
            if (r1 != 0) goto L_0x01a3
            goto L_0x01a8
        L_0x01a3:
            r0.c()     // Catch:{ NumberFormatException -> 0x01b8 }
            r0.c = r9     // Catch:{ NumberFormatException -> 0x01b8 }
        L_0x01a8:
            aucj r1 = r0.b     // Catch:{ NumberFormatException -> 0x01b8 }
            augq r1 = (defpackage.augq) r1     // Catch:{ NumberFormatException -> 0x01b8 }
            r3.getClass()     // Catch:{ NumberFormatException -> 0x01b8 }
            int r2 = r1.a     // Catch:{ NumberFormatException -> 0x01b8 }
            r2 = r2 | r8
            r1.a = r2     // Catch:{ NumberFormatException -> 0x01b8 }
            r1.b = r3     // Catch:{ NumberFormatException -> 0x01b8 }
            goto L_0x0010
        L_0x01b8:
            r1 = move-exception
            goto L_0x0010
        L_0x01bb:
            aucj r12 = r0.i()
            augq r12 = (defpackage.augq) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.actm.c(java.lang.String):augq");
    }

    private final void a(auhl auhl, String str) {
        List c = n.a(7).c(str);
        if (c.size() == 7) {
            aucd o2 = auhn.q.o();
            if (a(o2, (String) c.get(0), (String) c.get(6), (String) c.get(4))) {
                if (this.t && this.w.length() > 0) {
                    String sb = this.w.toString();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    auhn auhn = (auhn) o2.b;
                    sb.getClass();
                    auhn.a |= 8;
                    auhn.e = sb;
                }
                auhl.a(o2);
            } else if (this.t && ((long) this.v.length()) <= this.u) {
                String str2 = this.v;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                auhn auhn2 = (auhn) o2.b;
                str2.getClass();
                auhn2.a |= 8;
                auhn2.e = str2;
                auhl.a(o2);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v148, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: aucd} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(java.lang.String r39, defpackage.aucd r40) {
        /*
            r0 = r39
            r1 = r40
            java.util.regex.Pattern r2 = k
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r3 = r2.find()
            if (r3 == 0) goto L_0x0c90
            int r3 = r2.groupCount()
            r4 = 2
            if (r3 < r4) goto L_0x0c90
            r3 = 1
            java.lang.String r5 = r2.group(r3)
            java.lang.String r6 = "serialized_metrics"
            boolean r5 = r6.equals(r5)
            r6 = 0
            if (r5 == 0) goto L_0x005c
            java.lang.String r0 = r2.group(r4)
            auhq r2 = defpackage.auhq.a
            aucd r2 = r2.o()
            byte[] r0 = android.util.Base64.decode(r0, r3)     // Catch:{ IllegalArgumentException -> 0x0039, auda -> 0x0037 }
            r2.b(r0)     // Catch:{ IllegalArgumentException -> 0x0039, auda -> 0x0037 }
            goto L_0x003a
        L_0x0037:
            r0 = move-exception
            goto L_0x003a
        L_0x0039:
            r0 = move-exception
        L_0x003a:
            aucj r0 = r2.i()
            auhq r0 = (defpackage.auhq) r0
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x0045
            goto L_0x004a
        L_0x0045:
            r40.c()
            r1.c = r6
        L_0x004a:
            aucj r1 = r1.b
            auhn r1 = (defpackage.auhn) r1
            auhn r2 = defpackage.auhn.q
            r0.getClass()
            r1.m = r0
            int r0 = r1.a
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.a = r0
            return
        L_0x005c:
            auhh r2 = defpackage.auhh.b
            aucd r2 = r2.o()
            augz r2 = (defpackage.augz) r2
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.regex.Pattern r7 = l
            java.util.regex.Matcher r7 = r7.matcher(r0)
            r8 = 19
            java.lang.String[] r15 = new java.lang.String[r8]
            java.lang.String r0 = "/drm/widevine/cdm_engine/remove_keys"
            r15[r6] = r0
            java.lang.String r0 = "/drm/widevine/cdm_engine/unprovision"
            r15[r3] = r0
            java.lang.String r0 = "/drm/widevine/cdm_session/restore_offline_session"
            r15[r4] = r0
            java.lang.String r0 = "/drm/widevine/cdm_session/restore_usage_session"
            r14 = 3
            r15[r14] = r0
            java.lang.String r0 = "/drm/widevine/crypto_session/delete_all_usage_reports"
            r13 = 4
            r15[r13] = r0
            java.lang.String r0 = "/drm/widevine/crypto_session/delete_multiple_usage_information"
            r16 = 5
            r15[r16] = r0
            java.lang.String r0 = "/drm/widevine/crypto_session/get_device_unique_id"
            r17 = 6
            r15[r17] = r0
            java.lang.String r0 = "/drm/widevine/crypto_session/get_token"
            r18 = 7
            r15[r18] = r0
            java.lang.String r0 = "/drm/widevine/oemcrypto/close_session"
            r19 = 8
            r15[r19] = r0
            java.lang.String r0 = "/drm/widevine/oemcrypto/deactivate_usage_entry"
            r20 = 9
            r15[r20] = r0
            java.lang.String r0 = "/drm/widevine/oemcrypto/delete_usage_entry"
            r21 = 10
            r15[r21] = r0
            java.lang.String r0 = "/drm/widevine/oemcrypto/delete_usage_table"
            r22 = 11
            r15[r22] = r0
            java.lang.String r0 = "/drm/widevine/oemcrypto/force_delete_usage_entry"
            r23 = 12
            r15[r23] = r0
            java.lang.String r0 = "/drm/widevine/oemcrypto/generate_nonce"
            r24 = 13
            r15[r24] = r0
            java.lang.String r0 = "/drm/widevine/oemcrypto/get_device_id"
            r25 = 14
            r15[r25] = r0
            java.lang.String r0 = "/drm/widevine/oemcrypto/get_oem_public_certificate"
            r26 = 15
            r15[r26] = r0
            java.lang.String r0 = "/drm/widevine/oemcrypto/get_random"
            r12 = 16
            r15[r12] = r0
            java.lang.String r0 = "/drm/widevine/oemcrypto/report_usage"
            r27 = 17
            r15[r27] = r0
            java.lang.String r0 = "/drm/widevine/oemcrypto/update_usage_table"
            r28 = 18
            r15[r28] = r0
            java.lang.String r9 = "/drm/widevine/cdm_engine/close_session"
            java.lang.String r10 = "/drm/widevine/cdm_engine/find_session_for_key"
            java.lang.String r11 = "/drm/widevine/cdm_engine/open_key_set_session"
            java.lang.String r0 = "/drm/widevine/cdm_engine/open_session"
            java.lang.String r29 = "/drm/widevine/cdm_engine/release_all_usage_info"
            java.lang.String r30 = "/drm/widevine/cdm_engine/release_usage_info"
            r8 = 16
            r12 = r0
            r13 = r29
            r14 = r30
            anax r9 = defpackage.anax.a(r9, r10, r11, r12, r13, r14, r15)
            anax r10 = i()
            java.lang.String[] r0 = new java.lang.String[r8]
            java.lang.String r11 = "/drm/widevine/crypto_session/life_span"
            r0[r6] = r11
            java.lang.String r11 = "/drm/widevine/crypto_session/system_id"
            r0[r3] = r11
            java.lang.String r11 = "/drm/widevine/crypto_session/usage_information_support"
            r0[r4] = r11
            java.lang.String r11 = "/drm/widevine/oemcrypto/api_version"
            r12 = 3
            r0[r12] = r11
            java.lang.String r11 = "/drm/widevine/oemcrypto/current_hdcp_capability"
            r13 = 4
            r0[r13] = r11
            java.lang.String r11 = "/drm/widevine/oemcrypto/initialization_mode"
            r0[r16] = r11
            java.lang.String r11 = "/drm/widevine/oemcrypto/is_anti_rollback_hw_present"
            r0[r17] = r11
            java.lang.String r11 = "/drm/widevine/oemcrypto/is_keybox_valid"
            r0[r18] = r11
            java.lang.String r11 = "/drm/widevine/oemcrypto/l1_api_version"
            r0[r19] = r11
            java.lang.String r11 = "/drm/widevine/oemcrypto/l1_min_api_version"
            r0[r20] = r11
            java.lang.String r11 = "/drm/widevine/oemcrypto/max_hdcp_capability"
            r0[r21] = r11
            java.lang.String r11 = "/drm/widevine/oemcrypto/max_number_of_sessions"
            r0[r22] = r11
            java.lang.String r11 = "/drm/widevine/oemcrypto/number_of_open_sessions"
            r0[r23] = r11
            java.lang.String r11 = "/drm/widevine/oemcrypto/provisioning_method"
            r0[r24] = r11
            java.lang.String r11 = "/drm/widevine/oemcrypto/security_patch_level"
            r0[r25] = r11
            java.lang.String r11 = "/drm/widevine/oemcrypto/supports_usage_table"
            r0[r26] = r11
            java.lang.String r32 = "/drm/widevine/cdm_engine/life_span"
            java.lang.String r33 = "/drm/widevine/cdm_engine/version"
            java.lang.String r34 = "/drm/widevine/cdm_engine/creation_time_millis"
            java.lang.String r35 = "/drm/widevine/cdm_session/life_span"
            java.lang.String r36 = "/drm/widevine/cdm_session/session_id"
            java.lang.String r37 = "/drm/widevine/crypto_session/security_level"
            r38 = r0
            anax r11 = defpackage.anax.a(r32, r33, r34, r35, r36, r37, r38)
        L_0x014e:
            boolean r0 = r7.find()
            if (r0 == 0) goto L_0x0c08
            java.lang.String r0 = r7.group(r3)
            java.lang.String r14 = r7.group(r4)
            java.lang.String r15 = r7.group(r12)
            boolean r29 = r0.isEmpty()
            if (r29 != 0) goto L_0x0c01
            boolean r29 = r15.isEmpty()
            if (r29 != 0) goto L_0x0c01
            r13 = 47
            int r13 = r0.lastIndexOf(r13)
            r12 = -1
            if (r13 != r12) goto L_0x017c
            java.lang.String r13 = ""
            android.util.Pair r0 = android.util.Pair.create(r0, r13)
            goto L_0x01cc
        L_0x017c:
            int r29 = r0.length()
            int r3 = r29 + -1
            if (r13 == r3) goto L_0x01c5
            int r3 = r13 + 1
            java.lang.String r3 = r0.substring(r3)
            java.lang.String r12 = "min"
            boolean r12 = r3.equals(r12)
            if (r12 != 0) goto L_0x01bb
            java.lang.String r12 = "max"
            boolean r12 = r3.equals(r12)
            if (r12 != 0) goto L_0x01bb
            java.lang.String r12 = "mean"
            boolean r12 = r3.equals(r12)
            if (r12 != 0) goto L_0x01bb
            java.lang.String r12 = "variance"
            boolean r12 = r3.equals(r12)
            if (r12 != 0) goto L_0x01bb
            java.lang.String r12 = "count"
            boolean r12 = r3.equals(r12)
            if (r12 != 0) goto L_0x01bb
            java.lang.String r12 = "error"
            boolean r12 = r3.equals(r12)
            if (r12 != 0) goto L_0x01bb
            goto L_0x01c5
        L_0x01bb:
            java.lang.String r0 = r0.substring(r6, r13)
            android.util.Pair r0 = android.util.Pair.create(r0, r3)
            goto L_0x01cc
        L_0x01c5:
            java.lang.String r3 = ""
            android.util.Pair r0 = android.util.Pair.create(r0, r3)
        L_0x01cc:
            java.lang.Object r3 = r0.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            boolean r12 = r9.contains(r3)
            if (r12 != 0) goto L_0x070d
            boolean r12 = r10.contains(r3)
            if (r12 != 0) goto L_0x05c8
            boolean r12 = r11.contains(r3)
            if (r12 == 0) goto L_0x05c3
            auhb r12 = defpackage.auhb.aM
            aucd r12 = r12.o()
            int r13 = r3.hashCode()     // Catch:{ IllegalArgumentException -> 0x05be }
            switch(r13) {
                case -2033241002: goto L_0x02e1;
                case -1993781625: goto L_0x02d7;
                case -1712162924: goto L_0x02cc;
                case -1460367500: goto L_0x02c1;
                case -1151453074: goto L_0x02b7;
                case -164786607: goto L_0x02ad;
                case -154576279: goto L_0x02a2;
                case -150759046: goto L_0x0297;
                case -61601949: goto L_0x028c;
                case -45635319: goto L_0x0281;
                case 80541300: goto L_0x0275;
                case 352443465: goto L_0x0269;
                case 630042232: goto L_0x025d;
                case 679628265: goto L_0x0252;
                case 865873929: goto L_0x0247;
                case 1218176447: goto L_0x023c;
                case 1228332483: goto L_0x0231;
                case 1368014968: goto L_0x0225;
                case 1604831478: goto L_0x0219;
                case 1654781414: goto L_0x020e;
                case 1795670687: goto L_0x0202;
                case 1953721726: goto L_0x01f6;
                default: goto L_0x01f3;
            }     // Catch:{ IllegalArgumentException -> 0x05be }
        L_0x01f3:
            r14 = -1
            goto L_0x02eb
        L_0x01f6:
            java.lang.String r13 = "/drm/widevine/oemcrypto/current_hdcp_capability"
            boolean r3 = r3.equals(r13)     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 == 0) goto L_0x01f3
            r14 = 10
            goto L_0x02eb
        L_0x0202:
            java.lang.String r13 = "/drm/widevine/oemcrypto/supports_usage_table"
            boolean r3 = r3.equals(r13)     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 == 0) goto L_0x01f3
            r14 = 21
            goto L_0x02eb
        L_0x020e:
            java.lang.String r13 = "/drm/widevine/cdm_engine/life_span"
            boolean r3 = r3.equals(r13)     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 == 0) goto L_0x01f3
            r14 = 0
            goto L_0x02eb
        L_0x0219:
            java.lang.String r13 = "/drm/widevine/oemcrypto/l1_min_api_version"
            boolean r3 = r3.equals(r13)     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 == 0) goto L_0x01f3
            r14 = 15
            goto L_0x02eb
        L_0x0225:
            java.lang.String r13 = "/drm/widevine/oemcrypto/initialization_mode"
            boolean r3 = r3.equals(r13)     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 == 0) goto L_0x01f3
            r14 = 11
            goto L_0x02eb
        L_0x0231:
            java.lang.String r13 = "/drm/widevine/cdm_session/session_id"
            boolean r3 = r3.equals(r13)     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 == 0) goto L_0x01f3
            r14 = 4
            goto L_0x02eb
        L_0x023c:
            java.lang.String r13 = "/drm/widevine/cdm_engine/creation_time_millis"
            boolean r3 = r3.equals(r13)     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 == 0) goto L_0x01f3
            r14 = 2
            goto L_0x02eb
        L_0x0247:
            java.lang.String r13 = "/drm/widevine/crypto_session/life_span"
            boolean r3 = r3.equals(r13)     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 == 0) goto L_0x01f3
            r14 = 6
            goto L_0x02eb
        L_0x0252:
            java.lang.String r13 = "/drm/widevine/crypto_session/security_level"
            boolean r3 = r3.equals(r13)     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 == 0) goto L_0x01f3
            r14 = 5
            goto L_0x02eb
        L_0x025d:
            java.lang.String r13 = "/drm/widevine/oemcrypto/security_patch_level"
            boolean r3 = r3.equals(r13)     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 == 0) goto L_0x01f3
            r14 = 20
            goto L_0x02eb
        L_0x0269:
            java.lang.String r13 = "/drm/widevine/oemcrypto/api_version"
            boolean r3 = r3.equals(r13)     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 == 0) goto L_0x01f3
            r14 = 9
            goto L_0x02eb
        L_0x0275:
            java.lang.String r13 = "/drm/widevine/oemcrypto/max_number_of_sessions"
            boolean r3 = r3.equals(r13)     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 == 0) goto L_0x01f3
            r14 = 17
            goto L_0x02eb
        L_0x0281:
            java.lang.String r13 = "/drm/widevine/oemcrypto/provisioning_method"
            boolean r3 = r3.equals(r13)     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 == 0) goto L_0x01f3
            r14 = 19
            goto L_0x02eb
        L_0x028c:
            java.lang.String r13 = "/drm/widevine/oemcrypto/l1_api_version"
            boolean r3 = r3.equals(r13)     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 == 0) goto L_0x01f3
            r14 = 14
            goto L_0x02eb
        L_0x0297:
            java.lang.String r13 = "/drm/widevine/crypto_session/usage_information_support"
            boolean r3 = r3.equals(r13)     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 == 0) goto L_0x01f3
            r14 = 8
            goto L_0x02eb
        L_0x02a2:
            java.lang.String r13 = "/drm/widevine/oemcrypto/max_hdcp_capability"
            boolean r3 = r3.equals(r13)     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 == 0) goto L_0x01f3
            r14 = 16
            goto L_0x02eb
        L_0x02ad:
            java.lang.String r13 = "/drm/widevine/cdm_engine/version"
            boolean r3 = r3.equals(r13)     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 == 0) goto L_0x01f3
            r14 = 1
            goto L_0x02eb
        L_0x02b7:
            java.lang.String r13 = "/drm/widevine/cdm_session/life_span"
            boolean r3 = r3.equals(r13)     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 == 0) goto L_0x01f3
            r14 = 3
            goto L_0x02eb
        L_0x02c1:
            java.lang.String r13 = "/drm/widevine/oemcrypto/is_anti_rollback_hw_present"
            boolean r3 = r3.equals(r13)     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 == 0) goto L_0x01f3
            r14 = 12
            goto L_0x02eb
        L_0x02cc:
            java.lang.String r13 = "/drm/widevine/oemcrypto/is_keybox_valid"
            boolean r3 = r3.equals(r13)     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 == 0) goto L_0x01f3
            r14 = 13
            goto L_0x02eb
        L_0x02d7:
            java.lang.String r13 = "/drm/widevine/crypto_session/system_id"
            boolean r3 = r3.equals(r13)     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 == 0) goto L_0x01f3
            r14 = 7
            goto L_0x02eb
        L_0x02e1:
            java.lang.String r13 = "/drm/widevine/oemcrypto/number_of_open_sessions"
            boolean r3 = r3.equals(r13)     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 == 0) goto L_0x01f3
            r14 = 18
        L_0x02eb:
            switch(r14) {
                case 0: goto L_0x0598;
                case 1: goto L_0x0577;
                case 2: goto L_0x0558;
                case 3: goto L_0x0537;
                case 4: goto L_0x0516;
                case 5: goto L_0x04f5;
                case 6: goto L_0x04d5;
                case 7: goto L_0x04b6;
                case 8: goto L_0x0496;
                case 9: goto L_0x0476;
                case 10: goto L_0x0456;
                case 11: goto L_0x0435;
                case 12: goto L_0x0414;
                case 13: goto L_0x03f4;
                case 14: goto L_0x03d3;
                case 15: goto L_0x03b2;
                case 16: goto L_0x0392;
                case 17: goto L_0x0373;
                case 18: goto L_0x0353;
                case 19: goto L_0x0333;
                case 20: goto L_0x0313;
                case 21: goto L_0x02f3;
                default: goto L_0x02ee;
            }     // Catch:{ IllegalArgumentException -> 0x05be }
        L_0x02ee:
            r3 = 1
            r12 = 3
            r13 = 4
            goto L_0x014e
        L_0x02f3:
            auhg r0 = a(r15, r0, r4)     // Catch:{ IllegalArgumentException -> 0x05be }
            boolean r3 = r12.c     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 != 0) goto L_0x02fd
            goto L_0x0302
        L_0x02fd:
            r12.c()     // Catch:{ IllegalArgumentException -> 0x05be }
            r12.c = r6     // Catch:{ IllegalArgumentException -> 0x05be }
        L_0x0302:
            aucj r3 = r12.b     // Catch:{ IllegalArgumentException -> 0x05be }
            auhb r3 = (defpackage.auhb) r3     // Catch:{ IllegalArgumentException -> 0x05be }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x05be }
            r3.aG = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            int r0 = r3.c     // Catch:{ IllegalArgumentException -> 0x05be }
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r3.c = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            goto L_0x05b6
        L_0x0313:
            auhg r0 = a(r15, r0, r4)     // Catch:{ IllegalArgumentException -> 0x05be }
            boolean r3 = r12.c     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 != 0) goto L_0x031d
            goto L_0x0322
        L_0x031d:
            r12.c()     // Catch:{ IllegalArgumentException -> 0x05be }
            r12.c = r6     // Catch:{ IllegalArgumentException -> 0x05be }
        L_0x0322:
            aucj r3 = r12.b     // Catch:{ IllegalArgumentException -> 0x05be }
            auhb r3 = (defpackage.auhb) r3     // Catch:{ IllegalArgumentException -> 0x05be }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x05be }
            r3.aE = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            int r0 = r3.c     // Catch:{ IllegalArgumentException -> 0x05be }
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r3.c = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            goto L_0x05b6
        L_0x0333:
            auhg r0 = a(r15, r0, r4)     // Catch:{ IllegalArgumentException -> 0x05be }
            boolean r3 = r12.c     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 != 0) goto L_0x033d
            goto L_0x0342
        L_0x033d:
            r12.c()     // Catch:{ IllegalArgumentException -> 0x05be }
            r12.c = r6     // Catch:{ IllegalArgumentException -> 0x05be }
        L_0x0342:
            aucj r3 = r12.b     // Catch:{ IllegalArgumentException -> 0x05be }
            auhb r3 = (defpackage.auhb) r3     // Catch:{ IllegalArgumentException -> 0x05be }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x05be }
            r3.az = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            int r0 = r3.c     // Catch:{ IllegalArgumentException -> 0x05be }
            r0 = r0 | 64
            r3.c = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            goto L_0x05b6
        L_0x0353:
            auhg r0 = a(r15, r0, r4)     // Catch:{ IllegalArgumentException -> 0x05be }
            boolean r3 = r12.c     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 != 0) goto L_0x035d
            goto L_0x0362
        L_0x035d:
            r12.c()     // Catch:{ IllegalArgumentException -> 0x05be }
            r12.c = r6     // Catch:{ IllegalArgumentException -> 0x05be }
        L_0x0362:
            aucj r3 = r12.b     // Catch:{ IllegalArgumentException -> 0x05be }
            auhb r3 = (defpackage.auhb) r3     // Catch:{ IllegalArgumentException -> 0x05be }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x05be }
            r3.ay = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            int r0 = r3.c     // Catch:{ IllegalArgumentException -> 0x05be }
            r0 = r0 | 32
            r3.c = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            goto L_0x05b6
        L_0x0373:
            auhg r0 = a(r15, r0, r4)     // Catch:{ IllegalArgumentException -> 0x05be }
            boolean r3 = r12.c     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 != 0) goto L_0x037d
            goto L_0x0382
        L_0x037d:
            r12.c()     // Catch:{ IllegalArgumentException -> 0x05be }
            r12.c = r6     // Catch:{ IllegalArgumentException -> 0x05be }
        L_0x0382:
            aucj r3 = r12.b     // Catch:{ IllegalArgumentException -> 0x05be }
            auhb r3 = (defpackage.auhb) r3     // Catch:{ IllegalArgumentException -> 0x05be }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x05be }
            r3.ax = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            int r0 = r3.c     // Catch:{ IllegalArgumentException -> 0x05be }
            r0 = r0 | r8
            r3.c = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            goto L_0x05b6
        L_0x0392:
            auhg r0 = a(r15, r0, r4)     // Catch:{ IllegalArgumentException -> 0x05be }
            boolean r3 = r12.c     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 != 0) goto L_0x039c
            goto L_0x03a1
        L_0x039c:
            r12.c()     // Catch:{ IllegalArgumentException -> 0x05be }
            r12.c = r6     // Catch:{ IllegalArgumentException -> 0x05be }
        L_0x03a1:
            aucj r3 = r12.b     // Catch:{ IllegalArgumentException -> 0x05be }
            auhb r3 = (defpackage.auhb) r3     // Catch:{ IllegalArgumentException -> 0x05be }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x05be }
            r3.aw = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            int r0 = r3.c     // Catch:{ IllegalArgumentException -> 0x05be }
            r0 = r0 | 8
            r3.c = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            goto L_0x05b6
        L_0x03b2:
            auhg r0 = a(r15, r0, r4)     // Catch:{ IllegalArgumentException -> 0x05be }
            boolean r3 = r12.c     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 != 0) goto L_0x03bc
            goto L_0x03c1
        L_0x03bc:
            r12.c()     // Catch:{ IllegalArgumentException -> 0x05be }
            r12.c = r6     // Catch:{ IllegalArgumentException -> 0x05be }
        L_0x03c1:
            aucj r3 = r12.b     // Catch:{ IllegalArgumentException -> 0x05be }
            auhb r3 = (defpackage.auhb) r3     // Catch:{ IllegalArgumentException -> 0x05be }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x05be }
            r3.aL = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            int r0 = r3.c     // Catch:{ IllegalArgumentException -> 0x05be }
            r13 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 | r13
            r3.c = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            goto L_0x05b6
        L_0x03d3:
            auhg r0 = a(r15, r0, r4)     // Catch:{ IllegalArgumentException -> 0x05be }
            boolean r3 = r12.c     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 != 0) goto L_0x03dd
            goto L_0x03e2
        L_0x03dd:
            r12.c()     // Catch:{ IllegalArgumentException -> 0x05be }
            r12.c = r6     // Catch:{ IllegalArgumentException -> 0x05be }
        L_0x03e2:
            aucj r3 = r12.b     // Catch:{ IllegalArgumentException -> 0x05be }
            auhb r3 = (defpackage.auhb) r3     // Catch:{ IllegalArgumentException -> 0x05be }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x05be }
            r3.aK = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            int r0 = r3.c     // Catch:{ IllegalArgumentException -> 0x05be }
            r13 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 | r13
            r3.c = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            goto L_0x05b6
        L_0x03f4:
            auhg r0 = a(r15, r0, r4)     // Catch:{ IllegalArgumentException -> 0x05be }
            boolean r3 = r12.c     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 != 0) goto L_0x03fe
            goto L_0x0403
        L_0x03fe:
            r12.c()     // Catch:{ IllegalArgumentException -> 0x05be }
            r12.c = r6     // Catch:{ IllegalArgumentException -> 0x05be }
        L_0x0403:
            aucj r3 = r12.b     // Catch:{ IllegalArgumentException -> 0x05be }
            auhb r3 = (defpackage.auhb) r3     // Catch:{ IllegalArgumentException -> 0x05be }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x05be }
            r3.at = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            int r0 = r3.c     // Catch:{ IllegalArgumentException -> 0x05be }
            r13 = 1
            r0 = r0 | r13
            r3.c = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            goto L_0x05b6
        L_0x0414:
            auhg r0 = a(r15, r0, r4)     // Catch:{ IllegalArgumentException -> 0x05be }
            boolean r3 = r12.c     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 != 0) goto L_0x041e
            goto L_0x0423
        L_0x041e:
            r12.c()     // Catch:{ IllegalArgumentException -> 0x05be }
            r12.c = r6     // Catch:{ IllegalArgumentException -> 0x05be }
        L_0x0423:
            aucj r3 = r12.b     // Catch:{ IllegalArgumentException -> 0x05be }
            auhb r3 = (defpackage.auhb) r3     // Catch:{ IllegalArgumentException -> 0x05be }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x05be }
            r3.as = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            int r0 = r3.b     // Catch:{ IllegalArgumentException -> 0x05be }
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r13
            r3.b = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            goto L_0x05b6
        L_0x0435:
            auhg r0 = a(r15, r0, r4)     // Catch:{ IllegalArgumentException -> 0x05be }
            boolean r3 = r12.c     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 != 0) goto L_0x043f
            goto L_0x0444
        L_0x043f:
            r12.c()     // Catch:{ IllegalArgumentException -> 0x05be }
            r12.c = r6     // Catch:{ IllegalArgumentException -> 0x05be }
        L_0x0444:
            aucj r3 = r12.b     // Catch:{ IllegalArgumentException -> 0x05be }
            auhb r3 = (defpackage.auhb) r3     // Catch:{ IllegalArgumentException -> 0x05be }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x05be }
            r3.aJ = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            int r0 = r3.c     // Catch:{ IllegalArgumentException -> 0x05be }
            r13 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 | r13
            r3.c = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            goto L_0x05b6
        L_0x0456:
            auhg r0 = a(r15, r0, r4)     // Catch:{ IllegalArgumentException -> 0x05be }
            boolean r3 = r12.c     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 != 0) goto L_0x0460
            goto L_0x0465
        L_0x0460:
            r12.c()     // Catch:{ IllegalArgumentException -> 0x05be }
            r12.c = r6     // Catch:{ IllegalArgumentException -> 0x05be }
        L_0x0465:
            aucj r3 = r12.b     // Catch:{ IllegalArgumentException -> 0x05be }
            auhb r3 = (defpackage.auhb) r3     // Catch:{ IllegalArgumentException -> 0x05be }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x05be }
            r3.X = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            int r0 = r3.b     // Catch:{ IllegalArgumentException -> 0x05be }
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r3.b = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            goto L_0x05b6
        L_0x0476:
            auhg r0 = a(r15, r0, r4)     // Catch:{ IllegalArgumentException -> 0x05be }
            boolean r3 = r12.c     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 != 0) goto L_0x0480
            goto L_0x0485
        L_0x0480:
            r12.c()     // Catch:{ IllegalArgumentException -> 0x05be }
            r12.c = r6     // Catch:{ IllegalArgumentException -> 0x05be }
        L_0x0485:
            aucj r3 = r12.b     // Catch:{ IllegalArgumentException -> 0x05be }
            auhb r3 = (defpackage.auhb) r3     // Catch:{ IllegalArgumentException -> 0x05be }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x05be }
            r3.Q = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            int r0 = r3.b     // Catch:{ IllegalArgumentException -> 0x05be }
            r0 = r0 | 128(0x80, float:1.794E-43)
            r3.b = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            goto L_0x05b6
        L_0x0496:
            auhg r0 = a(r15, r0, r4)     // Catch:{ IllegalArgumentException -> 0x05be }
            boolean r3 = r12.c     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 != 0) goto L_0x04a0
            goto L_0x04a5
        L_0x04a0:
            r12.c()     // Catch:{ IllegalArgumentException -> 0x05be }
            r12.c = r6     // Catch:{ IllegalArgumentException -> 0x05be }
        L_0x04a5:
            aucj r3 = r12.b     // Catch:{ IllegalArgumentException -> 0x05be }
            auhb r3 = (defpackage.auhb) r3     // Catch:{ IllegalArgumentException -> 0x05be }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x05be }
            r3.P = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            int r0 = r3.b     // Catch:{ IllegalArgumentException -> 0x05be }
            r0 = r0 | 64
            r3.b = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            goto L_0x05b6
        L_0x04b6:
            auhg r0 = a(r15, r0, r4)     // Catch:{ IllegalArgumentException -> 0x05be }
            boolean r3 = r12.c     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 != 0) goto L_0x04c0
            goto L_0x04c5
        L_0x04c0:
            r12.c()     // Catch:{ IllegalArgumentException -> 0x05be }
            r12.c = r6     // Catch:{ IllegalArgumentException -> 0x05be }
        L_0x04c5:
            aucj r3 = r12.b     // Catch:{ IllegalArgumentException -> 0x05be }
            auhb r3 = (defpackage.auhb) r3     // Catch:{ IllegalArgumentException -> 0x05be }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x05be }
            r3.N = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            int r0 = r3.b     // Catch:{ IllegalArgumentException -> 0x05be }
            r0 = r0 | r8
            r3.b = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            goto L_0x05b6
        L_0x04d5:
            r3 = 3
            auhg r0 = a(r15, r0, r3)     // Catch:{ IllegalArgumentException -> 0x05be }
            boolean r3 = r12.c     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 != 0) goto L_0x04e0
            goto L_0x04e5
        L_0x04e0:
            r12.c()     // Catch:{ IllegalArgumentException -> 0x05be }
            r12.c = r6     // Catch:{ IllegalArgumentException -> 0x05be }
        L_0x04e5:
            aucj r3 = r12.b     // Catch:{ IllegalArgumentException -> 0x05be }
            auhb r3 = (defpackage.auhb) r3     // Catch:{ IllegalArgumentException -> 0x05be }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x05be }
            r3.K = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            int r0 = r3.b     // Catch:{ IllegalArgumentException -> 0x05be }
            r0 = r0 | r4
            r3.b = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            goto L_0x05b6
        L_0x04f5:
            auhg r0 = a(r15, r0, r4)     // Catch:{ IllegalArgumentException -> 0x05be }
            boolean r3 = r12.c     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 != 0) goto L_0x04ff
            goto L_0x0504
        L_0x04ff:
            r12.c()     // Catch:{ IllegalArgumentException -> 0x05be }
            r12.c = r6     // Catch:{ IllegalArgumentException -> 0x05be }
        L_0x0504:
            aucj r3 = r12.b     // Catch:{ IllegalArgumentException -> 0x05be }
            auhb r3 = (defpackage.auhb) r3     // Catch:{ IllegalArgumentException -> 0x05be }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x05be }
            r3.A = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            int r0 = r3.a     // Catch:{ IllegalArgumentException -> 0x05be }
            r13 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 | r13
            r3.a = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            goto L_0x05b6
        L_0x0516:
            r3 = 1
            auhg r0 = a(r15, r0, r3)     // Catch:{ IllegalArgumentException -> 0x05be }
            boolean r3 = r12.c     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 != 0) goto L_0x0521
            goto L_0x0526
        L_0x0521:
            r12.c()     // Catch:{ IllegalArgumentException -> 0x05be }
            r12.c = r6     // Catch:{ IllegalArgumentException -> 0x05be }
        L_0x0526:
            aucj r3 = r12.b     // Catch:{ IllegalArgumentException -> 0x05be }
            auhb r3 = (defpackage.auhb) r3     // Catch:{ IllegalArgumentException -> 0x05be }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x05be }
            r3.J = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            int r0 = r3.b     // Catch:{ IllegalArgumentException -> 0x05be }
            r13 = 1
            r0 = r0 | r13
            r3.b = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            goto L_0x05b6
        L_0x0537:
            r3 = 3
            auhg r0 = a(r15, r0, r3)     // Catch:{ IllegalArgumentException -> 0x05be }
            boolean r3 = r12.c     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 != 0) goto L_0x0542
            goto L_0x0547
        L_0x0542:
            r12.c()     // Catch:{ IllegalArgumentException -> 0x05be }
            r12.c = r6     // Catch:{ IllegalArgumentException -> 0x05be }
        L_0x0547:
            aucj r3 = r12.b     // Catch:{ IllegalArgumentException -> 0x05be }
            auhb r3 = (defpackage.auhb) r3     // Catch:{ IllegalArgumentException -> 0x05be }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x05be }
            r3.w = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            int r0 = r3.a     // Catch:{ IllegalArgumentException -> 0x05be }
            r13 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 | r13
            r3.a = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            goto L_0x05b6
        L_0x0558:
            auhg r0 = a(r15, r0, r4)     // Catch:{ IllegalArgumentException -> 0x05be }
            boolean r3 = r12.c     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 != 0) goto L_0x0562
            goto L_0x0567
        L_0x0562:
            r12.c()     // Catch:{ IllegalArgumentException -> 0x05be }
            r12.c = r6     // Catch:{ IllegalArgumentException -> 0x05be }
        L_0x0567:
            aucj r3 = r12.b     // Catch:{ IllegalArgumentException -> 0x05be }
            auhb r3 = (defpackage.auhb) r3     // Catch:{ IllegalArgumentException -> 0x05be }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x05be }
            r3.f = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            int r0 = r3.a     // Catch:{ IllegalArgumentException -> 0x05be }
            r13 = 4
            r0 = r0 | r13
            r3.a = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            goto L_0x05b6
        L_0x0577:
            r3 = 1
            auhg r0 = a(r15, r0, r3)     // Catch:{ IllegalArgumentException -> 0x05be }
            boolean r3 = r12.c     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 != 0) goto L_0x0582
            goto L_0x0587
        L_0x0582:
            r12.c()     // Catch:{ IllegalArgumentException -> 0x05be }
            r12.c = r6     // Catch:{ IllegalArgumentException -> 0x05be }
        L_0x0587:
            aucj r3 = r12.b     // Catch:{ IllegalArgumentException -> 0x05be }
            auhb r3 = (defpackage.auhb) r3     // Catch:{ IllegalArgumentException -> 0x05be }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x05be }
            r3.v = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            int r0 = r3.a     // Catch:{ IllegalArgumentException -> 0x05be }
            r13 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 | r13
            r3.a = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            goto L_0x05b6
        L_0x0598:
            r3 = 3
            auhg r0 = a(r15, r0, r3)     // Catch:{ IllegalArgumentException -> 0x05be }
            boolean r3 = r12.c     // Catch:{ IllegalArgumentException -> 0x05be }
            if (r3 != 0) goto L_0x05a2
            goto L_0x05a7
        L_0x05a2:
            r12.c()     // Catch:{ IllegalArgumentException -> 0x05be }
            r12.c = r6     // Catch:{ IllegalArgumentException -> 0x05be }
        L_0x05a7:
            aucj r3 = r12.b     // Catch:{ IllegalArgumentException -> 0x05be }
            auhb r3 = (defpackage.auhb) r3     // Catch:{ IllegalArgumentException -> 0x05be }
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x05be }
            r3.m = r0     // Catch:{ IllegalArgumentException -> 0x05be }
            int r0 = r3.a     // Catch:{ IllegalArgumentException -> 0x05be }
            r0 = r0 | 512(0x200, float:7.175E-43)
            r3.a = r0     // Catch:{ IllegalArgumentException -> 0x05be }
        L_0x05b6:
            r2.a(r12)
            r3 = 1
            r12 = 3
            r13 = 4
            goto L_0x014e
        L_0x05be:
            r0 = move-exception
            r3 = 1
            r12 = 3
            goto L_0x070a
        L_0x05c3:
            r3 = 1
            r12 = 3
            r13 = 4
            goto L_0x014e
        L_0x05c8:
            android.util.Pair r3 = android.util.Pair.create(r3, r14)
            java.lang.Object r12 = r5.get(r3)
            android.util.Pair r12 = (android.util.Pair) r12
            if (r12 != 0) goto L_0x060a
            auhe r12 = defpackage.auhe.d
            aucd r12 = r12.o()
            boolean r13 = r14.isEmpty()
            if (r13 != 0) goto L_0x05fc
            auhd r13 = g(r14)
            boolean r14 = r12.c
            if (r14 != 0) goto L_0x05e9
            goto L_0x05ee
        L_0x05e9:
            r12.c()
            r12.c = r6
        L_0x05ee:
            aucj r14 = r12.b
            auhe r14 = (defpackage.auhe) r14
            r13.getClass()
            r14.c = r13
            int r13 = r14.a
            r13 = r13 | r4
            r14.a = r13
        L_0x05fc:
            auhc r13 = defpackage.auhc.g
            aucd r13 = r13.o()
            android.util.Pair r12 = android.util.Pair.create(r12, r13)
            r5.put(r3, r12)
            goto L_0x060f
        L_0x060a:
            java.lang.Object r3 = r12.second
            r13 = r3
            aucd r13 = (defpackage.aucd) r13
        L_0x060f:
            int r3 = r0.hashCode()     // Catch:{ IllegalArgumentException -> 0x0705 }
            switch(r3) {
                case -1249575311: goto L_0x0640;
                case 107876: goto L_0x0636;
                case 108114: goto L_0x062c;
                case 3347397: goto L_0x0622;
                case 94851343: goto L_0x0618;
                default: goto L_0x0616;
            }     // Catch:{ IllegalArgumentException -> 0x0705 }
        L_0x0616:
            r14 = -1
            goto L_0x0649
        L_0x0618:
            java.lang.String r3 = "count"
            boolean r0 = r0.equals(r3)     // Catch:{ IllegalArgumentException -> 0x0705 }
            if (r0 == 0) goto L_0x0616
            r14 = 4
            goto L_0x0649
        L_0x0622:
            java.lang.String r3 = "mean"
            boolean r0 = r0.equals(r3)     // Catch:{ IllegalArgumentException -> 0x0705 }
            if (r0 == 0) goto L_0x0616
            r14 = 2
            goto L_0x0649
        L_0x062c:
            java.lang.String r3 = "min"
            boolean r0 = r0.equals(r3)     // Catch:{ IllegalArgumentException -> 0x0705 }
            if (r0 == 0) goto L_0x0616
            r14 = 0
            goto L_0x0649
        L_0x0636:
            java.lang.String r3 = "max"
            boolean r0 = r0.equals(r3)     // Catch:{ IllegalArgumentException -> 0x0705 }
            if (r0 == 0) goto L_0x0616
            r14 = 1
            goto L_0x0649
        L_0x0640:
            java.lang.String r3 = "variance"
            boolean r0 = r0.equals(r3)     // Catch:{ IllegalArgumentException -> 0x0705 }
            if (r0 == 0) goto L_0x0616
            r14 = 3
        L_0x0649:
            if (r14 == 0) goto L_0x06e0
            r3 = 1
            if (r14 == r3) goto L_0x06be
            if (r14 == r4) goto L_0x0699
            r12 = 3
            if (r14 == r12) goto L_0x0679
            r3 = 4
            if (r14 == r3) goto L_0x065a
            r3 = 1
            r13 = 4
            goto L_0x014e
        L_0x065a:
            long r14 = java.lang.Long.parseLong(r15)     // Catch:{ IllegalArgumentException -> 0x06bc }
            boolean r0 = r13.c     // Catch:{ IllegalArgumentException -> 0x06bc }
            if (r0 != 0) goto L_0x0663
            goto L_0x0668
        L_0x0663:
            r13.c()     // Catch:{ IllegalArgumentException -> 0x06bc }
            r13.c = r6     // Catch:{ IllegalArgumentException -> 0x06bc }
        L_0x0668:
            aucj r0 = r13.b     // Catch:{ IllegalArgumentException -> 0x06bc }
            auhc r0 = (defpackage.auhc) r0     // Catch:{ IllegalArgumentException -> 0x06bc }
            auhc r3 = defpackage.auhc.g     // Catch:{ IllegalArgumentException -> 0x06bc }
            int r3 = r0.a     // Catch:{ IllegalArgumentException -> 0x06bc }
            r3 = r3 | r8
            r0.a = r3     // Catch:{ IllegalArgumentException -> 0x06bc }
            r0.f = r14     // Catch:{ IllegalArgumentException -> 0x06bc }
            r3 = 1
            r13 = 4
            goto L_0x014e
        L_0x0679:
            double r14 = java.lang.Double.parseDouble(r15)     // Catch:{ IllegalArgumentException -> 0x06bc }
            boolean r0 = r13.c     // Catch:{ IllegalArgumentException -> 0x06bc }
            if (r0 != 0) goto L_0x0682
            goto L_0x0687
        L_0x0682:
            r13.c()     // Catch:{ IllegalArgumentException -> 0x06bc }
            r13.c = r6     // Catch:{ IllegalArgumentException -> 0x06bc }
        L_0x0687:
            aucj r0 = r13.b     // Catch:{ IllegalArgumentException -> 0x06bc }
            auhc r0 = (defpackage.auhc) r0     // Catch:{ IllegalArgumentException -> 0x06bc }
            auhc r3 = defpackage.auhc.g     // Catch:{ IllegalArgumentException -> 0x06bc }
            int r3 = r0.a     // Catch:{ IllegalArgumentException -> 0x06bc }
            r3 = r3 | 8
            r0.a = r3     // Catch:{ IllegalArgumentException -> 0x06bc }
            r0.e = r14     // Catch:{ IllegalArgumentException -> 0x06bc }
            r3 = 1
            r13 = 4
            goto L_0x014e
        L_0x0699:
            r12 = 3
            double r14 = java.lang.Double.parseDouble(r15)     // Catch:{ IllegalArgumentException -> 0x06bc }
            boolean r0 = r13.c     // Catch:{ IllegalArgumentException -> 0x06bc }
            if (r0 != 0) goto L_0x06a3
            goto L_0x06a8
        L_0x06a3:
            r13.c()     // Catch:{ IllegalArgumentException -> 0x06bc }
            r13.c = r6     // Catch:{ IllegalArgumentException -> 0x06bc }
        L_0x06a8:
            aucj r0 = r13.b     // Catch:{ IllegalArgumentException -> 0x06bc }
            auhc r0 = (defpackage.auhc) r0     // Catch:{ IllegalArgumentException -> 0x06bc }
            auhc r3 = defpackage.auhc.g     // Catch:{ IllegalArgumentException -> 0x06bc }
            int r3 = r0.a     // Catch:{ IllegalArgumentException -> 0x06bc }
            r31 = 4
            r3 = r3 | 4
            r0.a = r3     // Catch:{ IllegalArgumentException -> 0x0703 }
            r0.d = r14     // Catch:{ IllegalArgumentException -> 0x0703 }
            r3 = 1
            r13 = 4
            goto L_0x014e
        L_0x06bc:
            r0 = move-exception
            goto L_0x0707
        L_0x06be:
            r12 = 3
            r31 = 4
            double r14 = java.lang.Double.parseDouble(r15)     // Catch:{ IllegalArgumentException -> 0x0703 }
            boolean r0 = r13.c     // Catch:{ IllegalArgumentException -> 0x0703 }
            if (r0 != 0) goto L_0x06ca
            goto L_0x06cf
        L_0x06ca:
            r13.c()     // Catch:{ IllegalArgumentException -> 0x0703 }
            r13.c = r6     // Catch:{ IllegalArgumentException -> 0x0703 }
        L_0x06cf:
            aucj r0 = r13.b     // Catch:{ IllegalArgumentException -> 0x0703 }
            auhc r0 = (defpackage.auhc) r0     // Catch:{ IllegalArgumentException -> 0x0703 }
            auhc r3 = defpackage.auhc.g     // Catch:{ IllegalArgumentException -> 0x0703 }
            int r3 = r0.a     // Catch:{ IllegalArgumentException -> 0x0703 }
            r3 = r3 | r4
            r0.a = r3     // Catch:{ IllegalArgumentException -> 0x0703 }
            r0.c = r14     // Catch:{ IllegalArgumentException -> 0x0703 }
            r3 = 1
            r13 = 4
            goto L_0x014e
        L_0x06e0:
            r12 = 3
            r31 = 4
            double r14 = java.lang.Double.parseDouble(r15)     // Catch:{ IllegalArgumentException -> 0x0703 }
            boolean r0 = r13.c     // Catch:{ IllegalArgumentException -> 0x0703 }
            if (r0 != 0) goto L_0x06ec
            goto L_0x06f1
        L_0x06ec:
            r13.c()     // Catch:{ IllegalArgumentException -> 0x0703 }
            r13.c = r6     // Catch:{ IllegalArgumentException -> 0x0703 }
        L_0x06f1:
            aucj r0 = r13.b     // Catch:{ IllegalArgumentException -> 0x0703 }
            auhc r0 = (defpackage.auhc) r0     // Catch:{ IllegalArgumentException -> 0x0703 }
            auhc r3 = defpackage.auhc.g     // Catch:{ IllegalArgumentException -> 0x0703 }
            int r3 = r0.a     // Catch:{ IllegalArgumentException -> 0x0703 }
            r13 = 1
            r3 = r3 | r13
            r0.a = r3     // Catch:{ IllegalArgumentException -> 0x0703 }
            r0.b = r14     // Catch:{ IllegalArgumentException -> 0x0703 }
            r3 = 1
            r13 = 4
            goto L_0x014e
        L_0x0703:
            r0 = move-exception
            goto L_0x0709
        L_0x0705:
            r0 = move-exception
            r12 = 3
        L_0x0707:
            r31 = 4
        L_0x0709:
            r3 = 1
        L_0x070a:
            r13 = 4
            goto L_0x014e
        L_0x070d:
            r12 = 3
            r31 = 4
            auhb r0 = defpackage.auhb.aM
            aucd r13 = r0.o()
            auha r0 = defpackage.auha.d
            aucd r12 = r0.o()
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x073d
            auhd r0 = g(r14)
            boolean r14 = r12.c
            if (r14 == 0) goto L_0x072f
            r12.c()
            r12.c = r6
        L_0x072f:
            aucj r14 = r12.b
            auha r14 = (defpackage.auha) r14
            r0.getClass()
            r14.c = r0
            int r0 = r14.a
            r0 = r0 | r4
            r14.a = r0
        L_0x073d:
            long r14 = java.lang.Long.parseLong(r15)     // Catch:{ IllegalArgumentException -> 0x075a }
            boolean r0 = r12.c     // Catch:{ IllegalArgumentException -> 0x075a }
            if (r0 != 0) goto L_0x0746
            goto L_0x074b
        L_0x0746:
            r12.c()     // Catch:{ IllegalArgumentException -> 0x075a }
            r12.c = r6     // Catch:{ IllegalArgumentException -> 0x075a }
        L_0x074b:
            aucj r0 = r12.b     // Catch:{ IllegalArgumentException -> 0x075a }
            auha r0 = (defpackage.auha) r0     // Catch:{ IllegalArgumentException -> 0x075a }
            int r4 = r0.a     // Catch:{ IllegalArgumentException -> 0x075a }
            r30 = 1
            r4 = r4 | 1
            r0.a = r4     // Catch:{ IllegalArgumentException -> 0x075a }
            r0.b = r14     // Catch:{ IllegalArgumentException -> 0x075a }
            goto L_0x0773
        L_0x075a:
            r0 = move-exception
            boolean r0 = r12.c
            if (r0 != 0) goto L_0x0760
            goto L_0x0765
        L_0x0760:
            r12.c()
            r12.c = r6
        L_0x0765:
            aucj r0 = r12.b
            auha r0 = (defpackage.auha) r0
            int r4 = r0.a
            r14 = 1
            r4 = r4 | r14
            r0.a = r4
            r14 = 0
            r0.b = r14
        L_0x0773:
            int r0 = r3.hashCode()
            switch(r0) {
                case -1975417556: goto L_0x088b;
                case -1950783396: goto L_0x0880;
                case -1901597429: goto L_0x0876;
                case -1808206707: goto L_0x086b;
                case -1631265143: goto L_0x0861;
                case -1481051307: goto L_0x0857;
                case -1296192056: goto L_0x084d;
                case -1279182658: goto L_0x0842;
                case -643887855: goto L_0x0837;
                case -333659530: goto L_0x082c;
                case -198690560: goto L_0x0820;
                case -101284726: goto L_0x0814;
                case 1324513: goto L_0x0809;
                case 30818824: goto L_0x07fe;
                case 51583589: goto L_0x07f2;
                case 180280399: goto L_0x07e6;
                case 548547144: goto L_0x07da;
                case 577968746: goto L_0x07ce;
                case 591416774: goto L_0x07c2;
                case 681543827: goto L_0x07b6;
                case 876626916: goto L_0x07aa;
                case 1286981803: goto L_0x079f;
                case 1425633167: goto L_0x0793;
                case 1463220168: goto L_0x0788;
                case 1994136243: goto L_0x077c;
                default: goto L_0x077a;
            }
        L_0x077a:
            goto L_0x0896
        L_0x077c:
            java.lang.String r0 = "/drm/widevine/oemcrypto/deactivate_usage_entry"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0896
            r14 = 15
            goto L_0x0897
        L_0x0788:
            java.lang.String r0 = "/drm/widevine/cdm_engine/open_session"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0896
            r14 = 3
            goto L_0x0897
        L_0x0793:
            java.lang.String r0 = "/drm/widevine/crypto_session/delete_multiple_usage_information"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0896
            r14 = 11
            goto L_0x0897
        L_0x079f:
            java.lang.String r0 = "/drm/widevine/cdm_engine/release_usage_info"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0896
            r14 = 5
            goto L_0x0897
        L_0x07aa:
            java.lang.String r0 = "/drm/widevine/oemcrypto/update_usage_table"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0896
            r14 = 24
            goto L_0x0897
        L_0x07b6:
            java.lang.String r0 = "/drm/widevine/crypto_session/delete_all_usage_reports"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0896
            r14 = 10
            goto L_0x0897
        L_0x07c2:
            java.lang.String r0 = "/drm/widevine/oemcrypto/delete_usage_table"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0896
            r14 = 17
            goto L_0x0897
        L_0x07ce:
            java.lang.String r0 = "/drm/widevine/oemcrypto/delete_usage_entry"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0896
            r14 = 16
            goto L_0x0897
        L_0x07da:
            java.lang.String r0 = "/drm/widevine/cdm_session/restore_usage_session"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0896
            r14 = 9
            goto L_0x0897
        L_0x07e6:
            java.lang.String r0 = "/drm/widevine/oemcrypto/generate_nonce"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0896
            r14 = 19
            goto L_0x0897
        L_0x07f2:
            java.lang.String r0 = "/drm/widevine/oemcrypto/close_session"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0896
            r14 = 14
            goto L_0x0897
        L_0x07fe:
            java.lang.String r0 = "/drm/widevine/cdm_engine/close_session"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0896
            r14 = 0
            goto L_0x0897
        L_0x0809:
            java.lang.String r0 = "/drm/widevine/cdm_engine/find_session_for_key"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0896
            r14 = 1
            goto L_0x0897
        L_0x0814:
            java.lang.String r0 = "/drm/widevine/cdm_session/restore_offline_session"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0896
            r14 = 8
            goto L_0x0897
        L_0x0820:
            java.lang.String r0 = "/drm/widevine/oemcrypto/report_usage"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0896
            r14 = 23
            goto L_0x0897
        L_0x082c:
            java.lang.String r0 = "/drm/widevine/oemcrypto/get_random"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0896
            r14 = 22
            goto L_0x0897
        L_0x0837:
            java.lang.String r0 = "/drm/widevine/oemcrypto/get_device_id"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0896
            r14 = 20
            goto L_0x0897
        L_0x0842:
            java.lang.String r0 = "/drm/widevine/oemcrypto/force_delete_usage_entry"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0896
            r14 = 18
            goto L_0x0897
        L_0x084d:
            java.lang.String r0 = "/drm/widevine/cdm_engine/remove_keys"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0896
            r14 = 6
            goto L_0x0897
        L_0x0857:
            java.lang.String r0 = "/drm/widevine/cdm_engine/unprovision"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0896
            r14 = 7
            goto L_0x0897
        L_0x0861:
            java.lang.String r0 = "/drm/widevine/cdm_engine/release_all_usage_info"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0896
            r14 = 4
            goto L_0x0897
        L_0x086b:
            java.lang.String r0 = "/drm/widevine/crypto_session/get_device_unique_id"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0896
            r14 = 12
            goto L_0x0897
        L_0x0876:
            java.lang.String r0 = "/drm/widevine/cdm_engine/open_key_set_session"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0896
            r14 = 2
            goto L_0x0897
        L_0x0880:
            java.lang.String r0 = "/drm/widevine/oemcrypto/get_oem_public_certificate"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0896
            r14 = 21
            goto L_0x0897
        L_0x088b:
            java.lang.String r0 = "/drm/widevine/crypto_session/get_token"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0896
            r14 = 13
            goto L_0x0897
        L_0x0896:
            r14 = -1
        L_0x0897:
            switch(r14) {
                case 0: goto L_0x0bda;
                case 1: goto L_0x0bba;
                case 2: goto L_0x0b99;
                case 3: goto L_0x0b78;
                case 4: goto L_0x0b56;
                case 5: goto L_0x0b34;
                case 6: goto L_0x0b10;
                case 7: goto L_0x0aed;
                case 8: goto L_0x0aca;
                case 9: goto L_0x0aa7;
                case 10: goto L_0x0a84;
                case 11: goto L_0x0a61;
                case 12: goto L_0x0a3e;
                case 13: goto L_0x0a1b;
                case 14: goto L_0x09f9;
                case 15: goto L_0x09d7;
                case 16: goto L_0x09b5;
                case 17: goto L_0x0993;
                case 18: goto L_0x0970;
                case 19: goto L_0x094d;
                case 20: goto L_0x092a;
                case 21: goto L_0x0907;
                case 22: goto L_0x08e4;
                case 23: goto L_0x08c2;
                case 24: goto L_0x08a0;
                default: goto L_0x089a;
            }
        L_0x089a:
            r4 = 2
            r3 = 1
            r12 = 3
            r13 = 4
            goto L_0x014e
        L_0x08a0:
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x08a5
            goto L_0x08aa
        L_0x08a5:
            r13.c()
            r13.c = r6
        L_0x08aa:
            aucj r0 = r13.b
            auhb r0 = (defpackage.auhb) r0
            aucj r3 = r12.i()
            auha r3 = (defpackage.auha) r3
            r3.getClass()
            r0.aH = r3
            int r3 = r0.c
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
            r0.c = r3
            r4 = 2
            goto L_0x0bf9
        L_0x08c2:
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x08c7
            goto L_0x08cc
        L_0x08c7:
            r13.c()
            r13.c = r6
        L_0x08cc:
            aucj r0 = r13.b
            auhb r0 = (defpackage.auhb) r0
            aucj r3 = r12.i()
            auha r3 = (defpackage.auha) r3
            r3.getClass()
            r0.aB = r3
            int r3 = r0.c
            r3 = r3 | 256(0x100, float:3.59E-43)
            r0.c = r3
            r4 = 2
            goto L_0x0bf9
        L_0x08e4:
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x08e9
            goto L_0x08ee
        L_0x08e9:
            r13.c()
            r13.c = r6
        L_0x08ee:
            aucj r0 = r13.b
            auhb r0 = (defpackage.auhb) r0
            aucj r3 = r12.i()
            auha r3 = (defpackage.auha) r3
            r3.getClass()
            r0.ap = r3
            int r3 = r0.b
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r3 | r4
            r0.b = r3
            r4 = 2
            goto L_0x0bf9
        L_0x0907:
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x090c
            goto L_0x0911
        L_0x090c:
            r13.c()
            r13.c = r6
        L_0x0911:
            aucj r0 = r13.b
            auhb r0 = (defpackage.auhb) r0
            aucj r3 = r12.i()
            auha r3 = (defpackage.auha) r3
            r3.getClass()
            r0.ao = r3
            int r3 = r0.b
            r4 = 134217728(0x8000000, float:3.85186E-34)
            r3 = r3 | r4
            r0.b = r3
            r4 = 2
            goto L_0x0bf9
        L_0x092a:
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x092f
            goto L_0x0934
        L_0x092f:
            r13.c()
            r13.c = r6
        L_0x0934:
            aucj r0 = r13.b
            auhb r0 = (defpackage.auhb) r0
            aucj r3 = r12.i()
            auha r3 = (defpackage.auha) r3
            r3.getClass()
            r0.am = r3
            int r3 = r0.b
            r4 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r3 | r4
            r0.b = r3
            r4 = 2
            goto L_0x0bf9
        L_0x094d:
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x0952
            goto L_0x0957
        L_0x0952:
            r13.c()
            r13.c = r6
        L_0x0957:
            aucj r0 = r13.b
            auhb r0 = (defpackage.auhb) r0
            aucj r3 = r12.i()
            auha r3 = (defpackage.auha) r3
            r3.getClass()
            r0.af = r3
            int r3 = r0.b
            r4 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 | r4
            r0.b = r3
            r4 = 2
            goto L_0x0bf9
        L_0x0970:
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x0975
            goto L_0x097a
        L_0x0975:
            r13.c()
            r13.c = r6
        L_0x097a:
            aucj r0 = r13.b
            auhb r0 = (defpackage.auhb) r0
            aucj r3 = r12.i()
            auha r3 = (defpackage.auha) r3
            r3.getClass()
            r0.ad = r3
            int r3 = r0.b
            r4 = 65536(0x10000, float:9.18355E-41)
            r3 = r3 | r4
            r0.b = r3
            r4 = 2
            goto L_0x0bf9
        L_0x0993:
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x0998
            goto L_0x099d
        L_0x0998:
            r13.c()
            r13.c = r6
        L_0x099d:
            aucj r0 = r13.b
            auhb r0 = (defpackage.auhb) r0
            aucj r3 = r12.i()
            auha r3 = (defpackage.auha) r3
            r3.getClass()
            r0.ab = r3
            int r3 = r0.b
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
            r0.b = r3
            r4 = 2
            goto L_0x0bf9
        L_0x09b5:
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x09ba
            goto L_0x09bf
        L_0x09ba:
            r13.c()
            r13.c = r6
        L_0x09bf:
            aucj r0 = r13.b
            auhb r0 = (defpackage.auhb) r0
            aucj r3 = r12.i()
            auha r3 = (defpackage.auha) r3
            r3.getClass()
            r0.aa = r3
            int r3 = r0.b
            r3 = r3 | 8192(0x2000, float:1.14794E-41)
            r0.b = r3
            r4 = 2
            goto L_0x0bf9
        L_0x09d7:
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x09dc
            goto L_0x09e1
        L_0x09dc:
            r13.c()
            r13.c = r6
        L_0x09e1:
            aucj r0 = r13.b
            auhb r0 = (defpackage.auhb) r0
            aucj r3 = r12.i()
            auha r3 = (defpackage.auha) r3
            r3.getClass()
            r0.Y = r3
            int r3 = r0.b
            r3 = r3 | 2048(0x800, float:2.87E-42)
            r0.b = r3
            r4 = 2
            goto L_0x0bf9
        L_0x09f9:
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x09fe
            goto L_0x0a03
        L_0x09fe:
            r13.c()
            r13.c = r6
        L_0x0a03:
            aucj r0 = r13.b
            auhb r0 = (defpackage.auhb) r0
            aucj r3 = r12.i()
            auha r3 = (defpackage.auha) r3
            r3.getClass()
            r0.R = r3
            int r3 = r0.b
            r3 = r3 | 256(0x100, float:3.59E-43)
            r0.b = r3
            r4 = 2
            goto L_0x0bf9
        L_0x0a1b:
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x0a20
            goto L_0x0a25
        L_0x0a20:
            r13.c()
            r13.c = r6
        L_0x0a25:
            aucj r0 = r13.b
            auhb r0 = (defpackage.auhb) r0
            aucj r3 = r12.i()
            auha r3 = (defpackage.auha) r3
            r3.getClass()
            r0.I = r3
            int r3 = r0.a
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 | r4
            r0.a = r3
            r4 = 2
            goto L_0x0bf9
        L_0x0a3e:
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x0a43
            goto L_0x0a48
        L_0x0a43:
            r13.c()
            r13.c = r6
        L_0x0a48:
            aucj r0 = r13.b
            auhb r0 = (defpackage.auhb) r0
            aucj r3 = r12.i()
            auha r3 = (defpackage.auha) r3
            r3.getClass()
            r0.H = r3
            int r3 = r0.a
            r4 = 1073741824(0x40000000, float:2.0)
            r3 = r3 | r4
            r0.a = r3
            r4 = 2
            goto L_0x0bf9
        L_0x0a61:
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x0a66
            goto L_0x0a6b
        L_0x0a66:
            r13.c()
            r13.c = r6
        L_0x0a6b:
            aucj r0 = r13.b
            auhb r0 = (defpackage.auhb) r0
            aucj r3 = r12.i()
            auha r3 = (defpackage.auha) r3
            r3.getClass()
            r0.C = r3
            int r3 = r0.a
            r4 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r3 | r4
            r0.a = r3
            r4 = 2
            goto L_0x0bf9
        L_0x0a84:
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x0a89
            goto L_0x0a8e
        L_0x0a89:
            r13.c()
            r13.c = r6
        L_0x0a8e:
            aucj r0 = r13.b
            auhb r0 = (defpackage.auhb) r0
            aucj r3 = r12.i()
            auha r3 = (defpackage.auha) r3
            r3.getClass()
            r0.B = r3
            int r3 = r0.a
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            r3 = r3 | r4
            r0.a = r3
            r4 = 2
            goto L_0x0bf9
        L_0x0aa7:
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x0aac
            goto L_0x0ab1
        L_0x0aac:
            r13.c()
            r13.c = r6
        L_0x0ab1:
            aucj r0 = r13.b
            auhb r0 = (defpackage.auhb) r0
            aucj r3 = r12.i()
            auha r3 = (defpackage.auha) r3
            r3.getClass()
            r0.z = r3
            int r3 = r0.a
            r4 = 4194304(0x400000, float:5.877472E-39)
            r3 = r3 | r4
            r0.a = r3
            r4 = 2
            goto L_0x0bf9
        L_0x0aca:
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x0acf
            goto L_0x0ad4
        L_0x0acf:
            r13.c()
            r13.c = r6
        L_0x0ad4:
            aucj r0 = r13.b
            auhb r0 = (defpackage.auhb) r0
            aucj r3 = r12.i()
            auha r3 = (defpackage.auha) r3
            r3.getClass()
            r0.y = r3
            int r3 = r0.a
            r4 = 2097152(0x200000, float:2.938736E-39)
            r3 = r3 | r4
            r0.a = r3
            r4 = 2
            goto L_0x0bf9
        L_0x0aed:
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x0af2
            goto L_0x0af7
        L_0x0af2:
            r13.c()
            r13.c = r6
        L_0x0af7:
            aucj r0 = r13.b
            auhb r0 = (defpackage.auhb) r0
            aucj r3 = r12.i()
            auha r3 = (defpackage.auha) r3
            r3.getClass()
            r0.u = r3
            int r3 = r0.a
            r4 = 131072(0x20000, float:1.83671E-40)
            r3 = r3 | r4
            r0.a = r3
            r4 = 2
            goto L_0x0bf9
        L_0x0b10:
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x0b15
            goto L_0x0b1a
        L_0x0b15:
            r13.c()
            r13.c = r6
        L_0x0b1a:
            aucj r0 = r13.b
            auhb r0 = (defpackage.auhb) r0
            aucj r3 = r12.i()
            auha r3 = (defpackage.auha) r3
            r3.getClass()
            r0.s = r3
            int r3 = r0.a
            r4 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 | r4
            r0.a = r3
            r4 = 2
            goto L_0x0bf9
        L_0x0b34:
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x0b39
            goto L_0x0b3e
        L_0x0b39:
            r13.c()
            r13.c = r6
        L_0x0b3e:
            aucj r0 = r13.b
            auhb r0 = (defpackage.auhb) r0
            aucj r3 = r12.i()
            auha r3 = (defpackage.auha) r3
            r3.getClass()
            r0.r = r3
            int r3 = r0.a
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
            r0.a = r3
            r4 = 2
            goto L_0x0bf9
        L_0x0b56:
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x0b5b
            goto L_0x0b60
        L_0x0b5b:
            r13.c()
            r13.c = r6
        L_0x0b60:
            aucj r0 = r13.b
            auhb r0 = (defpackage.auhb) r0
            aucj r3 = r12.i()
            auha r3 = (defpackage.auha) r3
            r3.getClass()
            r0.q = r3
            int r3 = r0.a
            r3 = r3 | 8192(0x2000, float:1.14794E-41)
            r0.a = r3
            r4 = 2
            goto L_0x0bf9
        L_0x0b78:
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x0b7d
            goto L_0x0b82
        L_0x0b7d:
            r13.c()
            r13.c = r6
        L_0x0b82:
            aucj r0 = r13.b
            auhb r0 = (defpackage.auhb) r0
            aucj r3 = r12.i()
            auha r3 = (defpackage.auha) r3
            r3.getClass()
            r0.o = r3
            int r3 = r0.a
            r3 = r3 | 2048(0x800, float:2.87E-42)
            r0.a = r3
            r4 = 2
            goto L_0x0bf9
        L_0x0b99:
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x0b9e
            goto L_0x0ba3
        L_0x0b9e:
            r13.c()
            r13.c = r6
        L_0x0ba3:
            aucj r0 = r13.b
            auhb r0 = (defpackage.auhb) r0
            aucj r3 = r12.i()
            auha r3 = (defpackage.auha) r3
            r3.getClass()
            r0.n = r3
            int r3 = r0.a
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r0.a = r3
            r4 = 2
            goto L_0x0bf9
        L_0x0bba:
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x0bbf
            goto L_0x0bc4
        L_0x0bbf:
            r13.c()
            r13.c = r6
        L_0x0bc4:
            aucj r0 = r13.b
            auhb r0 = (defpackage.auhb) r0
            aucj r3 = r12.i()
            auha r3 = (defpackage.auha) r3
            r3.getClass()
            r0.h = r3
            int r3 = r0.a
            r3 = r3 | r8
            r0.a = r3
            r4 = 2
            goto L_0x0bf9
        L_0x0bda:
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x0bdf
            goto L_0x0be4
        L_0x0bdf:
            r13.c()
            r13.c = r6
        L_0x0be4:
            aucj r0 = r13.b
            auhb r0 = (defpackage.auhb) r0
            aucj r3 = r12.i()
            auha r3 = (defpackage.auha) r3
            r3.getClass()
            r0.e = r3
            int r3 = r0.a
            r4 = 2
            r3 = r3 | r4
            r0.a = r3
        L_0x0bf9:
            r2.a(r13)
            r3 = 1
            r12 = 3
            r13 = 4
            goto L_0x014e
        L_0x0c01:
            r31 = 4
            r3 = 1
            r12 = 3
            r13 = 4
            goto L_0x014e
        L_0x0c08:
            java.util.Set r0 = r5.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0c10:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0c6e
            java.lang.Object r3 = r0.next()
            android.util.Pair r3 = (android.util.Pair) r3
            java.lang.Object r4 = r5.get(r3)
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Object r7 = r4.first
            aucd r7 = (defpackage.aucd) r7
            java.lang.Object r4 = r4.second
            aucd r4 = (defpackage.aucd) r4
            boolean r8 = r7.c
            if (r8 == 0) goto L_0x0c33
            r7.c()
            r7.c = r6
        L_0x0c33:
            aucj r8 = r7.b
            auhe r8 = (defpackage.auhe) r8
            aucj r4 = r4.i()
            auhc r4 = (defpackage.auhc) r4
            auhe r9 = defpackage.auhe.d
            r4.getClass()
            r8.b = r4
            int r4 = r8.a
            r9 = 1
            r4 = r4 | r9
            r8.a = r4
            java.lang.Object r3 = r3.first
            java.lang.String r3 = (java.lang.String) r3
            auhb r3 = b(r3, r7)
            if (r3 == 0) goto L_0x0c10
            boolean r4 = r2.c
            if (r4 != 0) goto L_0x0c59
            goto L_0x0c5e
        L_0x0c59:
            r2.c()
            r2.c = r6
        L_0x0c5e:
            aucj r4 = r2.b
            auhh r4 = (defpackage.auhh) r4
            r3.getClass()
            r4.c()
            aucx r4 = r4.a
            r4.add(r3)
            goto L_0x0c10
        L_0x0c6e:
            aucj r0 = r2.i()
            auhh r0 = (defpackage.auhh) r0
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x0c79
            goto L_0x0c7e
        L_0x0c79:
            r40.c()
            r1.c = r6
        L_0x0c7e:
            aucj r1 = r1.b
            auhn r1 = (defpackage.auhn) r1
            auhn r2 = defpackage.auhn.q
            r0.getClass()
            r1.g = r0
            int r0 = r1.a
            r0 = r0 | 32
            r1.a = r0
            return
        L_0x0c90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.actm.a(java.lang.String, aucd):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.augp b(java.lang.String r11) {
        /*
            r10 = this;
            augp r0 = defpackage.augp.j
            aucd r0 = r0.o()
            amsk r1 = n
            java.util.List r11 = r1.c(r11)
            java.util.Iterator r11 = r11.iterator()
        L_0x0010:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x019d
            java.lang.Object r1 = r11.next()
            java.lang.String r1 = (java.lang.String) r1
            android.util.Pair r2 = h(r1)
            if (r2 == 0) goto L_0x0010
            java.lang.Object r3 = r2.second
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.first     // Catch:{ IllegalArgumentException -> 0x019a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IllegalArgumentException -> 0x019a }
            int r4 = r2.hashCode()     // Catch:{ IllegalArgumentException -> 0x019a }
            r5 = 1
            r6 = 4
            r7 = 2
            r8 = 0
            r9 = -1
            switch(r4) {
                case -344255373: goto L_0x007e;
                case -344252277: goto L_0x0074;
                case -247416563: goto L_0x006a;
                case -247413467: goto L_0x0060;
                case 373817687: goto L_0x0056;
                case 1400414035: goto L_0x004c;
                case 1442897153: goto L_0x0042;
                case 1803172285: goto L_0x0038;
                default: goto L_0x0036;
            }     // Catch:{ IllegalArgumentException -> 0x019a }
        L_0x0036:
            r2 = -1
            goto L_0x0087
        L_0x0038:
            java.lang.String r4 = "android.media.audiopolicy.active.session"
            boolean r2 = r2.equals(r4)     // Catch:{ IllegalArgumentException -> 0x019a }
            if (r2 == 0) goto L_0x0036
            r2 = 7
            goto L_0x0087
        L_0x0042:
            java.lang.String r4 = "android.media.audiopolicy.status"
            boolean r2 = r2.equals(r4)     // Catch:{ IllegalArgumentException -> 0x019a }
            if (r2 == 0) goto L_0x0036
            r2 = 1
            goto L_0x0087
        L_0x004c:
            java.lang.String r4 = "android.media.audiopolicy.reason"
            boolean r2 = r2.equals(r4)     // Catch:{ IllegalArgumentException -> 0x019a }
            if (r2 == 0) goto L_0x0036
            r2 = 0
            goto L_0x0087
        L_0x0056:
            java.lang.String r4 = "android.media.audiopolicy.rqst.session"
            boolean r2 = r2.equals(r4)     // Catch:{ IllegalArgumentException -> 0x019a }
            if (r2 == 0) goto L_0x0036
            r2 = 4
            goto L_0x0087
        L_0x0060:
            java.lang.String r4 = "android.media.audiopolicy.rqst.src"
            boolean r2 = r2.equals(r4)     // Catch:{ IllegalArgumentException -> 0x019a }
            if (r2 == 0) goto L_0x0036
            r2 = 2
            goto L_0x0087
        L_0x006a:
            java.lang.String r4 = "android.media.audiopolicy.rqst.pkg"
            boolean r2 = r2.equals(r4)     // Catch:{ IllegalArgumentException -> 0x019a }
            if (r2 == 0) goto L_0x0036
            r2 = 3
            goto L_0x0087
        L_0x0074:
            java.lang.String r4 = "android.media.audiopolicy.active.src"
            boolean r2 = r2.equals(r4)     // Catch:{ IllegalArgumentException -> 0x019a }
            if (r2 == 0) goto L_0x0036
            r2 = 5
            goto L_0x0087
        L_0x007e:
            java.lang.String r4 = "android.media.audiopolicy.active.pkg"
            boolean r2 = r2.equals(r4)     // Catch:{ IllegalArgumentException -> 0x019a }
            if (r2 == 0) goto L_0x0036
            r2 = 6
        L_0x0087:
            switch(r2) {
                case 0: goto L_0x014f;
                case 1: goto L_0x0134;
                case 2: goto L_0x0118;
                case 3: goto L_0x00fe;
                case 4: goto L_0x00e2;
                case 5: goto L_0x00c5;
                case 6: goto L_0x00aa;
                case 7: goto L_0x008e;
                default: goto L_0x008a;
            }     // Catch:{ IllegalArgumentException -> 0x019a }
        L_0x008a:
            r10.f(r1)     // Catch:{ IllegalArgumentException -> 0x019a }
            goto L_0x0010
        L_0x008e:
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ IllegalArgumentException -> 0x019a }
            boolean r2 = r0.c     // Catch:{ IllegalArgumentException -> 0x019a }
            if (r2 != 0) goto L_0x0097
            goto L_0x009c
        L_0x0097:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x019a }
            r0.c = r8     // Catch:{ IllegalArgumentException -> 0x019a }
        L_0x009c:
            aucj r2 = r0.b     // Catch:{ IllegalArgumentException -> 0x019a }
            augp r2 = (defpackage.augp) r2     // Catch:{ IllegalArgumentException -> 0x019a }
            int r3 = r2.a     // Catch:{ IllegalArgumentException -> 0x019a }
            r3 = r3 | 64
            r2.a = r3     // Catch:{ IllegalArgumentException -> 0x019a }
            r2.i = r1     // Catch:{ IllegalArgumentException -> 0x019a }
            goto L_0x0010
        L_0x00aa:
            boolean r1 = r0.c     // Catch:{ IllegalArgumentException -> 0x019a }
            if (r1 != 0) goto L_0x00af
            goto L_0x00b4
        L_0x00af:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x019a }
            r0.c = r8     // Catch:{ IllegalArgumentException -> 0x019a }
        L_0x00b4:
            aucj r1 = r0.b     // Catch:{ IllegalArgumentException -> 0x019a }
            augp r1 = (defpackage.augp) r1     // Catch:{ IllegalArgumentException -> 0x019a }
            r3.getClass()     // Catch:{ IllegalArgumentException -> 0x019a }
            int r2 = r1.a     // Catch:{ IllegalArgumentException -> 0x019a }
            r2 = r2 | 32
            r1.a = r2     // Catch:{ IllegalArgumentException -> 0x019a }
            r1.h = r3     // Catch:{ IllegalArgumentException -> 0x019a }
            goto L_0x0010
        L_0x00c5:
            int r1 = defpackage.augo.a(r3)     // Catch:{ IllegalArgumentException -> 0x019a }
            boolean r2 = r0.c     // Catch:{ IllegalArgumentException -> 0x019a }
            if (r2 != 0) goto L_0x00ce
            goto L_0x00d3
        L_0x00ce:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x019a }
            r0.c = r8     // Catch:{ IllegalArgumentException -> 0x019a }
        L_0x00d3:
            aucj r2 = r0.b     // Catch:{ IllegalArgumentException -> 0x019a }
            augp r2 = (defpackage.augp) r2     // Catch:{ IllegalArgumentException -> 0x019a }
            int r1 = r1 + r9
            r2.g = r1     // Catch:{ IllegalArgumentException -> 0x019a }
            int r1 = r2.a     // Catch:{ IllegalArgumentException -> 0x019a }
            r1 = r1 | 16
            r2.a = r1     // Catch:{ IllegalArgumentException -> 0x019a }
            goto L_0x0010
        L_0x00e2:
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ IllegalArgumentException -> 0x019a }
            boolean r2 = r0.c     // Catch:{ IllegalArgumentException -> 0x019a }
            if (r2 != 0) goto L_0x00eb
            goto L_0x00f0
        L_0x00eb:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x019a }
            r0.c = r8     // Catch:{ IllegalArgumentException -> 0x019a }
        L_0x00f0:
            aucj r2 = r0.b     // Catch:{ IllegalArgumentException -> 0x019a }
            augp r2 = (defpackage.augp) r2     // Catch:{ IllegalArgumentException -> 0x019a }
            int r3 = r2.a     // Catch:{ IllegalArgumentException -> 0x019a }
            r3 = r3 | 8
            r2.a = r3     // Catch:{ IllegalArgumentException -> 0x019a }
            r2.f = r1     // Catch:{ IllegalArgumentException -> 0x019a }
            goto L_0x0010
        L_0x00fe:
            boolean r1 = r0.c     // Catch:{ IllegalArgumentException -> 0x019a }
            if (r1 != 0) goto L_0x0103
            goto L_0x0108
        L_0x0103:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x019a }
            r0.c = r8     // Catch:{ IllegalArgumentException -> 0x019a }
        L_0x0108:
            aucj r1 = r0.b     // Catch:{ IllegalArgumentException -> 0x019a }
            augp r1 = (defpackage.augp) r1     // Catch:{ IllegalArgumentException -> 0x019a }
            r3.getClass()     // Catch:{ IllegalArgumentException -> 0x019a }
            int r2 = r1.a     // Catch:{ IllegalArgumentException -> 0x019a }
            r2 = r2 | r6
            r1.a = r2     // Catch:{ IllegalArgumentException -> 0x019a }
            r1.e = r3     // Catch:{ IllegalArgumentException -> 0x019a }
            goto L_0x0010
        L_0x0118:
            int r1 = defpackage.augo.a(r3)     // Catch:{ IllegalArgumentException -> 0x019a }
            boolean r2 = r0.c     // Catch:{ IllegalArgumentException -> 0x019a }
            if (r2 != 0) goto L_0x0121
            goto L_0x0126
        L_0x0121:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x019a }
            r0.c = r8     // Catch:{ IllegalArgumentException -> 0x019a }
        L_0x0126:
            aucj r2 = r0.b     // Catch:{ IllegalArgumentException -> 0x019a }
            augp r2 = (defpackage.augp) r2     // Catch:{ IllegalArgumentException -> 0x019a }
            int r1 = r1 + r9
            r2.d = r1     // Catch:{ IllegalArgumentException -> 0x019a }
            int r1 = r2.a     // Catch:{ IllegalArgumentException -> 0x019a }
            r1 = r1 | r7
            r2.a = r1     // Catch:{ IllegalArgumentException -> 0x019a }
            goto L_0x0010
        L_0x0134:
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ IllegalArgumentException -> 0x019a }
            boolean r2 = r0.c     // Catch:{ IllegalArgumentException -> 0x019a }
            if (r2 != 0) goto L_0x013d
            goto L_0x0142
        L_0x013d:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x019a }
            r0.c = r8     // Catch:{ IllegalArgumentException -> 0x019a }
        L_0x0142:
            aucj r2 = r0.b     // Catch:{ IllegalArgumentException -> 0x019a }
            augp r2 = (defpackage.augp) r2     // Catch:{ IllegalArgumentException -> 0x019a }
            int r3 = r2.a     // Catch:{ IllegalArgumentException -> 0x019a }
            r3 = r3 | r5
            r2.a = r3     // Catch:{ IllegalArgumentException -> 0x019a }
            r2.c = r1     // Catch:{ IllegalArgumentException -> 0x019a }
            goto L_0x0010
        L_0x014f:
            amsk r1 = p     // Catch:{ IllegalArgumentException -> 0x019a }
            java.lang.Iterable r1 = r1.a((java.lang.CharSequence) r3)     // Catch:{ IllegalArgumentException -> 0x019a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IllegalArgumentException -> 0x019a }
        L_0x0159:
            boolean r2 = r1.hasNext()     // Catch:{ IllegalArgumentException -> 0x019a }
            if (r2 == 0) goto L_0x0010
            java.lang.Object r2 = r1.next()     // Catch:{ IllegalArgumentException -> 0x019a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IllegalArgumentException -> 0x019a }
            java.util.Locale r3 = java.util.Locale.ROOT     // Catch:{ IllegalArgumentException -> 0x0198 }
            java.lang.String r2 = r2.toUpperCase(r3)     // Catch:{ IllegalArgumentException -> 0x0198 }
            augm r2 = defpackage.augm.a((java.lang.String) r2)     // Catch:{ IllegalArgumentException -> 0x0198 }
            boolean r3 = r0.c     // Catch:{ IllegalArgumentException -> 0x0198 }
            if (r3 != 0) goto L_0x0174
            goto L_0x0179
        L_0x0174:
            r0.c()     // Catch:{ IllegalArgumentException -> 0x0198 }
            r0.c = r8     // Catch:{ IllegalArgumentException -> 0x0198 }
        L_0x0179:
            aucj r3 = r0.b     // Catch:{ IllegalArgumentException -> 0x0198 }
            augp r3 = (defpackage.augp) r3     // Catch:{ IllegalArgumentException -> 0x0198 }
            r2.getClass()     // Catch:{ IllegalArgumentException -> 0x0198 }
            aucs r4 = r3.b     // Catch:{ IllegalArgumentException -> 0x0198 }
            boolean r4 = r4.a()     // Catch:{ IllegalArgumentException -> 0x0198 }
            if (r4 != 0) goto L_0x0190
            aucs r4 = r3.b     // Catch:{ IllegalArgumentException -> 0x0198 }
            aucs r4 = defpackage.aucj.a((defpackage.aucs) r4)     // Catch:{ IllegalArgumentException -> 0x0198 }
            r3.b = r4     // Catch:{ IllegalArgumentException -> 0x0198 }
        L_0x0190:
            aucs r3 = r3.b     // Catch:{ IllegalArgumentException -> 0x0198 }
            int r2 = r2.f     // Catch:{ IllegalArgumentException -> 0x0198 }
            r3.d(r2)     // Catch:{ IllegalArgumentException -> 0x0198 }
            goto L_0x0159
        L_0x0198:
            r2 = move-exception
            goto L_0x0159
        L_0x019a:
            r1 = move-exception
            goto L_0x0010
        L_0x019d:
            aucj r11 = r0.i()
            augp r11 = (defpackage.augp) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.actm.b(java.lang.String):augp");
    }

    /* access modifiers changed from: protected */
    public final avwc b(Context context, InputStream inputStream, long j2, long j3, hph hph) {
        avwc avwc;
        String group;
        int indexOf;
        avvz avvz = (avvz) avwc.v.o();
        if (avvz.c) {
            avvz.c();
            avvz.c = false;
        }
        avwc avwc2 = (avwc) avvz.b;
        int i2 = avwc2.a | 1;
        avwc2.a = i2;
        avwc2.d = j2;
        avwc2.a = i2 | 2;
        avwc2.e = j3;
        try {
            String str = new String(jjt.b(inputStream), acrk.e);
            try {
                this.t = azpa.a.a().b();
                this.u = azpa.a.a().a();
                auhl auhl = (auhl) auhm.b.o();
                for (String trim : m.a((CharSequence) str)) {
                    String trim2 = trim.trim();
                    this.v = trim2;
                    this.w = new StringBuilder();
                    Matcher matcher = h.matcher(trim2);
                    if (!matcher.find()) {
                        Matcher matcher2 = i.matcher(trim2);
                        if (matcher2.find() && (indexOf = group.indexOf(":")) != -1) {
                            try {
                                int parseInt = Integer.parseInt((group = matcher2.group(1)).substring(0, indexOf));
                                if (parseInt == 0) {
                                    int i3 = indexOf + 1;
                                    if (i3 < group.length()) {
                                        a(auhl, group.substring(i3));
                                    }
                                } else if (parseInt == 1) {
                                    List c = n.a(11).c(group);
                                    if (c.size() == 11) {
                                        aucd o2 = auhn.q.o();
                                        String str2 = (String) c.get(4);
                                        String str3 = (String) c.get(5);
                                        if (a(o2, (String) c.get(1), (String) c.get(10), (String) c.get(8))) {
                                            if (o2.c) {
                                                o2.c();
                                                o2.c = false;
                                            }
                                            auhn auhn = (auhn) o2.b;
                                            str2.getClass();
                                            int i4 = auhn.a | 2;
                                            auhn.a = i4;
                                            auhn.c = str2;
                                            str3.getClass();
                                            auhn.a = i4 | 4;
                                            auhn.d = str3;
                                            if (this.t && this.w.length() > 0) {
                                                String sb = this.w.toString();
                                                if (o2.c) {
                                                    o2.c();
                                                    o2.c = false;
                                                }
                                                auhn auhn2 = (auhn) o2.b;
                                                sb.getClass();
                                                auhn2.a |= 8;
                                                auhn2.e = sb;
                                            }
                                            auhl.a(o2);
                                        } else if (this.t && ((long) this.v.length()) <= this.u) {
                                            if (o2.c) {
                                                o2.c();
                                                o2.c = false;
                                            }
                                            auhn auhn3 = (auhn) o2.b;
                                            str2.getClass();
                                            int i5 = auhn3.a | 2;
                                            auhn3.a = i5;
                                            auhn3.c = str2;
                                            str3.getClass();
                                            int i6 = i5 | 4;
                                            auhn3.a = i6;
                                            auhn3.d = str3;
                                            String str4 = this.v;
                                            str4.getClass();
                                            auhn3.a = i6 | 8;
                                            auhn3.e = str4;
                                            auhl.a(o2);
                                        }
                                    }
                                }
                            } catch (NumberFormatException e) {
                            }
                        }
                    } else {
                        a(auhl, matcher.group(1));
                    }
                }
                this.v = null;
                this.w = null;
                auhm auhm = (auhm) auhl.i();
                if (avvz.c) {
                    avvz.c();
                    avvz.c = false;
                }
                avwc avwc3 = (avwc) avvz.b;
                auhm.getClass();
                avwc3.c = auhm;
                avwc3.b = 30;
                avwc = (avwc) avvz.i();
                jjt.a((Closeable) inputStream);
                return avwc;
            } catch (IOException e2) {
                Log.w(this.a, "Failed to read dumpsys output file.");
                avwc avwc4 = (avwc) avvz.i();
                jjt.a((Closeable) inputStream);
                return avwc4;
            } catch (Throwable th) {
                jjt.a((Closeable) inputStream);
                throw th;
            }
        } catch (OutOfMemoryError e3) {
            String valueOf = String.valueOf(this.f);
            hph.c(valueOf.length() == 0 ? new String("DumpsysOutOfMemory") : "DumpsysOutOfMemory".concat(valueOf)).a();
            hph.d();
            avwc = (avwc) avvz.i();
        }
    }

    public final boolean b() {
        return jkr.e() && azms.a.a().g();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:504:0x09ab A[Catch:{ NumberFormatException -> 0x0a01 }] */
    /* JADX WARNING: Removed duplicated region for block: B:517:0x09e7 A[Catch:{ NumberFormatException -> 0x0a01 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(defpackage.aucd r21, java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            int r5 = r22.hashCode()
            r10 = 3
            r11 = 8
            r12 = 4
            r13 = 2
            r14 = 1
            r15 = -1
            r6 = 0
            switch(r5) {
                case -1791428760: goto L_0x0075;
                case -900768965: goto L_0x006a;
                case -799233858: goto L_0x0060;
                case -252850652: goto L_0x0056;
                case 94834710: goto L_0x004c;
                case 1267763336: goto L_0x0042;
                case 1315524519: goto L_0x0038;
                case 1375990112: goto L_0x002e;
                case 1568688949: goto L_0x0024;
                case 2098224273: goto L_0x0019;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x007f
        L_0x0019:
            java.lang.String r5 = "drm.vendor.Google.WidevineCDM"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x007f
            r3 = 9
            goto L_0x0080
        L_0x0024:
            java.lang.String r5 = "audiotrack"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x007f
            r3 = 5
            goto L_0x0080
        L_0x002e:
            java.lang.String r5 = "audiothread"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x007f
            r3 = 7
            goto L_0x0080
        L_0x0038:
            java.lang.String r5 = "audiorecord"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x007f
            r3 = 6
            goto L_0x0080
        L_0x0042:
            java.lang.String r5 = "audiopolicy"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x007f
            r3 = 4
            goto L_0x0080
        L_0x004c:
            java.lang.String r5 = "codec"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x007f
            r3 = 0
            goto L_0x0080
        L_0x0056:
            java.lang.String r5 = "extractor"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x007f
            r3 = 1
            goto L_0x0080
        L_0x0060:
            java.lang.String r5 = "recorder"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x007f
            r3 = 3
            goto L_0x0080
        L_0x006a:
            java.lang.String r5 = "mediadrm"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x007f
            r3 = 8
            goto L_0x0080
        L_0x0075:
            java.lang.String r5 = "nuplayer"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x007f
            r3 = 2
            goto L_0x0080
        L_0x007f:
            r3 = -1
        L_0x0080:
            r17 = 16
            switch(r3) {
                case 0: goto L_0x0a27;
                case 1: goto L_0x094d;
                case 2: goto L_0x06aa;
                case 3: goto L_0x035f;
                case 4: goto L_0x033d;
                case 5: goto L_0x01d5;
                case 6: goto L_0x01b3;
                case 7: goto L_0x0191;
                case 8: goto L_0x008e;
                case 9: goto L_0x0088;
                default: goto L_0x0085;
            }
        L_0x0085:
            r3 = 0
            goto L_0x0a47
        L_0x0088:
            a((java.lang.String) r4, (defpackage.aucd) r2)
            r3 = 1
            goto L_0x0a47
        L_0x008e:
            auhk r3 = defpackage.auhk.e
            aucd r3 = r3.o()
            amsk r5 = n
            java.util.List r4 = r5.c(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x009e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x016d
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            amsk r7 = o
            java.util.List r5 = r7.c(r5)
            int r7 = r5.size()
            if (r7 != r13) goto L_0x009e
            java.lang.Object r7 = r5.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r7.hashCode()
            r9 = -1724546052(0xffffffff993583fc, float:-9.384135E-24)
            if (r8 == r9) goto L_0x00e4
            r9 = -820075192(0xffffffffcf1ea548, float:-2.661632E9)
            if (r8 == r9) goto L_0x00da
            r9 = -790095608(0xffffffffd0e81908, float:-3.11516365E10)
            if (r8 == r9) goto L_0x00d0
            goto L_0x00ee
        L_0x00d0:
            java.lang.String r8 = "serialized_metrics"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x00ee
            r7 = 0
            goto L_0x00ef
        L_0x00da:
            java.lang.String r8 = "vendor"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x00ee
            r7 = 1
            goto L_0x00ef
        L_0x00e4:
            java.lang.String r8 = "description"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x00ee
            r7 = 2
            goto L_0x00ef
        L_0x00ee:
            r7 = -1
        L_0x00ef:
            if (r7 == 0) goto L_0x0136
            if (r7 == r14) goto L_0x0116
            if (r7 == r13) goto L_0x00f6
            goto L_0x009e
        L_0x00f6:
            java.lang.Object r5 = r5.get(r14)
            java.lang.String r5 = (java.lang.String) r5
            boolean r7 = r3.c
            if (r7 != 0) goto L_0x0102
            goto L_0x0107
        L_0x0102:
            r3.c()
            r3.c = r6
        L_0x0107:
            aucj r7 = r3.b
            auhk r7 = (defpackage.auhk) r7
            r5.getClass()
            int r8 = r7.a
            r8 = r8 | r13
            r7.a = r8
            r7.c = r5
            goto L_0x009e
        L_0x0116:
            java.lang.Object r5 = r5.get(r14)
            java.lang.String r5 = (java.lang.String) r5
            boolean r7 = r3.c
            if (r7 != 0) goto L_0x0121
            goto L_0x0126
        L_0x0121:
            r3.c()
            r3.c = r6
        L_0x0126:
            aucj r7 = r3.b
            auhk r7 = (defpackage.auhk) r7
            r5.getClass()
            int r8 = r7.a
            r8 = r8 | r14
            r7.a = r8
            r7.b = r5
            goto L_0x009e
        L_0x0136:
            augy r7 = defpackage.augy.a
            aucd r7 = r7.o()
            java.lang.Object r5 = r5.get(r14)     // Catch:{ IllegalArgumentException -> 0x014c, auda -> 0x014a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IllegalArgumentException -> 0x014c, auda -> 0x014a }
            byte[] r5 = android.util.Base64.decode(r5, r14)     // Catch:{ IllegalArgumentException -> 0x014c, auda -> 0x014a }
            r7.b(r5)     // Catch:{ IllegalArgumentException -> 0x014c, auda -> 0x014a }
            goto L_0x014d
        L_0x014a:
            r0 = move-exception
            goto L_0x014d
        L_0x014c:
            r0 = move-exception
        L_0x014d:
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x0152
            goto L_0x0157
        L_0x0152:
            r3.c()
            r3.c = r6
        L_0x0157:
            aucj r5 = r3.b
            auhk r5 = (defpackage.auhk) r5
            aucj r7 = r7.i()
            augy r7 = (defpackage.augy) r7
            r7.getClass()
            r5.d = r7
            int r7 = r5.a
            r7 = r7 | r12
            r5.a = r7
            goto L_0x009e
        L_0x016d:
            aucj r3 = r3.i()
            auhk r3 = (defpackage.auhk) r3
            boolean r4 = r2.c
            if (r4 != 0) goto L_0x0178
            goto L_0x017d
        L_0x0178:
            r21.c()
            r2.c = r6
        L_0x017d:
            aucj r4 = r2.b
            auhn r4 = (defpackage.auhn) r4
            auhn r5 = defpackage.auhn.q
            r3.getClass()
            r4.l = r3
            int r3 = r4.a
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r4.a = r3
            r3 = 1
            goto L_0x0a47
        L_0x0191:
            augs r3 = r1.d(r4)
            boolean r4 = r2.c
            if (r4 != 0) goto L_0x019a
            goto L_0x019f
        L_0x019a:
            r21.c()
            r2.c = r6
        L_0x019f:
            aucj r4 = r2.b
            auhn r4 = (defpackage.auhn) r4
            auhn r5 = defpackage.auhn.q
            r3.getClass()
            r4.p = r3
            int r3 = r4.a
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
            r4.a = r3
            r3 = 1
            goto L_0x0a47
        L_0x01b3:
            augq r3 = r1.c(r4)
            boolean r4 = r2.c
            if (r4 != 0) goto L_0x01bc
            goto L_0x01c1
        L_0x01bc:
            r21.c()
            r2.c = r6
        L_0x01c1:
            aucj r4 = r2.b
            auhn r4 = (defpackage.auhn) r4
            auhn r5 = defpackage.auhn.q
            r3.getClass()
            r4.o = r3
            int r3 = r4.a
            r3 = r3 | 8192(0x2000, float:1.14794E-41)
            r4.a = r3
            r3 = 1
            goto L_0x0a47
        L_0x01d5:
            augt r3 = defpackage.augt.i
            aucd r3 = r3.o()
            amsk r5 = n
            java.util.List r4 = r5.c(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x01e5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0319
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            android.util.Pair r7 = h(r5)
            if (r7 == 0) goto L_0x01e5
            java.lang.Object r8 = r7.second
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r7.first     // Catch:{ NumberFormatException -> 0x0316 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x0316 }
            int r16 = r7.hashCode()     // Catch:{ NumberFormatException -> 0x0316 }
            switch(r16) {
                case -2075188854: goto L_0x0244;
                case -1905691159: goto L_0x023a;
                case -1278500449: goto L_0x0230;
                case -737353638: goto L_0x0226;
                case 1721495050: goto L_0x021c;
                case 1815016852: goto L_0x0212;
                case 1827469521: goto L_0x0208;
                default: goto L_0x0206;
            }     // Catch:{ NumberFormatException -> 0x0316 }
        L_0x0206:
            r7 = -1
            goto L_0x024d
        L_0x0208:
            java.lang.String r9 = "android.media.audiotrack.usage"
            boolean r7 = r7.equals(r9)     // Catch:{ NumberFormatException -> 0x0316 }
            if (r7 == 0) goto L_0x0206
            r7 = 2
            goto L_0x024d
        L_0x0212:
            java.lang.String r9 = "android.media.audiotrack.glitch.startup"
            boolean r7 = r7.equals(r9)     // Catch:{ NumberFormatException -> 0x0316 }
            if (r7 == 0) goto L_0x0206
            r7 = 6
            goto L_0x024d
        L_0x021c:
            java.lang.String r9 = "android.media.audiotrack.type"
            boolean r7 = r7.equals(r9)     // Catch:{ NumberFormatException -> 0x0316 }
            if (r7 == 0) goto L_0x0206
            r7 = 1
            goto L_0x024d
        L_0x0226:
            java.lang.String r9 = "android.media.audiotrack.samplerate"
            boolean r7 = r7.equals(r9)     // Catch:{ NumberFormatException -> 0x0316 }
            if (r7 == 0) goto L_0x0206
            r7 = 3
            goto L_0x024d
        L_0x0230:
            java.lang.String r9 = "android.media.audiotrack.channelmask"
            boolean r7 = r7.equals(r9)     // Catch:{ NumberFormatException -> 0x0316 }
            if (r7 == 0) goto L_0x0206
            r7 = 4
            goto L_0x024d
        L_0x023a:
            java.lang.String r9 = "android.media.audiotrack.underrunframes"
            boolean r7 = r7.equals(r9)     // Catch:{ NumberFormatException -> 0x0316 }
            if (r7 == 0) goto L_0x0206
            r7 = 5
            goto L_0x024d
        L_0x0244:
            java.lang.String r9 = "android.media.audiotrack.streamtype"
            boolean r7 = r7.equals(r9)     // Catch:{ NumberFormatException -> 0x0316 }
            if (r7 == 0) goto L_0x0206
            r7 = 0
        L_0x024d:
            switch(r7) {
                case 0: goto L_0x02fc;
                case 1: goto L_0x02e2;
                case 2: goto L_0x02c8;
                case 3: goto L_0x02ad;
                case 4: goto L_0x0291;
                case 5: goto L_0x0275;
                case 6: goto L_0x0254;
                default: goto L_0x0250;
            }     // Catch:{ NumberFormatException -> 0x0316 }
        L_0x0250:
            r1.f(r5)     // Catch:{ NumberFormatException -> 0x0316 }
            goto L_0x01e5
        L_0x0254:
            int r5 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0316 }
            if (r5 == 0) goto L_0x025c
            r5 = 1
            goto L_0x025d
        L_0x025c:
            r5 = 0
        L_0x025d:
            boolean r7 = r3.c     // Catch:{ NumberFormatException -> 0x0316 }
            if (r7 != 0) goto L_0x0262
            goto L_0x0267
        L_0x0262:
            r3.c()     // Catch:{ NumberFormatException -> 0x0316 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0316 }
        L_0x0267:
            aucj r7 = r3.b     // Catch:{ NumberFormatException -> 0x0316 }
            augt r7 = (defpackage.augt) r7     // Catch:{ NumberFormatException -> 0x0316 }
            int r8 = r7.a     // Catch:{ NumberFormatException -> 0x0316 }
            r8 = r8 | 64
            r7.a = r8     // Catch:{ NumberFormatException -> 0x0316 }
            r7.h = r5     // Catch:{ NumberFormatException -> 0x0316 }
            goto L_0x01e5
        L_0x0275:
            int r5 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0316 }
            boolean r7 = r3.c     // Catch:{ NumberFormatException -> 0x0316 }
            if (r7 != 0) goto L_0x027e
            goto L_0x0283
        L_0x027e:
            r3.c()     // Catch:{ NumberFormatException -> 0x0316 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0316 }
        L_0x0283:
            aucj r7 = r3.b     // Catch:{ NumberFormatException -> 0x0316 }
            augt r7 = (defpackage.augt) r7     // Catch:{ NumberFormatException -> 0x0316 }
            int r8 = r7.a     // Catch:{ NumberFormatException -> 0x0316 }
            r8 = r8 | 32
            r7.a = r8     // Catch:{ NumberFormatException -> 0x0316 }
            r7.g = r5     // Catch:{ NumberFormatException -> 0x0316 }
            goto L_0x01e5
        L_0x0291:
            long r7 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x0316 }
            boolean r5 = r3.c     // Catch:{ NumberFormatException -> 0x0316 }
            if (r5 != 0) goto L_0x029a
            goto L_0x029f
        L_0x029a:
            r3.c()     // Catch:{ NumberFormatException -> 0x0316 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0316 }
        L_0x029f:
            aucj r5 = r3.b     // Catch:{ NumberFormatException -> 0x0316 }
            augt r5 = (defpackage.augt) r5     // Catch:{ NumberFormatException -> 0x0316 }
            int r9 = r5.a     // Catch:{ NumberFormatException -> 0x0316 }
            r9 = r9 | 16
            r5.a = r9     // Catch:{ NumberFormatException -> 0x0316 }
            r5.f = r7     // Catch:{ NumberFormatException -> 0x0316 }
            goto L_0x01e5
        L_0x02ad:
            int r5 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0316 }
            boolean r7 = r3.c     // Catch:{ NumberFormatException -> 0x0316 }
            if (r7 != 0) goto L_0x02b6
            goto L_0x02bb
        L_0x02b6:
            r3.c()     // Catch:{ NumberFormatException -> 0x0316 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0316 }
        L_0x02bb:
            aucj r7 = r3.b     // Catch:{ NumberFormatException -> 0x0316 }
            augt r7 = (defpackage.augt) r7     // Catch:{ NumberFormatException -> 0x0316 }
            int r8 = r7.a     // Catch:{ NumberFormatException -> 0x0316 }
            r8 = r8 | r11
            r7.a = r8     // Catch:{ NumberFormatException -> 0x0316 }
            r7.e = r5     // Catch:{ NumberFormatException -> 0x0316 }
            goto L_0x01e5
        L_0x02c8:
            boolean r5 = r3.c     // Catch:{ NumberFormatException -> 0x0316 }
            if (r5 != 0) goto L_0x02cd
            goto L_0x02d2
        L_0x02cd:
            r3.c()     // Catch:{ NumberFormatException -> 0x0316 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0316 }
        L_0x02d2:
            aucj r5 = r3.b     // Catch:{ NumberFormatException -> 0x0316 }
            augt r5 = (defpackage.augt) r5     // Catch:{ NumberFormatException -> 0x0316 }
            r8.getClass()     // Catch:{ NumberFormatException -> 0x0316 }
            int r7 = r5.a     // Catch:{ NumberFormatException -> 0x0316 }
            r7 = r7 | r12
            r5.a = r7     // Catch:{ NumberFormatException -> 0x0316 }
            r5.d = r8     // Catch:{ NumberFormatException -> 0x0316 }
            goto L_0x01e5
        L_0x02e2:
            boolean r5 = r3.c     // Catch:{ NumberFormatException -> 0x0316 }
            if (r5 != 0) goto L_0x02e7
            goto L_0x02ec
        L_0x02e7:
            r3.c()     // Catch:{ NumberFormatException -> 0x0316 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0316 }
        L_0x02ec:
            aucj r5 = r3.b     // Catch:{ NumberFormatException -> 0x0316 }
            augt r5 = (defpackage.augt) r5     // Catch:{ NumberFormatException -> 0x0316 }
            r8.getClass()     // Catch:{ NumberFormatException -> 0x0316 }
            int r7 = r5.a     // Catch:{ NumberFormatException -> 0x0316 }
            r7 = r7 | r13
            r5.a = r7     // Catch:{ NumberFormatException -> 0x0316 }
            r5.c = r8     // Catch:{ NumberFormatException -> 0x0316 }
            goto L_0x01e5
        L_0x02fc:
            boolean r5 = r3.c     // Catch:{ NumberFormatException -> 0x0316 }
            if (r5 != 0) goto L_0x0301
            goto L_0x0306
        L_0x0301:
            r3.c()     // Catch:{ NumberFormatException -> 0x0316 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0316 }
        L_0x0306:
            aucj r5 = r3.b     // Catch:{ NumberFormatException -> 0x0316 }
            augt r5 = (defpackage.augt) r5     // Catch:{ NumberFormatException -> 0x0316 }
            r8.getClass()     // Catch:{ NumberFormatException -> 0x0316 }
            int r7 = r5.a     // Catch:{ NumberFormatException -> 0x0316 }
            r7 = r7 | r14
            r5.a = r7     // Catch:{ NumberFormatException -> 0x0316 }
            r5.b = r8     // Catch:{ NumberFormatException -> 0x0316 }
            goto L_0x01e5
        L_0x0316:
            r0 = move-exception
            goto L_0x01e5
        L_0x0319:
            aucj r3 = r3.i()
            augt r3 = (defpackage.augt) r3
            boolean r4 = r2.c
            if (r4 != 0) goto L_0x0324
            goto L_0x0329
        L_0x0324:
            r21.c()
            r2.c = r6
        L_0x0329:
            aucj r4 = r2.b
            auhn r4 = (defpackage.auhn) r4
            auhn r5 = defpackage.auhn.q
            r3.getClass()
            r4.n = r3
            int r3 = r4.a
            r3 = r3 | 4096(0x1000, float:5.74E-42)
            r4.a = r3
            r3 = 1
            goto L_0x0a47
        L_0x033d:
            augp r3 = r1.b(r4)
            boolean r4 = r2.c
            if (r4 != 0) goto L_0x0346
            goto L_0x034b
        L_0x0346:
            r21.c()
            r2.c = r6
        L_0x034b:
            aucj r4 = r2.b
            auhn r4 = (defpackage.auhn) r4
            auhn r5 = defpackage.auhn.q
            r3.getClass()
            r4.k = r3
            int r3 = r4.a
            r3 = r3 | 512(0x200, float:7.175E-43)
            r4.a = r3
            r3 = 1
            goto L_0x0a47
        L_0x035f:
            auhp r3 = defpackage.auhp.u
            aucd r3 = r3.o()
            amsk r8 = n
            java.util.List r4 = r8.c(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x036f:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0686
            java.lang.Object r8 = r4.next()
            java.lang.String r8 = (java.lang.String) r8
            android.util.Pair r9 = h(r8)
            if (r9 == 0) goto L_0x036f
            java.lang.Object r5 = r9.second
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r9 = r9.first     // Catch:{ NumberFormatException -> 0x0683 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x0683 }
            int r18 = r9.hashCode()     // Catch:{ NumberFormatException -> 0x0683 }
            switch(r18) {
                case -1448341909: goto L_0x045a;
                case -1251147119: goto L_0x044f;
                case -900836463: goto L_0x0444;
                case -845599124: goto L_0x0439;
                case -814952356: goto L_0x042f;
                case -749237657: goto L_0x0425;
                case -590809035: goto L_0x041b;
                case -451867295: goto L_0x0411;
                case -416896356: goto L_0x0407;
                case -362373197: goto L_0x03fc;
                case 256195981: goto L_0x03f0;
                case 589666070: goto L_0x03e5;
                case 951623593: goto L_0x03d9;
                case 957454671: goto L_0x03cd;
                case 1213665542: goto L_0x03c2;
                case 1385992625: goto L_0x03b7;
                case 1948385782: goto L_0x03ab;
                case 2030519632: goto L_0x039f;
                case 2047649878: goto L_0x0393;
                default: goto L_0x0390;
            }     // Catch:{ NumberFormatException -> 0x0683 }
        L_0x0390:
            r7 = -1
            goto L_0x0464
        L_0x0393:
            java.lang.String r7 = "android.media.mediarecorder.NPauses"
            boolean r7 = r9.equals(r7)     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 == 0) goto L_0x0390
            r7 = 18
            goto L_0x0464
        L_0x039f:
            java.lang.String r7 = "android.media.mediarecorder.capture-fpsenable"
            boolean r7 = r9.equals(r7)     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 == 0) goto L_0x0390
            r7 = 13
            goto L_0x0464
        L_0x03ab:
            java.lang.String r7 = "android.media.mediarecorder.video-timescale"
            boolean r7 = r9.equals(r7)     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 == 0) goto L_0x0390
            r7 = 10
            goto L_0x0464
        L_0x03b7:
            java.lang.String r7 = "android.media.mediarecorder.width"
            boolean r7 = r9.equals(r7)     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 == 0) goto L_0x0390
            r7 = 0
            goto L_0x0464
        L_0x03c2:
            java.lang.String r7 = "android.media.mediarecorder.video-bitrate"
            boolean r7 = r9.equals(r7)     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 == 0) goto L_0x0390
            r7 = 3
            goto L_0x0464
        L_0x03cd:
            java.lang.String r7 = "android.media.mediarecorder.durationMs"
            boolean r7 = r9.equals(r7)     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 == 0) goto L_0x0390
            r7 = 16
            goto L_0x0464
        L_0x03d9:
            java.lang.String r7 = "android.media.mediarecorder.pausedMs"
            boolean r7 = r9.equals(r7)     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 == 0) goto L_0x0390
            r7 = 17
            goto L_0x0464
        L_0x03e5:
            java.lang.String r7 = "android.media.mediarecorder.audio-samplerate"
            boolean r7 = r9.equals(r7)     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 == 0) goto L_0x0390
            r7 = 4
            goto L_0x0464
        L_0x03f0:
            java.lang.String r7 = "android.media.mediarecorder.capture-fps"
            boolean r7 = r9.equals(r7)     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 == 0) goto L_0x0390
            r7 = 14
            goto L_0x0464
        L_0x03fc:
            java.lang.String r7 = "android.media.mediarecorder.rotation"
            boolean r7 = r9.equals(r7)     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 == 0) goto L_0x0390
            r7 = 15
            goto L_0x0464
        L_0x0407:
            java.lang.String r7 = "android.media.mediarecorder.height"
            boolean r7 = r9.equals(r7)     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 == 0) goto L_0x0390
            r7 = 1
            goto L_0x0464
        L_0x0411:
            java.lang.String r7 = "android.media.mediarecorder.audio-bitrate"
            boolean r7 = r9.equals(r7)     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 == 0) goto L_0x0390
            r7 = 6
            goto L_0x0464
        L_0x041b:
            java.lang.String r7 = "android.media.mediarecorder.frame-rate"
            boolean r7 = r9.equals(r7)     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 == 0) goto L_0x0390
            r7 = 2
            goto L_0x0464
        L_0x0425:
            java.lang.String r7 = "android.media.mediarecorder.video-iframe-interval"
            boolean r7 = r9.equals(r7)     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 == 0) goto L_0x0390
            r7 = 7
            goto L_0x0464
        L_0x042f:
            java.lang.String r7 = "android.media.mediarecorder.audio-channels"
            boolean r7 = r9.equals(r7)     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 == 0) goto L_0x0390
            r7 = 5
            goto L_0x0464
        L_0x0439:
            java.lang.String r7 = "android.media.mediarecorder.video-encoder-level"
            boolean r7 = r9.equals(r7)     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 == 0) goto L_0x0390
            r7 = 12
            goto L_0x0464
        L_0x0444:
            java.lang.String r7 = "android.media.mediarecorder.audio-timescale"
            boolean r7 = r9.equals(r7)     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 == 0) goto L_0x0390
            r7 = 9
            goto L_0x0464
        L_0x044f:
            java.lang.String r7 = "android.media.mediarecorder.video-encoder-profile"
            boolean r7 = r9.equals(r7)     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 == 0) goto L_0x0390
            r7 = 11
            goto L_0x0464
        L_0x045a:
            java.lang.String r7 = "android.media.mediarecorder.movie-timescale"
            boolean r7 = r9.equals(r7)     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 == 0) goto L_0x0390
            r7 = 8
        L_0x0464:
            switch(r7) {
                case 0: goto L_0x0668;
                case 1: goto L_0x064d;
                case 2: goto L_0x0632;
                case 3: goto L_0x0617;
                case 4: goto L_0x05fb;
                case 5: goto L_0x05df;
                case 6: goto L_0x05c3;
                case 7: goto L_0x05a7;
                case 8: goto L_0x058b;
                case 9: goto L_0x056f;
                case 10: goto L_0x0553;
                case 11: goto L_0x0537;
                case 12: goto L_0x051b;
                case 13: goto L_0x04ff;
                case 14: goto L_0x04e3;
                case 15: goto L_0x04c5;
                case 16: goto L_0x04a7;
                case 17: goto L_0x0489;
                case 18: goto L_0x046c;
                default: goto L_0x0467;
            }     // Catch:{ NumberFormatException -> 0x0683 }
        L_0x0467:
            r1.f(r8)     // Catch:{ NumberFormatException -> 0x0683 }
            goto L_0x036f
        L_0x046c:
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0683 }
            boolean r7 = r3.c     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 != 0) goto L_0x0475
            goto L_0x047a
        L_0x0475:
            r3.c()     // Catch:{ NumberFormatException -> 0x0683 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0683 }
        L_0x047a:
            aucj r7 = r3.b     // Catch:{ NumberFormatException -> 0x0683 }
            auhp r7 = (defpackage.auhp) r7     // Catch:{ NumberFormatException -> 0x0683 }
            int r8 = r7.a     // Catch:{ NumberFormatException -> 0x0683 }
            r9 = 262144(0x40000, float:3.67342E-40)
            r8 = r8 | r9
            r7.a = r8     // Catch:{ NumberFormatException -> 0x0683 }
            r7.t = r5     // Catch:{ NumberFormatException -> 0x0683 }
            goto L_0x036f
        L_0x0489:
            long r7 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0683 }
            boolean r5 = r3.c     // Catch:{ NumberFormatException -> 0x0683 }
            if (r5 != 0) goto L_0x0492
            goto L_0x0497
        L_0x0492:
            r3.c()     // Catch:{ NumberFormatException -> 0x0683 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0683 }
        L_0x0497:
            aucj r5 = r3.b     // Catch:{ NumberFormatException -> 0x0683 }
            auhp r5 = (defpackage.auhp) r5     // Catch:{ NumberFormatException -> 0x0683 }
            int r9 = r5.a     // Catch:{ NumberFormatException -> 0x0683 }
            r19 = 131072(0x20000, float:1.83671E-40)
            r9 = r9 | r19
            r5.a = r9     // Catch:{ NumberFormatException -> 0x0683 }
            r5.s = r7     // Catch:{ NumberFormatException -> 0x0683 }
            goto L_0x036f
        L_0x04a7:
            long r7 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0683 }
            boolean r5 = r3.c     // Catch:{ NumberFormatException -> 0x0683 }
            if (r5 != 0) goto L_0x04b0
            goto L_0x04b5
        L_0x04b0:
            r3.c()     // Catch:{ NumberFormatException -> 0x0683 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0683 }
        L_0x04b5:
            aucj r5 = r3.b     // Catch:{ NumberFormatException -> 0x0683 }
            auhp r5 = (defpackage.auhp) r5     // Catch:{ NumberFormatException -> 0x0683 }
            int r9 = r5.a     // Catch:{ NumberFormatException -> 0x0683 }
            r19 = 65536(0x10000, float:9.18355E-41)
            r9 = r9 | r19
            r5.a = r9     // Catch:{ NumberFormatException -> 0x0683 }
            r5.r = r7     // Catch:{ NumberFormatException -> 0x0683 }
            goto L_0x036f
        L_0x04c5:
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0683 }
            boolean r7 = r3.c     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 != 0) goto L_0x04ce
            goto L_0x04d3
        L_0x04ce:
            r3.c()     // Catch:{ NumberFormatException -> 0x0683 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0683 }
        L_0x04d3:
            aucj r7 = r3.b     // Catch:{ NumberFormatException -> 0x0683 }
            auhp r7 = (defpackage.auhp) r7     // Catch:{ NumberFormatException -> 0x0683 }
            int r8 = r7.a     // Catch:{ NumberFormatException -> 0x0683 }
            r9 = 32768(0x8000, float:4.5918E-41)
            r8 = r8 | r9
            r7.a = r8     // Catch:{ NumberFormatException -> 0x0683 }
            r7.q = r5     // Catch:{ NumberFormatException -> 0x0683 }
            goto L_0x036f
        L_0x04e3:
            double r7 = java.lang.Double.parseDouble(r5)     // Catch:{ NumberFormatException -> 0x0683 }
            boolean r5 = r3.c     // Catch:{ NumberFormatException -> 0x0683 }
            if (r5 != 0) goto L_0x04ec
            goto L_0x04f1
        L_0x04ec:
            r3.c()     // Catch:{ NumberFormatException -> 0x0683 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0683 }
        L_0x04f1:
            aucj r5 = r3.b     // Catch:{ NumberFormatException -> 0x0683 }
            auhp r5 = (defpackage.auhp) r5     // Catch:{ NumberFormatException -> 0x0683 }
            int r9 = r5.a     // Catch:{ NumberFormatException -> 0x0683 }
            r9 = r9 | 16384(0x4000, float:2.2959E-41)
            r5.a = r9     // Catch:{ NumberFormatException -> 0x0683 }
            r5.p = r7     // Catch:{ NumberFormatException -> 0x0683 }
            goto L_0x036f
        L_0x04ff:
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0683 }
            boolean r7 = r3.c     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 != 0) goto L_0x0508
            goto L_0x050d
        L_0x0508:
            r3.c()     // Catch:{ NumberFormatException -> 0x0683 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0683 }
        L_0x050d:
            aucj r7 = r3.b     // Catch:{ NumberFormatException -> 0x0683 }
            auhp r7 = (defpackage.auhp) r7     // Catch:{ NumberFormatException -> 0x0683 }
            int r8 = r7.a     // Catch:{ NumberFormatException -> 0x0683 }
            r8 = r8 | 8192(0x2000, float:1.14794E-41)
            r7.a = r8     // Catch:{ NumberFormatException -> 0x0683 }
            r7.o = r5     // Catch:{ NumberFormatException -> 0x0683 }
            goto L_0x036f
        L_0x051b:
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0683 }
            boolean r7 = r3.c     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 != 0) goto L_0x0524
            goto L_0x0529
        L_0x0524:
            r3.c()     // Catch:{ NumberFormatException -> 0x0683 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0683 }
        L_0x0529:
            aucj r7 = r3.b     // Catch:{ NumberFormatException -> 0x0683 }
            auhp r7 = (defpackage.auhp) r7     // Catch:{ NumberFormatException -> 0x0683 }
            int r8 = r7.a     // Catch:{ NumberFormatException -> 0x0683 }
            r8 = r8 | 4096(0x1000, float:5.74E-42)
            r7.a = r8     // Catch:{ NumberFormatException -> 0x0683 }
            r7.n = r5     // Catch:{ NumberFormatException -> 0x0683 }
            goto L_0x036f
        L_0x0537:
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0683 }
            boolean r7 = r3.c     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 != 0) goto L_0x0540
            goto L_0x0545
        L_0x0540:
            r3.c()     // Catch:{ NumberFormatException -> 0x0683 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0683 }
        L_0x0545:
            aucj r7 = r3.b     // Catch:{ NumberFormatException -> 0x0683 }
            auhp r7 = (defpackage.auhp) r7     // Catch:{ NumberFormatException -> 0x0683 }
            int r8 = r7.a     // Catch:{ NumberFormatException -> 0x0683 }
            r8 = r8 | 2048(0x800, float:2.87E-42)
            r7.a = r8     // Catch:{ NumberFormatException -> 0x0683 }
            r7.m = r5     // Catch:{ NumberFormatException -> 0x0683 }
            goto L_0x036f
        L_0x0553:
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0683 }
            boolean r7 = r3.c     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 != 0) goto L_0x055c
            goto L_0x0561
        L_0x055c:
            r3.c()     // Catch:{ NumberFormatException -> 0x0683 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0683 }
        L_0x0561:
            aucj r7 = r3.b     // Catch:{ NumberFormatException -> 0x0683 }
            auhp r7 = (defpackage.auhp) r7     // Catch:{ NumberFormatException -> 0x0683 }
            int r8 = r7.a     // Catch:{ NumberFormatException -> 0x0683 }
            r8 = r8 | 1024(0x400, float:1.435E-42)
            r7.a = r8     // Catch:{ NumberFormatException -> 0x0683 }
            r7.l = r5     // Catch:{ NumberFormatException -> 0x0683 }
            goto L_0x036f
        L_0x056f:
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0683 }
            boolean r7 = r3.c     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 != 0) goto L_0x0578
            goto L_0x057d
        L_0x0578:
            r3.c()     // Catch:{ NumberFormatException -> 0x0683 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0683 }
        L_0x057d:
            aucj r7 = r3.b     // Catch:{ NumberFormatException -> 0x0683 }
            auhp r7 = (defpackage.auhp) r7     // Catch:{ NumberFormatException -> 0x0683 }
            int r8 = r7.a     // Catch:{ NumberFormatException -> 0x0683 }
            r8 = r8 | 512(0x200, float:7.175E-43)
            r7.a = r8     // Catch:{ NumberFormatException -> 0x0683 }
            r7.k = r5     // Catch:{ NumberFormatException -> 0x0683 }
            goto L_0x036f
        L_0x058b:
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0683 }
            boolean r7 = r3.c     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 != 0) goto L_0x0594
            goto L_0x0599
        L_0x0594:
            r3.c()     // Catch:{ NumberFormatException -> 0x0683 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0683 }
        L_0x0599:
            aucj r7 = r3.b     // Catch:{ NumberFormatException -> 0x0683 }
            auhp r7 = (defpackage.auhp) r7     // Catch:{ NumberFormatException -> 0x0683 }
            int r8 = r7.a     // Catch:{ NumberFormatException -> 0x0683 }
            r8 = r8 | 256(0x100, float:3.59E-43)
            r7.a = r8     // Catch:{ NumberFormatException -> 0x0683 }
            r7.j = r5     // Catch:{ NumberFormatException -> 0x0683 }
            goto L_0x036f
        L_0x05a7:
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0683 }
            boolean r7 = r3.c     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 != 0) goto L_0x05b0
            goto L_0x05b5
        L_0x05b0:
            r3.c()     // Catch:{ NumberFormatException -> 0x0683 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0683 }
        L_0x05b5:
            aucj r7 = r3.b     // Catch:{ NumberFormatException -> 0x0683 }
            auhp r7 = (defpackage.auhp) r7     // Catch:{ NumberFormatException -> 0x0683 }
            int r8 = r7.a     // Catch:{ NumberFormatException -> 0x0683 }
            r8 = r8 | 128(0x80, float:1.794E-43)
            r7.a = r8     // Catch:{ NumberFormatException -> 0x0683 }
            r7.i = r5     // Catch:{ NumberFormatException -> 0x0683 }
            goto L_0x036f
        L_0x05c3:
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0683 }
            boolean r7 = r3.c     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 != 0) goto L_0x05cc
            goto L_0x05d1
        L_0x05cc:
            r3.c()     // Catch:{ NumberFormatException -> 0x0683 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0683 }
        L_0x05d1:
            aucj r7 = r3.b     // Catch:{ NumberFormatException -> 0x0683 }
            auhp r7 = (defpackage.auhp) r7     // Catch:{ NumberFormatException -> 0x0683 }
            int r8 = r7.a     // Catch:{ NumberFormatException -> 0x0683 }
            r8 = r8 | 64
            r7.a = r8     // Catch:{ NumberFormatException -> 0x0683 }
            r7.h = r5     // Catch:{ NumberFormatException -> 0x0683 }
            goto L_0x036f
        L_0x05df:
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0683 }
            boolean r7 = r3.c     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 != 0) goto L_0x05e8
            goto L_0x05ed
        L_0x05e8:
            r3.c()     // Catch:{ NumberFormatException -> 0x0683 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0683 }
        L_0x05ed:
            aucj r7 = r3.b     // Catch:{ NumberFormatException -> 0x0683 }
            auhp r7 = (defpackage.auhp) r7     // Catch:{ NumberFormatException -> 0x0683 }
            int r8 = r7.a     // Catch:{ NumberFormatException -> 0x0683 }
            r8 = r8 | 32
            r7.a = r8     // Catch:{ NumberFormatException -> 0x0683 }
            r7.g = r5     // Catch:{ NumberFormatException -> 0x0683 }
            goto L_0x036f
        L_0x05fb:
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0683 }
            boolean r7 = r3.c     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 != 0) goto L_0x0604
            goto L_0x0609
        L_0x0604:
            r3.c()     // Catch:{ NumberFormatException -> 0x0683 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0683 }
        L_0x0609:
            aucj r7 = r3.b     // Catch:{ NumberFormatException -> 0x0683 }
            auhp r7 = (defpackage.auhp) r7     // Catch:{ NumberFormatException -> 0x0683 }
            int r8 = r7.a     // Catch:{ NumberFormatException -> 0x0683 }
            r8 = r8 | 16
            r7.a = r8     // Catch:{ NumberFormatException -> 0x0683 }
            r7.f = r5     // Catch:{ NumberFormatException -> 0x0683 }
            goto L_0x036f
        L_0x0617:
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0683 }
            boolean r7 = r3.c     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 != 0) goto L_0x0620
            goto L_0x0625
        L_0x0620:
            r3.c()     // Catch:{ NumberFormatException -> 0x0683 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0683 }
        L_0x0625:
            aucj r7 = r3.b     // Catch:{ NumberFormatException -> 0x0683 }
            auhp r7 = (defpackage.auhp) r7     // Catch:{ NumberFormatException -> 0x0683 }
            int r8 = r7.a     // Catch:{ NumberFormatException -> 0x0683 }
            r8 = r8 | r11
            r7.a = r8     // Catch:{ NumberFormatException -> 0x0683 }
            r7.e = r5     // Catch:{ NumberFormatException -> 0x0683 }
            goto L_0x036f
        L_0x0632:
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0683 }
            boolean r7 = r3.c     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 != 0) goto L_0x063b
            goto L_0x0640
        L_0x063b:
            r3.c()     // Catch:{ NumberFormatException -> 0x0683 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0683 }
        L_0x0640:
            aucj r7 = r3.b     // Catch:{ NumberFormatException -> 0x0683 }
            auhp r7 = (defpackage.auhp) r7     // Catch:{ NumberFormatException -> 0x0683 }
            int r8 = r7.a     // Catch:{ NumberFormatException -> 0x0683 }
            r8 = r8 | r12
            r7.a = r8     // Catch:{ NumberFormatException -> 0x0683 }
            r7.d = r5     // Catch:{ NumberFormatException -> 0x0683 }
            goto L_0x036f
        L_0x064d:
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0683 }
            boolean r7 = r3.c     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 != 0) goto L_0x0656
            goto L_0x065b
        L_0x0656:
            r3.c()     // Catch:{ NumberFormatException -> 0x0683 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0683 }
        L_0x065b:
            aucj r7 = r3.b     // Catch:{ NumberFormatException -> 0x0683 }
            auhp r7 = (defpackage.auhp) r7     // Catch:{ NumberFormatException -> 0x0683 }
            int r8 = r7.a     // Catch:{ NumberFormatException -> 0x0683 }
            r8 = r8 | r13
            r7.a = r8     // Catch:{ NumberFormatException -> 0x0683 }
            r7.c = r5     // Catch:{ NumberFormatException -> 0x0683 }
            goto L_0x036f
        L_0x0668:
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0683 }
            boolean r7 = r3.c     // Catch:{ NumberFormatException -> 0x0683 }
            if (r7 != 0) goto L_0x0671
            goto L_0x0676
        L_0x0671:
            r3.c()     // Catch:{ NumberFormatException -> 0x0683 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0683 }
        L_0x0676:
            aucj r7 = r3.b     // Catch:{ NumberFormatException -> 0x0683 }
            auhp r7 = (defpackage.auhp) r7     // Catch:{ NumberFormatException -> 0x0683 }
            int r8 = r7.a     // Catch:{ NumberFormatException -> 0x0683 }
            r8 = r8 | r14
            r7.a = r8     // Catch:{ NumberFormatException -> 0x0683 }
            r7.b = r5     // Catch:{ NumberFormatException -> 0x0683 }
            goto L_0x036f
        L_0x0683:
            r0 = move-exception
            goto L_0x036f
        L_0x0686:
            aucj r3 = r3.i()
            auhp r3 = (defpackage.auhp) r3
            boolean r4 = r2.c
            if (r4 != 0) goto L_0x0691
            goto L_0x0696
        L_0x0691:
            r21.c()
            r2.c = r6
        L_0x0696:
            aucj r4 = r2.b
            auhn r4 = (defpackage.auhn) r4
            auhn r5 = defpackage.auhn.q
            r3.getClass()
            r4.j = r3
            int r3 = r4.a
            r3 = r3 | 256(0x100, float:3.59E-43)
            r4.a = r3
            r3 = 1
            goto L_0x0a47
        L_0x06aa:
            auho r3 = defpackage.auho.q
            aucd r3 = r3.o()
            amsk r5 = n
            java.util.List r4 = r5.c(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x06ba:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0929
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            android.util.Pair r7 = h(r5)
            if (r7 == 0) goto L_0x06ba
            java.lang.Object r8 = r7.second
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r7.first     // Catch:{ NumberFormatException -> 0x0926 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x0926 }
            int r9 = r7.hashCode()     // Catch:{ NumberFormatException -> 0x0926 }
            switch(r9) {
                case -1699666690: goto L_0x0775;
                case -1429227508: goto L_0x076b;
                case -1329554898: goto L_0x0760;
                case -1010945908: goto L_0x0755;
                case -969979241: goto L_0x074a;
                case -945195314: goto L_0x0740;
                case -854428317: goto L_0x0735;
                case -828612367: goto L_0x072b;
                case -738548354: goto L_0x0721;
                case -582814301: goto L_0x0716;
                case 389204985: goto L_0x070b;
                case 454273108: goto L_0x0700;
                case 719084504: goto L_0x06f5;
                case 764569689: goto L_0x06ea;
                case 830147074: goto L_0x06de;
                default: goto L_0x06db;
            }     // Catch:{ NumberFormatException -> 0x0926 }
        L_0x06db:
            r7 = -1
            goto L_0x077f
        L_0x06de:
            java.lang.String r9 = "android.media.mediaplayer.playingMs"
            boolean r7 = r7.equals(r9)     // Catch:{ NumberFormatException -> 0x0926 }
            if (r7 == 0) goto L_0x06db
            r7 = 9
            goto L_0x077f
        L_0x06ea:
            java.lang.String r9 = "android.media.mediaplayer.height"
            boolean r7 = r7.equals(r9)     // Catch:{ NumberFormatException -> 0x0926 }
            if (r7 == 0) goto L_0x06db
            r7 = 5
            goto L_0x077f
        L_0x06f5:
            java.lang.String r9 = "android.media.mediaplayer.frames"
            boolean r7 = r7.equals(r9)     // Catch:{ NumberFormatException -> 0x0926 }
            if (r7 == 0) goto L_0x06db
            r7 = 6
            goto L_0x077f
        L_0x0700:
            java.lang.String r9 = "android.media.mediaplayer.width"
            boolean r7 = r7.equals(r9)     // Catch:{ NumberFormatException -> 0x0926 }
            if (r7 == 0) goto L_0x06db
            r7 = 4
            goto L_0x077f
        L_0x070b:
            java.lang.String r9 = "android.media.mediaplayer.video.mime"
            boolean r7 = r7.equals(r9)     // Catch:{ NumberFormatException -> 0x0926 }
            if (r7 == 0) goto L_0x06db
            r7 = 0
            goto L_0x077f
        L_0x0716:
            java.lang.String r9 = "android.media.mediaplayer.rebufferExit"
            boolean r7 = r7.equals(r9)     // Catch:{ NumberFormatException -> 0x0926 }
            if (r7 == 0) goto L_0x06db
            r7 = 13
            goto L_0x077f
        L_0x0721:
            java.lang.String r9 = "android.media.mediaplayer.audio.mime"
            boolean r7 = r7.equals(r9)     // Catch:{ NumberFormatException -> 0x0926 }
            if (r7 == 0) goto L_0x06db
            r7 = 2
            goto L_0x077f
        L_0x072b:
            java.lang.String r9 = "android.media.mediaplayer.video.codec"
            boolean r7 = r7.equals(r9)     // Catch:{ NumberFormatException -> 0x0926 }
            if (r7 == 0) goto L_0x06db
            r7 = 1
            goto L_0x077f
        L_0x0735:
            java.lang.String r9 = "android.media.mediaplayer.rebufferingMs"
            boolean r7 = r7.equals(r9)     // Catch:{ NumberFormatException -> 0x0926 }
            if (r7 == 0) goto L_0x06db
            r7 = 11
            goto L_0x077f
        L_0x0740:
            java.lang.String r9 = "android.media.mediaplayer.dropped"
            boolean r7 = r7.equals(r9)     // Catch:{ NumberFormatException -> 0x0926 }
            if (r7 == 0) goto L_0x06db
            r7 = 7
            goto L_0x077f
        L_0x074a:
            java.lang.String r9 = "android.media.mediaplayer.dataSource"
            boolean r7 = r7.equals(r9)     // Catch:{ NumberFormatException -> 0x0926 }
            if (r7 == 0) goto L_0x06db
            r7 = 10
            goto L_0x077f
        L_0x0755:
            java.lang.String r9 = "android.media.mediaplayer.durationMs"
            boolean r7 = r7.equals(r9)     // Catch:{ NumberFormatException -> 0x0926 }
            if (r7 == 0) goto L_0x06db
            r7 = 8
            goto L_0x077f
        L_0x0760:
            java.lang.String r9 = "android.media.mediaplayer.rebuffers"
            boolean r7 = r7.equals(r9)     // Catch:{ NumberFormatException -> 0x0926 }
            if (r7 == 0) goto L_0x06db
            r7 = 12
            goto L_0x077f
        L_0x076b:
            java.lang.String r9 = "android.media.mediaplayer.audio.codec"
            boolean r7 = r7.equals(r9)     // Catch:{ NumberFormatException -> 0x0926 }
            if (r7 == 0) goto L_0x06db
            r7 = 3
            goto L_0x077f
        L_0x0775:
            java.lang.String r9 = "android.media.mediaplayer.errstate"
            boolean r7 = r7.equals(r9)     // Catch:{ NumberFormatException -> 0x0926 }
            if (r7 == 0) goto L_0x06db
            r7 = 14
        L_0x077f:
            switch(r7) {
                case 0: goto L_0x090c;
                case 1: goto L_0x08f2;
                case 2: goto L_0x08d8;
                case 3: goto L_0x08be;
                case 4: goto L_0x08a2;
                case 5: goto L_0x0886;
                case 6: goto L_0x086a;
                case 7: goto L_0x084e;
                case 8: goto L_0x0832;
                case 9: goto L_0x0816;
                case 10: goto L_0x07fb;
                case 11: goto L_0x07df;
                case 12: goto L_0x07c3;
                case 13: goto L_0x07a2;
                case 14: goto L_0x0787;
                default: goto L_0x0782;
            }     // Catch:{ NumberFormatException -> 0x0926 }
        L_0x0782:
            r1.f(r5)     // Catch:{ NumberFormatException -> 0x0926 }
            goto L_0x06ba
        L_0x0787:
            boolean r5 = r3.c     // Catch:{ NumberFormatException -> 0x0926 }
            if (r5 != 0) goto L_0x078c
            goto L_0x0791
        L_0x078c:
            r3.c()     // Catch:{ NumberFormatException -> 0x0926 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0926 }
        L_0x0791:
            aucj r5 = r3.b     // Catch:{ NumberFormatException -> 0x0926 }
            auho r5 = (defpackage.auho) r5     // Catch:{ NumberFormatException -> 0x0926 }
            r8.getClass()     // Catch:{ NumberFormatException -> 0x0926 }
            int r7 = r5.a     // Catch:{ NumberFormatException -> 0x0926 }
            r7 = r7 | 16384(0x4000, float:2.2959E-41)
            r5.a = r7     // Catch:{ NumberFormatException -> 0x0926 }
            r5.p = r8     // Catch:{ NumberFormatException -> 0x0926 }
            goto L_0x06ba
        L_0x07a2:
            int r5 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0926 }
            if (r5 == 0) goto L_0x07aa
            r5 = 1
            goto L_0x07ab
        L_0x07aa:
            r5 = 0
        L_0x07ab:
            boolean r7 = r3.c     // Catch:{ NumberFormatException -> 0x0926 }
            if (r7 != 0) goto L_0x07b0
            goto L_0x07b5
        L_0x07b0:
            r3.c()     // Catch:{ NumberFormatException -> 0x0926 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0926 }
        L_0x07b5:
            aucj r7 = r3.b     // Catch:{ NumberFormatException -> 0x0926 }
            auho r7 = (defpackage.auho) r7     // Catch:{ NumberFormatException -> 0x0926 }
            int r8 = r7.a     // Catch:{ NumberFormatException -> 0x0926 }
            r8 = r8 | 8192(0x2000, float:1.14794E-41)
            r7.a = r8     // Catch:{ NumberFormatException -> 0x0926 }
            r7.o = r5     // Catch:{ NumberFormatException -> 0x0926 }
            goto L_0x06ba
        L_0x07c3:
            int r5 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0926 }
            boolean r7 = r3.c     // Catch:{ NumberFormatException -> 0x0926 }
            if (r7 != 0) goto L_0x07cc
            goto L_0x07d1
        L_0x07cc:
            r3.c()     // Catch:{ NumberFormatException -> 0x0926 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0926 }
        L_0x07d1:
            aucj r7 = r3.b     // Catch:{ NumberFormatException -> 0x0926 }
            auho r7 = (defpackage.auho) r7     // Catch:{ NumberFormatException -> 0x0926 }
            int r8 = r7.a     // Catch:{ NumberFormatException -> 0x0926 }
            r8 = r8 | 4096(0x1000, float:5.74E-42)
            r7.a = r8     // Catch:{ NumberFormatException -> 0x0926 }
            r7.n = r5     // Catch:{ NumberFormatException -> 0x0926 }
            goto L_0x06ba
        L_0x07df:
            long r7 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x0926 }
            boolean r5 = r3.c     // Catch:{ NumberFormatException -> 0x0926 }
            if (r5 != 0) goto L_0x07e8
            goto L_0x07ed
        L_0x07e8:
            r3.c()     // Catch:{ NumberFormatException -> 0x0926 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0926 }
        L_0x07ed:
            aucj r5 = r3.b     // Catch:{ NumberFormatException -> 0x0926 }
            auho r5 = (defpackage.auho) r5     // Catch:{ NumberFormatException -> 0x0926 }
            int r9 = r5.a     // Catch:{ NumberFormatException -> 0x0926 }
            r9 = r9 | 2048(0x800, float:2.87E-42)
            r5.a = r9     // Catch:{ NumberFormatException -> 0x0926 }
            r5.m = r7     // Catch:{ NumberFormatException -> 0x0926 }
            goto L_0x06ba
        L_0x07fb:
            boolean r5 = r3.c     // Catch:{ NumberFormatException -> 0x0926 }
            if (r5 != 0) goto L_0x0800
            goto L_0x0805
        L_0x0800:
            r3.c()     // Catch:{ NumberFormatException -> 0x0926 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0926 }
        L_0x0805:
            aucj r5 = r3.b     // Catch:{ NumberFormatException -> 0x0926 }
            auho r5 = (defpackage.auho) r5     // Catch:{ NumberFormatException -> 0x0926 }
            r8.getClass()     // Catch:{ NumberFormatException -> 0x0926 }
            int r7 = r5.a     // Catch:{ NumberFormatException -> 0x0926 }
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r5.a = r7     // Catch:{ NumberFormatException -> 0x0926 }
            r5.l = r8     // Catch:{ NumberFormatException -> 0x0926 }
            goto L_0x06ba
        L_0x0816:
            long r7 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x0926 }
            boolean r5 = r3.c     // Catch:{ NumberFormatException -> 0x0926 }
            if (r5 != 0) goto L_0x081f
            goto L_0x0824
        L_0x081f:
            r3.c()     // Catch:{ NumberFormatException -> 0x0926 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0926 }
        L_0x0824:
            aucj r5 = r3.b     // Catch:{ NumberFormatException -> 0x0926 }
            auho r5 = (defpackage.auho) r5     // Catch:{ NumberFormatException -> 0x0926 }
            int r9 = r5.a     // Catch:{ NumberFormatException -> 0x0926 }
            r9 = r9 | 512(0x200, float:7.175E-43)
            r5.a = r9     // Catch:{ NumberFormatException -> 0x0926 }
            r5.k = r7     // Catch:{ NumberFormatException -> 0x0926 }
            goto L_0x06ba
        L_0x0832:
            long r7 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x0926 }
            boolean r5 = r3.c     // Catch:{ NumberFormatException -> 0x0926 }
            if (r5 != 0) goto L_0x083b
            goto L_0x0840
        L_0x083b:
            r3.c()     // Catch:{ NumberFormatException -> 0x0926 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0926 }
        L_0x0840:
            aucj r5 = r3.b     // Catch:{ NumberFormatException -> 0x0926 }
            auho r5 = (defpackage.auho) r5     // Catch:{ NumberFormatException -> 0x0926 }
            int r9 = r5.a     // Catch:{ NumberFormatException -> 0x0926 }
            r9 = r9 | 256(0x100, float:3.59E-43)
            r5.a = r9     // Catch:{ NumberFormatException -> 0x0926 }
            r5.j = r7     // Catch:{ NumberFormatException -> 0x0926 }
            goto L_0x06ba
        L_0x084e:
            long r7 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x0926 }
            boolean r5 = r3.c     // Catch:{ NumberFormatException -> 0x0926 }
            if (r5 != 0) goto L_0x0857
            goto L_0x085c
        L_0x0857:
            r3.c()     // Catch:{ NumberFormatException -> 0x0926 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0926 }
        L_0x085c:
            aucj r5 = r3.b     // Catch:{ NumberFormatException -> 0x0926 }
            auho r5 = (defpackage.auho) r5     // Catch:{ NumberFormatException -> 0x0926 }
            int r9 = r5.a     // Catch:{ NumberFormatException -> 0x0926 }
            r9 = r9 | 128(0x80, float:1.794E-43)
            r5.a = r9     // Catch:{ NumberFormatException -> 0x0926 }
            r5.i = r7     // Catch:{ NumberFormatException -> 0x0926 }
            goto L_0x06ba
        L_0x086a:
            long r7 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x0926 }
            boolean r5 = r3.c     // Catch:{ NumberFormatException -> 0x0926 }
            if (r5 != 0) goto L_0x0873
            goto L_0x0878
        L_0x0873:
            r3.c()     // Catch:{ NumberFormatException -> 0x0926 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0926 }
        L_0x0878:
            aucj r5 = r3.b     // Catch:{ NumberFormatException -> 0x0926 }
            auho r5 = (defpackage.auho) r5     // Catch:{ NumberFormatException -> 0x0926 }
            int r9 = r5.a     // Catch:{ NumberFormatException -> 0x0926 }
            r9 = r9 | 64
            r5.a = r9     // Catch:{ NumberFormatException -> 0x0926 }
            r5.h = r7     // Catch:{ NumberFormatException -> 0x0926 }
            goto L_0x06ba
        L_0x0886:
            int r5 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0926 }
            boolean r7 = r3.c     // Catch:{ NumberFormatException -> 0x0926 }
            if (r7 != 0) goto L_0x088f
            goto L_0x0894
        L_0x088f:
            r3.c()     // Catch:{ NumberFormatException -> 0x0926 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0926 }
        L_0x0894:
            aucj r7 = r3.b     // Catch:{ NumberFormatException -> 0x0926 }
            auho r7 = (defpackage.auho) r7     // Catch:{ NumberFormatException -> 0x0926 }
            int r8 = r7.a     // Catch:{ NumberFormatException -> 0x0926 }
            r8 = r8 | 32
            r7.a = r8     // Catch:{ NumberFormatException -> 0x0926 }
            r7.g = r5     // Catch:{ NumberFormatException -> 0x0926 }
            goto L_0x06ba
        L_0x08a2:
            int r5 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0926 }
            boolean r7 = r3.c     // Catch:{ NumberFormatException -> 0x0926 }
            if (r7 != 0) goto L_0x08ab
            goto L_0x08b0
        L_0x08ab:
            r3.c()     // Catch:{ NumberFormatException -> 0x0926 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0926 }
        L_0x08b0:
            aucj r7 = r3.b     // Catch:{ NumberFormatException -> 0x0926 }
            auho r7 = (defpackage.auho) r7     // Catch:{ NumberFormatException -> 0x0926 }
            int r8 = r7.a     // Catch:{ NumberFormatException -> 0x0926 }
            r8 = r8 | 16
            r7.a = r8     // Catch:{ NumberFormatException -> 0x0926 }
            r7.f = r5     // Catch:{ NumberFormatException -> 0x0926 }
            goto L_0x06ba
        L_0x08be:
            boolean r5 = r3.c     // Catch:{ NumberFormatException -> 0x0926 }
            if (r5 != 0) goto L_0x08c3
            goto L_0x08c8
        L_0x08c3:
            r3.c()     // Catch:{ NumberFormatException -> 0x0926 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0926 }
        L_0x08c8:
            aucj r5 = r3.b     // Catch:{ NumberFormatException -> 0x0926 }
            auho r5 = (defpackage.auho) r5     // Catch:{ NumberFormatException -> 0x0926 }
            r8.getClass()     // Catch:{ NumberFormatException -> 0x0926 }
            int r7 = r5.a     // Catch:{ NumberFormatException -> 0x0926 }
            r7 = r7 | r11
            r5.a = r7     // Catch:{ NumberFormatException -> 0x0926 }
            r5.e = r8     // Catch:{ NumberFormatException -> 0x0926 }
            goto L_0x06ba
        L_0x08d8:
            boolean r5 = r3.c     // Catch:{ NumberFormatException -> 0x0926 }
            if (r5 != 0) goto L_0x08dd
            goto L_0x08e2
        L_0x08dd:
            r3.c()     // Catch:{ NumberFormatException -> 0x0926 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0926 }
        L_0x08e2:
            aucj r5 = r3.b     // Catch:{ NumberFormatException -> 0x0926 }
            auho r5 = (defpackage.auho) r5     // Catch:{ NumberFormatException -> 0x0926 }
            r8.getClass()     // Catch:{ NumberFormatException -> 0x0926 }
            int r7 = r5.a     // Catch:{ NumberFormatException -> 0x0926 }
            r7 = r7 | r12
            r5.a = r7     // Catch:{ NumberFormatException -> 0x0926 }
            r5.d = r8     // Catch:{ NumberFormatException -> 0x0926 }
            goto L_0x06ba
        L_0x08f2:
            boolean r5 = r3.c     // Catch:{ NumberFormatException -> 0x0926 }
            if (r5 != 0) goto L_0x08f7
            goto L_0x08fc
        L_0x08f7:
            r3.c()     // Catch:{ NumberFormatException -> 0x0926 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0926 }
        L_0x08fc:
            aucj r5 = r3.b     // Catch:{ NumberFormatException -> 0x0926 }
            auho r5 = (defpackage.auho) r5     // Catch:{ NumberFormatException -> 0x0926 }
            r8.getClass()     // Catch:{ NumberFormatException -> 0x0926 }
            int r7 = r5.a     // Catch:{ NumberFormatException -> 0x0926 }
            r7 = r7 | r13
            r5.a = r7     // Catch:{ NumberFormatException -> 0x0926 }
            r5.c = r8     // Catch:{ NumberFormatException -> 0x0926 }
            goto L_0x06ba
        L_0x090c:
            boolean r5 = r3.c     // Catch:{ NumberFormatException -> 0x0926 }
            if (r5 != 0) goto L_0x0911
            goto L_0x0916
        L_0x0911:
            r3.c()     // Catch:{ NumberFormatException -> 0x0926 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0926 }
        L_0x0916:
            aucj r5 = r3.b     // Catch:{ NumberFormatException -> 0x0926 }
            auho r5 = (defpackage.auho) r5     // Catch:{ NumberFormatException -> 0x0926 }
            r8.getClass()     // Catch:{ NumberFormatException -> 0x0926 }
            int r7 = r5.a     // Catch:{ NumberFormatException -> 0x0926 }
            r7 = r7 | r14
            r5.a = r7     // Catch:{ NumberFormatException -> 0x0926 }
            r5.b = r8     // Catch:{ NumberFormatException -> 0x0926 }
            goto L_0x06ba
        L_0x0926:
            r0 = move-exception
            goto L_0x06ba
        L_0x0929:
            aucj r3 = r3.i()
            auho r3 = (defpackage.auho) r3
            boolean r4 = r2.c
            if (r4 != 0) goto L_0x0934
            goto L_0x0939
        L_0x0934:
            r21.c()
            r2.c = r6
        L_0x0939:
            aucj r4 = r2.b
            auhn r4 = (defpackage.auhn) r4
            auhn r5 = defpackage.auhn.q
            r3.getClass()
            r4.i = r3
            int r3 = r4.a
            r3 = r3 | 128(0x80, float:1.794E-43)
            r4.a = r3
            r3 = 1
            goto L_0x0a47
        L_0x094d:
            auhi r3 = defpackage.auhi.e
            aucd r3 = r3.o()
            amsk r5 = n
            java.util.List r4 = r5.c(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x095d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0a04
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            android.util.Pair r7 = h(r5)
            if (r7 == 0) goto L_0x095d
            java.lang.Object r8 = r7.second
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r7.first     // Catch:{ NumberFormatException -> 0x0a01 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x0a01 }
            int r9 = r7.hashCode()     // Catch:{ NumberFormatException -> 0x0a01 }
            r10 = -981783224(0xffffffffc57b2d48, float:-4018.83)
            if (r9 == r10) goto L_0x09a0
            r10 = -370304295(0xffffffffe9ed9ad9, float:-3.5905833E25)
            if (r9 == r10) goto L_0x0996
            r10 = -370263772(0xffffffffe9ee3924, float:-3.5999273E25)
            if (r9 == r10) goto L_0x098c
        L_0x098a:
            r7 = -1
            goto L_0x09a9
        L_0x098c:
            java.lang.String r9 = "android.media.mediaextractor.ntrk"
            boolean r7 = r7.equals(r9)     // Catch:{ NumberFormatException -> 0x0a01 }
            if (r7 == 0) goto L_0x098a
            r7 = 2
            goto L_0x09a9
        L_0x0996:
            java.lang.String r9 = "android.media.mediaextractor.mime"
            boolean r7 = r7.equals(r9)     // Catch:{ NumberFormatException -> 0x0a01 }
            if (r7 == 0) goto L_0x098a
            r7 = 0
            goto L_0x09a9
        L_0x09a0:
            java.lang.String r9 = "android.media.mediaextractor.fmt"
            boolean r7 = r7.equals(r9)     // Catch:{ NumberFormatException -> 0x0a01 }
            if (r7 == 0) goto L_0x098a
            r7 = 1
        L_0x09a9:
            if (r7 == 0) goto L_0x09e7
            if (r7 == r14) goto L_0x09cd
            if (r7 == r13) goto L_0x09b3
            r1.f(r5)     // Catch:{ NumberFormatException -> 0x0a01 }
            goto L_0x095d
        L_0x09b3:
            int r5 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0a01 }
            boolean r7 = r3.c     // Catch:{ NumberFormatException -> 0x0a01 }
            if (r7 != 0) goto L_0x09bc
            goto L_0x09c1
        L_0x09bc:
            r3.c()     // Catch:{ NumberFormatException -> 0x0a01 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0a01 }
        L_0x09c1:
            aucj r7 = r3.b     // Catch:{ NumberFormatException -> 0x0a01 }
            auhi r7 = (defpackage.auhi) r7     // Catch:{ NumberFormatException -> 0x0a01 }
            int r8 = r7.a     // Catch:{ NumberFormatException -> 0x0a01 }
            r8 = r8 | r12
            r7.a = r8     // Catch:{ NumberFormatException -> 0x0a01 }
            r7.d = r5     // Catch:{ NumberFormatException -> 0x0a01 }
            goto L_0x095d
        L_0x09cd:
            boolean r5 = r3.c     // Catch:{ NumberFormatException -> 0x0a01 }
            if (r5 != 0) goto L_0x09d2
            goto L_0x09d7
        L_0x09d2:
            r3.c()     // Catch:{ NumberFormatException -> 0x0a01 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0a01 }
        L_0x09d7:
            aucj r5 = r3.b     // Catch:{ NumberFormatException -> 0x0a01 }
            auhi r5 = (defpackage.auhi) r5     // Catch:{ NumberFormatException -> 0x0a01 }
            r8.getClass()     // Catch:{ NumberFormatException -> 0x0a01 }
            int r7 = r5.a     // Catch:{ NumberFormatException -> 0x0a01 }
            r7 = r7 | r13
            r5.a = r7     // Catch:{ NumberFormatException -> 0x0a01 }
            r5.c = r8     // Catch:{ NumberFormatException -> 0x0a01 }
            goto L_0x095d
        L_0x09e7:
            boolean r5 = r3.c     // Catch:{ NumberFormatException -> 0x0a01 }
            if (r5 != 0) goto L_0x09ec
            goto L_0x09f1
        L_0x09ec:
            r3.c()     // Catch:{ NumberFormatException -> 0x0a01 }
            r3.c = r6     // Catch:{ NumberFormatException -> 0x0a01 }
        L_0x09f1:
            aucj r5 = r3.b     // Catch:{ NumberFormatException -> 0x0a01 }
            auhi r5 = (defpackage.auhi) r5     // Catch:{ NumberFormatException -> 0x0a01 }
            r8.getClass()     // Catch:{ NumberFormatException -> 0x0a01 }
            int r7 = r5.a     // Catch:{ NumberFormatException -> 0x0a01 }
            r7 = r7 | r14
            r5.a = r7     // Catch:{ NumberFormatException -> 0x0a01 }
            r5.b = r8     // Catch:{ NumberFormatException -> 0x0a01 }
            goto L_0x095d
        L_0x0a01:
            r0 = move-exception
            goto L_0x095d
        L_0x0a04:
            aucj r3 = r3.i()
            auhi r3 = (defpackage.auhi) r3
            boolean r4 = r2.c
            if (r4 != 0) goto L_0x0a0f
            goto L_0x0a14
        L_0x0a0f:
            r21.c()
            r2.c = r6
        L_0x0a14:
            aucj r4 = r2.b
            auhn r4 = (defpackage.auhn) r4
            auhn r5 = defpackage.auhn.q
            r3.getClass()
            r4.h = r3
            int r3 = r4.a
            r3 = r3 | 64
            r4.a = r3
            r3 = 1
            goto L_0x0a47
        L_0x0a27:
            augv r3 = r1.a(r4)
            boolean r4 = r2.c
            if (r4 != 0) goto L_0x0a30
            goto L_0x0a35
        L_0x0a30:
            r21.c()
            r2.c = r6
        L_0x0a35:
            aucj r4 = r2.b
            auhn r4 = (defpackage.auhn) r4
            auhn r5 = defpackage.auhn.q
            r3.getClass()
            r4.f = r3
            int r3 = r4.a
            r3 = r3 | 16
            r4.a = r3
            r3 = 1
        L_0x0a47:
            if (r3 == 0) goto L_0x0a4a
            goto L_0x0a4f
        L_0x0a4a:
            boolean r4 = r1.t
            if (r4 != 0) goto L_0x0a4f
            return r6
        L_0x0a4f:
            int r4 = r24.length()     // Catch:{ NumberFormatException -> 0x0a7d, IndexOutOfBoundsException -> 0x0a7b }
            int r4 = r4 + -9
            r5 = r24
            java.lang.String r4 = r5.substring(r6, r4)     // Catch:{ NumberFormatException -> 0x0a7d, IndexOutOfBoundsException -> 0x0a7b }
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x0a7d, IndexOutOfBoundsException -> 0x0a7b }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r7
            boolean r7 = r2.c     // Catch:{ NumberFormatException -> 0x0a7d, IndexOutOfBoundsException -> 0x0a7b }
            if (r7 != 0) goto L_0x0a68
            goto L_0x0a6d
        L_0x0a68:
            r21.c()     // Catch:{ NumberFormatException -> 0x0a7d, IndexOutOfBoundsException -> 0x0a7b }
            r2.c = r6     // Catch:{ NumberFormatException -> 0x0a7d, IndexOutOfBoundsException -> 0x0a7b }
        L_0x0a6d:
            aucj r2 = r2.b     // Catch:{ NumberFormatException -> 0x0a7d, IndexOutOfBoundsException -> 0x0a7b }
            auhn r2 = (defpackage.auhn) r2     // Catch:{ NumberFormatException -> 0x0a7d, IndexOutOfBoundsException -> 0x0a7b }
            auhn r6 = defpackage.auhn.q     // Catch:{ NumberFormatException -> 0x0a7d, IndexOutOfBoundsException -> 0x0a7b }
            int r6 = r2.a     // Catch:{ NumberFormatException -> 0x0a7d, IndexOutOfBoundsException -> 0x0a7b }
            r6 = r6 | r14
            r2.a = r6     // Catch:{ NumberFormatException -> 0x0a7d, IndexOutOfBoundsException -> 0x0a7b }
            r2.b = r4     // Catch:{ NumberFormatException -> 0x0a7d, IndexOutOfBoundsException -> 0x0a7b }
            goto L_0x0a7e
        L_0x0a7b:
            r0 = move-exception
            goto L_0x0a7e
        L_0x0a7d:
            r0 = move-exception
        L_0x0a7e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.actm.a(aucd, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.augv a(java.lang.String r13) {
        /*
            r12 = this;
            augv r0 = defpackage.augv.u
            aucd r0 = r0.o()
            amsk r1 = n
            java.util.List r13 = r1.c(r13)
            java.util.Iterator r13 = r13.iterator()
        L_0x0010:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0354
            java.lang.Object r1 = r13.next()
            java.lang.String r1 = (java.lang.String) r1
            android.util.Pair r2 = h(r1)
            if (r2 == 0) goto L_0x0010
            java.lang.Object r3 = r2.second
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.first     // Catch:{ NumberFormatException -> 0x0351 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x0351 }
            int r4 = r2.hashCode()     // Catch:{ NumberFormatException -> 0x0351 }
            r5 = 8
            r6 = 16
            r7 = 4
            r8 = 2
            r9 = 1
            r10 = -1
            r11 = 0
            switch(r4) {
                case -1514507257: goto L_0x0103;
                case -1155421937: goto L_0x00f8;
                case -1155411039: goto L_0x00ed;
                case -1155410801: goto L_0x00e2;
                case -980431018: goto L_0x00d7;
                case -580900360: goto L_0x00cc;
                case -123828825: goto L_0x00c2;
                case -123823338: goto L_0x00b8;
                case 447208707: goto L_0x00ae;
                case 455239793: goto L_0x00a3;
                case 465500851: goto L_0x0098;
                case 633372529: goto L_0x008d;
                case 1103607509: goto L_0x0081;
                case 1112629722: goto L_0x0076;
                case 1427385386: goto L_0x006b;
                case 1893767659: goto L_0x005f;
                case 2016594633: goto L_0x0054;
                case 2073543231: goto L_0x0048;
                case 2144617087: goto L_0x003c;
                default: goto L_0x003a;
            }     // Catch:{ NumberFormatException -> 0x0351 }
        L_0x003a:
            goto L_0x010d
        L_0x003c:
            java.lang.String r4 = "android.media.mediacodec.errcode"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 == 0) goto L_0x003a
            r10 = 18
            goto L_0x010d
        L_0x0048:
            java.lang.String r4 = "android.media.mediacodec.errstate"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 == 0) goto L_0x003a
            r10 = 8
            goto L_0x010d
        L_0x0054:
            java.lang.String r4 = "android.media.mediacodec.encoder"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 == 0) goto L_0x003a
            r10 = 3
            goto L_0x010d
        L_0x005f:
            java.lang.String r4 = "android.media.mediacodec.latency.n"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 == 0) goto L_0x003a
            r10 = 12
            goto L_0x010d
        L_0x006b:
            java.lang.String r4 = "android.media.mediacodec.secure"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 == 0) goto L_0x003a
            r10 = 7
            goto L_0x010d
        L_0x0076:
            java.lang.String r4 = "android.media.mediacodec.height"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 == 0) goto L_0x003a
            r10 = 5
            goto L_0x010d
        L_0x0081:
            java.lang.String r4 = "android.media.mediacodec.maxwidth"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 == 0) goto L_0x003a
            r10 = 16
            goto L_0x010d
        L_0x008d:
            java.lang.String r4 = "android.media.mediacodec.rotation"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 == 0) goto L_0x003a
            r10 = 6
            goto L_0x010d
        L_0x0098:
            java.lang.String r4 = "android.media.mediacodec.width"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 == 0) goto L_0x003a
            r10 = 4
            goto L_0x010d
        L_0x00a3:
            java.lang.String r4 = "android.media.mediacodec.level"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 == 0) goto L_0x003a
            r10 = 15
            goto L_0x010d
        L_0x00ae:
            java.lang.String r4 = "android.media.mediacodec.codec"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 == 0) goto L_0x003a
            r10 = 1
            goto L_0x010d
        L_0x00b8:
            java.lang.String r4 = "android.media.mediacodec.mode"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 == 0) goto L_0x003a
            r10 = 2
            goto L_0x010d
        L_0x00c2:
            java.lang.String r4 = "android.media.mediacodec.mime"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 == 0) goto L_0x003a
            r10 = 0
            goto L_0x010d
        L_0x00cc:
            java.lang.String r4 = "android.media.mediacodec.maxheight"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 == 0) goto L_0x003a
            r10 = 17
            goto L_0x010d
        L_0x00d7:
            java.lang.String r4 = "android.media.mediacodec.profile"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 == 0) goto L_0x003a
            r10 = 14
            goto L_0x010d
        L_0x00e2:
            java.lang.String r4 = "android.media.mediacodec.latency.min"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 == 0) goto L_0x003a
            r10 = 10
            goto L_0x010d
        L_0x00ed:
            java.lang.String r4 = "android.media.mediacodec.latency.max"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 == 0) goto L_0x003a
            r10 = 9
            goto L_0x010d
        L_0x00f8:
            java.lang.String r4 = "android.media.mediacodec.latency.avg"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 == 0) goto L_0x003a
            r10 = 11
            goto L_0x010d
        L_0x0103:
            java.lang.String r4 = "android.media.mediacodec.latency.unknown"
            boolean r2 = r2.equals(r4)     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 == 0) goto L_0x003a
            r10 = 13
        L_0x010d:
            switch(r10) {
                case 0: goto L_0x0337;
                case 1: goto L_0x031d;
                case 2: goto L_0x02df;
                case 3: goto L_0x02c0;
                case 4: goto L_0x02a5;
                case 5: goto L_0x0289;
                case 6: goto L_0x026d;
                case 7: goto L_0x024d;
                case 8: goto L_0x0232;
                case 9: goto L_0x0216;
                case 10: goto L_0x01fa;
                case 11: goto L_0x01de;
                case 12: goto L_0x01c2;
                case 13: goto L_0x01a6;
                case 14: goto L_0x018a;
                case 15: goto L_0x016c;
                case 16: goto L_0x014f;
                case 17: goto L_0x0132;
                case 18: goto L_0x0115;
                default: goto L_0x0110;
            }     // Catch:{ NumberFormatException -> 0x0351 }
        L_0x0110:
            r12.f(r1)     // Catch:{ NumberFormatException -> 0x0351 }
            goto L_0x0010
        L_0x0115:
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0351 }
            boolean r2 = r0.c     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 != 0) goto L_0x011e
            goto L_0x0123
        L_0x011e:
            r0.c()     // Catch:{ NumberFormatException -> 0x0351 }
            r0.c = r11     // Catch:{ NumberFormatException -> 0x0351 }
        L_0x0123:
            aucj r2 = r0.b     // Catch:{ NumberFormatException -> 0x0351 }
            augv r2 = (defpackage.augv) r2     // Catch:{ NumberFormatException -> 0x0351 }
            int r3 = r2.a     // Catch:{ NumberFormatException -> 0x0351 }
            r4 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 | r4
            r2.a = r3     // Catch:{ NumberFormatException -> 0x0351 }
            r2.t = r1     // Catch:{ NumberFormatException -> 0x0351 }
            goto L_0x0010
        L_0x0132:
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0351 }
            boolean r2 = r0.c     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 != 0) goto L_0x013b
            goto L_0x0140
        L_0x013b:
            r0.c()     // Catch:{ NumberFormatException -> 0x0351 }
            r0.c = r11     // Catch:{ NumberFormatException -> 0x0351 }
        L_0x0140:
            aucj r2 = r0.b     // Catch:{ NumberFormatException -> 0x0351 }
            augv r2 = (defpackage.augv) r2     // Catch:{ NumberFormatException -> 0x0351 }
            int r3 = r2.a     // Catch:{ NumberFormatException -> 0x0351 }
            r4 = 131072(0x20000, float:1.83671E-40)
            r3 = r3 | r4
            r2.a = r3     // Catch:{ NumberFormatException -> 0x0351 }
            r2.s = r1     // Catch:{ NumberFormatException -> 0x0351 }
            goto L_0x0010
        L_0x014f:
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0351 }
            boolean r2 = r0.c     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 != 0) goto L_0x0158
            goto L_0x015d
        L_0x0158:
            r0.c()     // Catch:{ NumberFormatException -> 0x0351 }
            r0.c = r11     // Catch:{ NumberFormatException -> 0x0351 }
        L_0x015d:
            aucj r2 = r0.b     // Catch:{ NumberFormatException -> 0x0351 }
            augv r2 = (defpackage.augv) r2     // Catch:{ NumberFormatException -> 0x0351 }
            int r3 = r2.a     // Catch:{ NumberFormatException -> 0x0351 }
            r4 = 65536(0x10000, float:9.18355E-41)
            r3 = r3 | r4
            r2.a = r3     // Catch:{ NumberFormatException -> 0x0351 }
            r2.r = r1     // Catch:{ NumberFormatException -> 0x0351 }
            goto L_0x0010
        L_0x016c:
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0351 }
            boolean r2 = r0.c     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 != 0) goto L_0x0175
            goto L_0x017a
        L_0x0175:
            r0.c()     // Catch:{ NumberFormatException -> 0x0351 }
            r0.c = r11     // Catch:{ NumberFormatException -> 0x0351 }
        L_0x017a:
            aucj r2 = r0.b     // Catch:{ NumberFormatException -> 0x0351 }
            augv r2 = (defpackage.augv) r2     // Catch:{ NumberFormatException -> 0x0351 }
            int r3 = r2.a     // Catch:{ NumberFormatException -> 0x0351 }
            r4 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 | r4
            r2.a = r3     // Catch:{ NumberFormatException -> 0x0351 }
            r2.q = r1     // Catch:{ NumberFormatException -> 0x0351 }
            goto L_0x0010
        L_0x018a:
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0351 }
            boolean r2 = r0.c     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 != 0) goto L_0x0193
            goto L_0x0198
        L_0x0193:
            r0.c()     // Catch:{ NumberFormatException -> 0x0351 }
            r0.c = r11     // Catch:{ NumberFormatException -> 0x0351 }
        L_0x0198:
            aucj r2 = r0.b     // Catch:{ NumberFormatException -> 0x0351 }
            augv r2 = (defpackage.augv) r2     // Catch:{ NumberFormatException -> 0x0351 }
            int r3 = r2.a     // Catch:{ NumberFormatException -> 0x0351 }
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
            r2.a = r3     // Catch:{ NumberFormatException -> 0x0351 }
            r2.p = r1     // Catch:{ NumberFormatException -> 0x0351 }
            goto L_0x0010
        L_0x01a6:
            long r1 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x0351 }
            boolean r3 = r0.c     // Catch:{ NumberFormatException -> 0x0351 }
            if (r3 != 0) goto L_0x01af
            goto L_0x01b4
        L_0x01af:
            r0.c()     // Catch:{ NumberFormatException -> 0x0351 }
            r0.c = r11     // Catch:{ NumberFormatException -> 0x0351 }
        L_0x01b4:
            aucj r3 = r0.b     // Catch:{ NumberFormatException -> 0x0351 }
            augv r3 = (defpackage.augv) r3     // Catch:{ NumberFormatException -> 0x0351 }
            int r4 = r3.a     // Catch:{ NumberFormatException -> 0x0351 }
            r4 = r4 | 8192(0x2000, float:1.14794E-41)
            r3.a = r4     // Catch:{ NumberFormatException -> 0x0351 }
            r3.o = r1     // Catch:{ NumberFormatException -> 0x0351 }
            goto L_0x0010
        L_0x01c2:
            long r1 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x0351 }
            boolean r3 = r0.c     // Catch:{ NumberFormatException -> 0x0351 }
            if (r3 != 0) goto L_0x01cb
            goto L_0x01d0
        L_0x01cb:
            r0.c()     // Catch:{ NumberFormatException -> 0x0351 }
            r0.c = r11     // Catch:{ NumberFormatException -> 0x0351 }
        L_0x01d0:
            aucj r3 = r0.b     // Catch:{ NumberFormatException -> 0x0351 }
            augv r3 = (defpackage.augv) r3     // Catch:{ NumberFormatException -> 0x0351 }
            int r4 = r3.a     // Catch:{ NumberFormatException -> 0x0351 }
            r4 = r4 | 4096(0x1000, float:5.74E-42)
            r3.a = r4     // Catch:{ NumberFormatException -> 0x0351 }
            r3.n = r1     // Catch:{ NumberFormatException -> 0x0351 }
            goto L_0x0010
        L_0x01de:
            long r1 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x0351 }
            boolean r3 = r0.c     // Catch:{ NumberFormatException -> 0x0351 }
            if (r3 != 0) goto L_0x01e7
            goto L_0x01ec
        L_0x01e7:
            r0.c()     // Catch:{ NumberFormatException -> 0x0351 }
            r0.c = r11     // Catch:{ NumberFormatException -> 0x0351 }
        L_0x01ec:
            aucj r3 = r0.b     // Catch:{ NumberFormatException -> 0x0351 }
            augv r3 = (defpackage.augv) r3     // Catch:{ NumberFormatException -> 0x0351 }
            int r4 = r3.a     // Catch:{ NumberFormatException -> 0x0351 }
            r4 = r4 | 2048(0x800, float:2.87E-42)
            r3.a = r4     // Catch:{ NumberFormatException -> 0x0351 }
            r3.m = r1     // Catch:{ NumberFormatException -> 0x0351 }
            goto L_0x0010
        L_0x01fa:
            long r1 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x0351 }
            boolean r3 = r0.c     // Catch:{ NumberFormatException -> 0x0351 }
            if (r3 != 0) goto L_0x0203
            goto L_0x0208
        L_0x0203:
            r0.c()     // Catch:{ NumberFormatException -> 0x0351 }
            r0.c = r11     // Catch:{ NumberFormatException -> 0x0351 }
        L_0x0208:
            aucj r3 = r0.b     // Catch:{ NumberFormatException -> 0x0351 }
            augv r3 = (defpackage.augv) r3     // Catch:{ NumberFormatException -> 0x0351 }
            int r4 = r3.a     // Catch:{ NumberFormatException -> 0x0351 }
            r4 = r4 | 1024(0x400, float:1.435E-42)
            r3.a = r4     // Catch:{ NumberFormatException -> 0x0351 }
            r3.l = r1     // Catch:{ NumberFormatException -> 0x0351 }
            goto L_0x0010
        L_0x0216:
            long r1 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x0351 }
            boolean r3 = r0.c     // Catch:{ NumberFormatException -> 0x0351 }
            if (r3 != 0) goto L_0x021f
            goto L_0x0224
        L_0x021f:
            r0.c()     // Catch:{ NumberFormatException -> 0x0351 }
            r0.c = r11     // Catch:{ NumberFormatException -> 0x0351 }
        L_0x0224:
            aucj r3 = r0.b     // Catch:{ NumberFormatException -> 0x0351 }
            augv r3 = (defpackage.augv) r3     // Catch:{ NumberFormatException -> 0x0351 }
            int r4 = r3.a     // Catch:{ NumberFormatException -> 0x0351 }
            r4 = r4 | 512(0x200, float:7.175E-43)
            r3.a = r4     // Catch:{ NumberFormatException -> 0x0351 }
            r3.k = r1     // Catch:{ NumberFormatException -> 0x0351 }
            goto L_0x0010
        L_0x0232:
            boolean r1 = r0.c     // Catch:{ NumberFormatException -> 0x0351 }
            if (r1 != 0) goto L_0x0237
            goto L_0x023c
        L_0x0237:
            r0.c()     // Catch:{ NumberFormatException -> 0x0351 }
            r0.c = r11     // Catch:{ NumberFormatException -> 0x0351 }
        L_0x023c:
            aucj r1 = r0.b     // Catch:{ NumberFormatException -> 0x0351 }
            augv r1 = (defpackage.augv) r1     // Catch:{ NumberFormatException -> 0x0351 }
            r3.getClass()     // Catch:{ NumberFormatException -> 0x0351 }
            int r2 = r1.a     // Catch:{ NumberFormatException -> 0x0351 }
            r2 = r2 | 256(0x100, float:3.59E-43)
            r1.a = r2     // Catch:{ NumberFormatException -> 0x0351 }
            r1.j = r3     // Catch:{ NumberFormatException -> 0x0351 }
            goto L_0x0010
        L_0x024d:
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0351 }
            if (r1 == 0) goto L_0x0254
            goto L_0x0255
        L_0x0254:
            r9 = 0
        L_0x0255:
            boolean r1 = r0.c     // Catch:{ NumberFormatException -> 0x0351 }
            if (r1 != 0) goto L_0x025a
            goto L_0x025f
        L_0x025a:
            r0.c()     // Catch:{ NumberFormatException -> 0x0351 }
            r0.c = r11     // Catch:{ NumberFormatException -> 0x0351 }
        L_0x025f:
            aucj r1 = r0.b     // Catch:{ NumberFormatException -> 0x0351 }
            augv r1 = (defpackage.augv) r1     // Catch:{ NumberFormatException -> 0x0351 }
            int r2 = r1.a     // Catch:{ NumberFormatException -> 0x0351 }
            r2 = r2 | 128(0x80, float:1.794E-43)
            r1.a = r2     // Catch:{ NumberFormatException -> 0x0351 }
            r1.i = r9     // Catch:{ NumberFormatException -> 0x0351 }
            goto L_0x0010
        L_0x026d:
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0351 }
            boolean r2 = r0.c     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 != 0) goto L_0x0276
            goto L_0x027b
        L_0x0276:
            r0.c()     // Catch:{ NumberFormatException -> 0x0351 }
            r0.c = r11     // Catch:{ NumberFormatException -> 0x0351 }
        L_0x027b:
            aucj r2 = r0.b     // Catch:{ NumberFormatException -> 0x0351 }
            augv r2 = (defpackage.augv) r2     // Catch:{ NumberFormatException -> 0x0351 }
            int r3 = r2.a     // Catch:{ NumberFormatException -> 0x0351 }
            r3 = r3 | 64
            r2.a = r3     // Catch:{ NumberFormatException -> 0x0351 }
            r2.h = r1     // Catch:{ NumberFormatException -> 0x0351 }
            goto L_0x0010
        L_0x0289:
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0351 }
            boolean r2 = r0.c     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 != 0) goto L_0x0292
            goto L_0x0297
        L_0x0292:
            r0.c()     // Catch:{ NumberFormatException -> 0x0351 }
            r0.c = r11     // Catch:{ NumberFormatException -> 0x0351 }
        L_0x0297:
            aucj r2 = r0.b     // Catch:{ NumberFormatException -> 0x0351 }
            augv r2 = (defpackage.augv) r2     // Catch:{ NumberFormatException -> 0x0351 }
            int r3 = r2.a     // Catch:{ NumberFormatException -> 0x0351 }
            r3 = r3 | 32
            r2.a = r3     // Catch:{ NumberFormatException -> 0x0351 }
            r2.g = r1     // Catch:{ NumberFormatException -> 0x0351 }
            goto L_0x0010
        L_0x02a5:
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0351 }
            boolean r2 = r0.c     // Catch:{ NumberFormatException -> 0x0351 }
            if (r2 != 0) goto L_0x02ae
            goto L_0x02b3
        L_0x02ae:
            r0.c()     // Catch:{ NumberFormatException -> 0x0351 }
            r0.c = r11     // Catch:{ NumberFormatException -> 0x0351 }
        L_0x02b3:
            aucj r2 = r0.b     // Catch:{ NumberFormatException -> 0x0351 }
            augv r2 = (defpackage.augv) r2     // Catch:{ NumberFormatException -> 0x0351 }
            int r3 = r2.a     // Catch:{ NumberFormatException -> 0x0351 }
            r3 = r3 | r6
            r2.a = r3     // Catch:{ NumberFormatException -> 0x0351 }
            r2.f = r1     // Catch:{ NumberFormatException -> 0x0351 }
            goto L_0x0010
        L_0x02c0:
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0351 }
            if (r1 == 0) goto L_0x02c7
            goto L_0x02c8
        L_0x02c7:
            r9 = 0
        L_0x02c8:
            boolean r1 = r0.c     // Catch:{ NumberFormatException -> 0x0351 }
            if (r1 != 0) goto L_0x02cd
            goto L_0x02d2
        L_0x02cd:
            r0.c()     // Catch:{ NumberFormatException -> 0x0351 }
            r0.c = r11     // Catch:{ NumberFormatException -> 0x0351 }
        L_0x02d2:
            aucj r1 = r0.b     // Catch:{ NumberFormatException -> 0x0351 }
            augv r1 = (defpackage.augv) r1     // Catch:{ NumberFormatException -> 0x0351 }
            int r2 = r1.a     // Catch:{ NumberFormatException -> 0x0351 }
            r2 = r2 | r5
            r1.a = r2     // Catch:{ NumberFormatException -> 0x0351 }
            r1.e = r9     // Catch:{ NumberFormatException -> 0x0351 }
            goto L_0x0010
        L_0x02df:
            java.lang.String r1 = "audio"
            boolean r1 = r1.equals(r3)     // Catch:{ NumberFormatException -> 0x0351 }
            if (r1 != 0) goto L_0x0306
            java.lang.String r1 = "video"
            boolean r1 = r1.equals(r3)     // Catch:{ NumberFormatException -> 0x0351 }
            if (r1 == 0) goto L_0x0010
            boolean r1 = r0.c     // Catch:{ NumberFormatException -> 0x0351 }
            if (r1 != 0) goto L_0x02f4
            goto L_0x02f9
        L_0x02f4:
            r0.c()     // Catch:{ NumberFormatException -> 0x0351 }
            r0.c = r11     // Catch:{ NumberFormatException -> 0x0351 }
        L_0x02f9:
            aucj r1 = r0.b     // Catch:{ NumberFormatException -> 0x0351 }
            augv r1 = (defpackage.augv) r1     // Catch:{ NumberFormatException -> 0x0351 }
            r1.d = r8     // Catch:{ NumberFormatException -> 0x0351 }
            int r2 = r1.a     // Catch:{ NumberFormatException -> 0x0351 }
            r2 = r2 | r7
            r1.a = r2     // Catch:{ NumberFormatException -> 0x0351 }
            goto L_0x0010
        L_0x0306:
            boolean r1 = r0.c     // Catch:{ NumberFormatException -> 0x0351 }
            if (r1 != 0) goto L_0x030b
            goto L_0x0310
        L_0x030b:
            r0.c()     // Catch:{ NumberFormatException -> 0x0351 }
            r0.c = r11     // Catch:{ NumberFormatException -> 0x0351 }
        L_0x0310:
            aucj r1 = r0.b     // Catch:{ NumberFormatException -> 0x0351 }
            augv r1 = (defpackage.augv) r1     // Catch:{ NumberFormatException -> 0x0351 }
            r1.d = r9     // Catch:{ NumberFormatException -> 0x0351 }
            int r2 = r1.a     // Catch:{ NumberFormatException -> 0x0351 }
            r2 = r2 | r7
            r1.a = r2     // Catch:{ NumberFormatException -> 0x0351 }
            goto L_0x0010
        L_0x031d:
            boolean r1 = r0.c     // Catch:{ NumberFormatException -> 0x0351 }
            if (r1 != 0) goto L_0x0322
            goto L_0x0327
        L_0x0322:
            r0.c()     // Catch:{ NumberFormatException -> 0x0351 }
            r0.c = r11     // Catch:{ NumberFormatException -> 0x0351 }
        L_0x0327:
            aucj r1 = r0.b     // Catch:{ NumberFormatException -> 0x0351 }
            augv r1 = (defpackage.augv) r1     // Catch:{ NumberFormatException -> 0x0351 }
            r3.getClass()     // Catch:{ NumberFormatException -> 0x0351 }
            int r2 = r1.a     // Catch:{ NumberFormatException -> 0x0351 }
            r2 = r2 | r8
            r1.a = r2     // Catch:{ NumberFormatException -> 0x0351 }
            r1.c = r3     // Catch:{ NumberFormatException -> 0x0351 }
            goto L_0x0010
        L_0x0337:
            boolean r1 = r0.c     // Catch:{ NumberFormatException -> 0x0351 }
            if (r1 != 0) goto L_0x033c
            goto L_0x0341
        L_0x033c:
            r0.c()     // Catch:{ NumberFormatException -> 0x0351 }
            r0.c = r11     // Catch:{ NumberFormatException -> 0x0351 }
        L_0x0341:
            aucj r1 = r0.b     // Catch:{ NumberFormatException -> 0x0351 }
            augv r1 = (defpackage.augv) r1     // Catch:{ NumberFormatException -> 0x0351 }
            r3.getClass()     // Catch:{ NumberFormatException -> 0x0351 }
            int r2 = r1.a     // Catch:{ NumberFormatException -> 0x0351 }
            r2 = r2 | r9
            r1.a = r2     // Catch:{ NumberFormatException -> 0x0351 }
            r1.b = r3     // Catch:{ NumberFormatException -> 0x0351 }
            goto L_0x0010
        L_0x0351:
            r1 = move-exception
            goto L_0x0010
        L_0x0354:
            aucj r13 = r0.i()
            augv r13 = (defpackage.augv) r13
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.actm.a(java.lang.String):augv");
    }

    /* access modifiers changed from: protected */
    public final String[] a(long j2, long j3) {
        if (!jkr.f() || jkr.g()) {
            return new String[]{"-since", String.valueOf(j2)};
        }
        return new String[]{"-proto", "1", "-since", String.valueOf(j2)};
    }
}
