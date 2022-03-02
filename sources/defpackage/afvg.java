package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.R;
import java.util.concurrent.Executor;

/* renamed from: afvg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afvg implements afvk {
    public final Account a;
    public final aflk b;
    private final Context c;

    public afvg(Account account, Context context, aflk aflk) {
        this.a = account;
        this.c = context;
        amsk amsk = atxz.a;
        this.b = aflk;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01fc, code lost:
        if (((java.lang.String) r13.get(0)).isEmpty() != false) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01fe, code lost:
        defpackage.amrl.a(true, (java.lang.Object) "options is null");
        defpackage.amrl.a(true, (java.lang.Object) "url is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0208, code lost:
        if (r14.a() == null) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x020a, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x020c, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x020d, code lost:
        defpackage.amrl.a(r13, (java.lang.Object) "url path is null");
        r13 = defpackage.anda.a(defpackage.atxz.a.a((java.lang.CharSequence) r14.a()));
        r0 = r2.a(r9);
        r1 = defpackage.anda.a(defpackage.atxz.a.a((java.lang.CharSequence) r14.a()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0234, code lost:
        if (r1.size() != 2) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0236, code lost:
        r9 = r1.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x023f, code lost:
        r0 = defpackage.atxz.a(r9, r0);
        r13 = (java.lang.String) r13.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x024d, code lost:
        if (r0.isEmpty() != false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x024f, code lost:
        r13 = defpackage.atxz.c.a(r13, r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0259, code lost:
        r13 = r14.a(r13).a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0263, code lost:
        return r13.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x026d, code lost:
        throw new defpackage.atxx(r14.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0273, code lost:
        throw new defpackage.atxx("url path is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0274, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x027a, code lost:
        throw new defpackage.aelj(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0068, code lost:
        if (r6.isInfinite() == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0076, code lost:
        if (((java.lang.Long) r14).longValue() >= 0) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007d, code lost:
        if (r14.intValue() >= 0) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0087, code lost:
        if (((java.lang.String) r14).isEmpty() == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0091, code lost:
        if (((java.lang.Boolean) r14).booleanValue() == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0093, code lost:
        r4.c.put(r5, new defpackage.atyf((java.lang.Object) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009e, code lost:
        r4.c.put(r5, new defpackage.atyf(r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a8, code lost:
        r14 = r2.a;
        r4 = defpackage.atyb.a;
        r5 = r14.b;
        r6 = r14.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b4, code lost:
        if (r6.containsKey(r4) == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b6, code lost:
        r5 = ((defpackage.atyf) r6.get(r4)).a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bf, code lost:
        r5.containsKey(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c2, code lost:
        r5 = r14.b;
        r14 = r14.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ca, code lost:
        if (r14.containsKey(r4) == false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d4, code lost:
        if (((defpackage.atyf) r14.get(r4)).a == null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d6, code lost:
        r14 = ((defpackage.atyf) r14.get(r4)).b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e3, code lost:
        if (r5.containsKey(r4) == false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e5, code lost:
        r14 = ((defpackage.atyc) r5.get(r4)).c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r14 = new defpackage.aeli(r13);
        defpackage.amrl.a(true, (java.lang.Object) "options is null");
        defpackage.amrl.a(true, (java.lang.Object) "url is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fe, code lost:
        if (r14.a() == null) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r13 = defpackage.atxz.a(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010b, code lost:
        if (r13.isEmpty() != false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0117, code lost:
        if ("u".equals(r13.get(0)) == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0119, code lost:
        r13.remove(1);
        r13.remove(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0124, code lost:
        if (r13.isEmpty() != false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x012e, code lost:
        if ("image".equals(r13.get(0)) == false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0130, code lost:
        r13.remove(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0138, code lost:
        if (r13.size() != 2) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013a, code lost:
        r13.remove(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013d, code lost:
        r5 = r13.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0141, code lost:
        r9 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0144, code lost:
        if (r5 >= 4) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0148, code lost:
        if (r5 != 4) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0155, code lost:
        if (((java.lang.String) r13.get(3)).isEmpty() != false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0159, code lost:
        if (r5 > 6) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015b, code lost:
        defpackage.amrl.a(true, (java.lang.Object) "options is null");
        defpackage.amrl.a(true, (java.lang.Object) "url is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0166, code lost:
        if (r14.a() == null) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0168, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x016a, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016b, code lost:
        defpackage.amrl.a(r13, (java.lang.Object) "url path is null");
        r13 = defpackage.atxz.a(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0176, code lost:
        if (r13.size() <= 0) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0182, code lost:
        if (((java.lang.String) r13.get(0)).equals("image") == false) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0184, code lost:
        r13.remove(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0188, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0189, code lost:
        r0 = r2.a(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0193, code lost:
        if (r13.size() != 4) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0195, code lost:
        r13.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x019d, code lost:
        if (r13.size() != 5) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x019f, code lost:
        r13.add(4, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a2, code lost:
        r0 = defpackage.atxz.a((java.lang.String) r13.get(4), r0);
        r13.set(4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b4, code lost:
        if (r0.equals(r9) == false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ba, code lost:
        if (r13.size() <= 5) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01bc, code lost:
        r13.remove(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01bf, code lost:
        if (r3 != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c2, code lost:
        r13.add(0, "image");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01c6, code lost:
        r13 = java.lang.String.valueOf(defpackage.atxz.b.a((java.lang.Iterable) r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d6, code lost:
        if (r13.length() != 0) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01d8, code lost:
        r13 = new java.lang.String("/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01de, code lost:
        r13 = "/".concat(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e2, code lost:
        r13 = r14.a(r13).a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01ea, code lost:
        r5 = r13.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01ee, code lost:
        if (r5 <= 0) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01f0, code lost:
        if (r5 > 1) goto L_0x0264;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String a(android.net.Uri r13, int r14) {
        /*
            r12 = this;
            java.lang.String r0 = "url is null"
            java.lang.String r1 = "options is null"
            aeli r2 = new aeli
            r2.<init>(r13)
            r3 = 1
            defpackage.amrl.a((boolean) r3)
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L_0x02a4
            java.util.regex.Pattern r4 = defpackage.atyg.a
            java.util.regex.Matcher r2 = r4.matcher(r2)
            boolean r2 = r2.find()
            if (r2 == 0) goto L_0x027d
            int r14 = r12.a((int) r14)
            atyd r2 = new atyd
            r2.<init>()
            atye r4 = r2.a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            atyb r5 = defpackage.atyb.SIZE
            int r6 = r5.aQ
            int r7 = r6 + -1
            r8 = 0
            if (r6 == 0) goto L_0x027b
            switch(r7) {
                case 0: goto L_0x009e;
                case 1: goto L_0x008a;
                case 2: goto L_0x0080;
                case 3: goto L_0x0079;
                case 4: goto L_0x006b;
                case 5: goto L_0x005b;
                case 6: goto L_0x009e;
                default: goto L_0x003a;
            }
        L_0x003a:
            java.lang.String r13 = defpackage.atya.a(r6)
            java.lang.RuntimeException r14 = new java.lang.RuntimeException
            int r0 = r13.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 24
            r1.<init>(r0)
            java.lang.String r0 = "Unexpected option type: "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r14.<init>(r13)
            throw r14
        L_0x005b:
            r6 = r14
            java.lang.Float r6 = (java.lang.Float) r6
            boolean r7 = r6.isNaN()
            if (r7 != 0) goto L_0x0093
            boolean r6 = r6.isInfinite()
            if (r6 == 0) goto L_0x009e
            goto L_0x0093
        L_0x006b:
            r6 = r14
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            r9 = 0
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0093
            goto L_0x009e
        L_0x0079:
            int r6 = r14.intValue()
            if (r6 < 0) goto L_0x0093
            goto L_0x009e
        L_0x0080:
            r6 = r14
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0093
            goto L_0x009e
        L_0x008a:
            r6 = r14
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x009e
        L_0x0093:
            atyf r14 = new atyf
            r14.<init>(r8)
            java.util.Map r4 = r4.c
            r4.put(r5, r14)
            goto L_0x00a8
        L_0x009e:
            atyf r6 = new atyf
            r6.<init>(r14)
            java.util.Map r14 = r4.c
            r14.put(r5, r6)
        L_0x00a8:
            atye r14 = r2.a
            atyb r4 = defpackage.atyb.SIZE
            java.util.Map r5 = r14.b
            java.util.Map r6 = r14.c
            boolean r7 = r6.containsKey(r4)
            if (r7 == 0) goto L_0x00bf
            java.lang.Object r5 = r6.get(r4)
            atyf r5 = (defpackage.atyf) r5
            java.lang.Object r5 = r5.a
            goto L_0x00c2
        L_0x00bf:
            r5.containsKey(r4)
        L_0x00c2:
            java.util.Map r5 = r14.b
            java.util.Map r14 = r14.c
            boolean r6 = r14.containsKey(r4)
            if (r6 == 0) goto L_0x00df
            java.lang.Object r5 = r14.get(r4)
            atyf r5 = (defpackage.atyf) r5
            java.lang.Object r5 = r5.a
            if (r5 == 0) goto L_0x00ed
            java.lang.Object r14 = r14.get(r4)
            atyf r14 = (defpackage.atyf) r14
            boolean r14 = r14.b
            goto L_0x00ed
        L_0x00df:
            boolean r14 = r5.containsKey(r4)
            if (r14 == 0) goto L_0x00ed
            java.lang.Object r14 = r5.get(r4)
            atyc r14 = (defpackage.atyc) r14
            boolean r14 = r14.c
        L_0x00ed:
            aeli r14 = new aeli     // Catch:{ atxx -> 0x0274 }
            r14.<init>(r13)     // Catch:{ atxx -> 0x0274 }
            defpackage.amrl.a((boolean) r3, (java.lang.Object) r1)     // Catch:{ atxx -> 0x0274 }
            defpackage.amrl.a((boolean) r3, (java.lang.Object) r0)     // Catch:{ atxx -> 0x0274 }
            java.lang.String r13 = r14.a()     // Catch:{ atxx -> 0x0274 }
            java.lang.String r4 = "url path is null"
            if (r13 == 0) goto L_0x026e
            java.util.List r13 = defpackage.atxz.a((defpackage.aeli) r14)     // Catch:{ atxx -> 0x0274 }
            boolean r5 = r13.isEmpty()     // Catch:{ atxx -> 0x0274 }
            java.lang.String r6 = "image"
            r7 = 0
            if (r5 != 0) goto L_0x0120
            java.lang.String r5 = "u"
            java.lang.Object r8 = r13.get(r7)     // Catch:{ atxx -> 0x0274 }
            boolean r5 = r5.equals(r8)     // Catch:{ atxx -> 0x0274 }
            if (r5 == 0) goto L_0x0120
            r13.remove(r3)     // Catch:{ atxx -> 0x0274 }
            r13.remove(r7)     // Catch:{ atxx -> 0x0274 }
            goto L_0x0133
        L_0x0120:
            boolean r5 = r13.isEmpty()     // Catch:{ atxx -> 0x0274 }
            if (r5 != 0) goto L_0x0133
            java.lang.Object r5 = r13.get(r7)     // Catch:{ atxx -> 0x0274 }
            boolean r5 = r6.equals(r5)     // Catch:{ atxx -> 0x0274 }
            if (r5 == 0) goto L_0x0133
            r13.remove(r7)     // Catch:{ atxx -> 0x0274 }
        L_0x0133:
            int r5 = r13.size()     // Catch:{ atxx -> 0x0274 }
            r8 = 2
            if (r5 != r8) goto L_0x013d
            r13.remove(r7)     // Catch:{ atxx -> 0x0274 }
        L_0x013d:
            int r5 = r13.size()     // Catch:{ atxx -> 0x0274 }
            java.lang.String r9 = ""
            r10 = 4
            if (r5 >= r10) goto L_0x0148
            goto L_0x01ea
        L_0x0148:
            if (r5 != r10) goto L_0x0158
            r5 = 3
            java.lang.Object r5 = r13.get(r5)     // Catch:{ atxx -> 0x0274 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ atxx -> 0x0274 }
            boolean r5 = r5.isEmpty()     // Catch:{ atxx -> 0x0274 }
            if (r5 != 0) goto L_0x01ea
            goto L_0x015b
        L_0x0158:
            r11 = 6
            if (r5 > r11) goto L_0x01ea
        L_0x015b:
            defpackage.amrl.a((boolean) r3, (java.lang.Object) r1)     // Catch:{ atxx -> 0x0274 }
            defpackage.amrl.a((boolean) r3, (java.lang.Object) r0)     // Catch:{ atxx -> 0x0274 }
            java.lang.String r13 = r14.a()     // Catch:{ atxx -> 0x0274 }
            if (r13 == 0) goto L_0x016a
            r13 = 1
            goto L_0x016b
        L_0x016a:
            r13 = 0
        L_0x016b:
            defpackage.amrl.a((boolean) r13, (java.lang.Object) r4)     // Catch:{ atxx -> 0x0274 }
            java.util.List r13 = defpackage.atxz.a((defpackage.aeli) r14)     // Catch:{ atxx -> 0x0274 }
            int r0 = r13.size()     // Catch:{ atxx -> 0x0274 }
            if (r0 <= 0) goto L_0x0188
            java.lang.Object r0 = r13.get(r7)     // Catch:{ atxx -> 0x0274 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ atxx -> 0x0274 }
            boolean r0 = r0.equals(r6)     // Catch:{ atxx -> 0x0274 }
            if (r0 == 0) goto L_0x0188
            r13.remove(r7)     // Catch:{ atxx -> 0x0274 }
            goto L_0x0189
        L_0x0188:
            r3 = 0
        L_0x0189:
            java.lang.String r0 = r2.a(r9)     // Catch:{ atxx -> 0x0274 }
            int r1 = r13.size()     // Catch:{ atxx -> 0x0274 }
            r2 = 5
            if (r1 != r10) goto L_0x0199
            r13.add(r9)     // Catch:{ atxx -> 0x0274 }
            goto L_0x01a2
        L_0x0199:
            int r1 = r13.size()     // Catch:{ atxx -> 0x0274 }
            if (r1 != r2) goto L_0x01a2
            r13.add(r10, r9)     // Catch:{ atxx -> 0x0274 }
        L_0x01a2:
            java.lang.Object r1 = r13.get(r10)     // Catch:{ atxx -> 0x0274 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ atxx -> 0x0274 }
            java.lang.String r0 = defpackage.atxz.a(r1, r0)     // Catch:{ atxx -> 0x0274 }
            r13.set(r10, r0)     // Catch:{ atxx -> 0x0274 }
            boolean r0 = r0.equals(r9)     // Catch:{ atxx -> 0x0274 }
            if (r0 == 0) goto L_0x01bf
            int r0 = r13.size()     // Catch:{ atxx -> 0x0274 }
            if (r0 <= r2) goto L_0x01bf
            r13.remove(r10)     // Catch:{ atxx -> 0x0274 }
        L_0x01bf:
            if (r3 != 0) goto L_0x01c2
            goto L_0x01c6
        L_0x01c2:
            r13.add(r7, r6)     // Catch:{ atxx -> 0x0274 }
        L_0x01c6:
            java.lang.String r0 = "/"
            amre r1 = defpackage.atxz.b     // Catch:{ atxx -> 0x0274 }
            java.lang.String r13 = r1.a((java.lang.Iterable) r13)     // Catch:{ atxx -> 0x0274 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ atxx -> 0x0274 }
            int r1 = r13.length()     // Catch:{ atxx -> 0x0274 }
            if (r1 != 0) goto L_0x01de
            java.lang.String r13 = new java.lang.String     // Catch:{ atxx -> 0x0274 }
            r13.<init>(r0)     // Catch:{ atxx -> 0x0274 }
            goto L_0x01e2
        L_0x01de:
            java.lang.String r13 = r0.concat(r13)     // Catch:{ atxx -> 0x0274 }
        L_0x01e2:
            aeli r13 = r14.a(r13)     // Catch:{ atxx -> 0x0274 }
            android.net.Uri r13 = r13.a     // Catch:{ atxx -> 0x0274 }
            goto L_0x025f
        L_0x01ea:
            int r5 = r13.size()     // Catch:{ atxx -> 0x0274 }
            if (r5 <= 0) goto L_0x0264
            if (r5 > r3) goto L_0x0264
            java.lang.Object r13 = r13.get(r7)     // Catch:{ atxx -> 0x0274 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ atxx -> 0x0274 }
            boolean r13 = r13.isEmpty()     // Catch:{ atxx -> 0x0274 }
            if (r13 != 0) goto L_0x0264
            defpackage.amrl.a((boolean) r3, (java.lang.Object) r1)     // Catch:{ atxx -> 0x0274 }
            defpackage.amrl.a((boolean) r3, (java.lang.Object) r0)     // Catch:{ atxx -> 0x0274 }
            java.lang.String r13 = r14.a()     // Catch:{ atxx -> 0x0274 }
            if (r13 == 0) goto L_0x020c
            r13 = 1
            goto L_0x020d
        L_0x020c:
            r13 = 0
        L_0x020d:
            defpackage.amrl.a((boolean) r13, (java.lang.Object) r4)     // Catch:{ atxx -> 0x0274 }
            amsk r13 = defpackage.atxz.a     // Catch:{ atxx -> 0x0274 }
            java.lang.String r0 = r14.a()     // Catch:{ atxx -> 0x0274 }
            java.lang.Iterable r13 = r13.a((java.lang.CharSequence) r0)     // Catch:{ atxx -> 0x0274 }
            java.util.ArrayList r13 = defpackage.anda.a((java.lang.Iterable) r13)     // Catch:{ atxx -> 0x0274 }
            java.lang.String r0 = r2.a(r9)     // Catch:{ atxx -> 0x0274 }
            amsk r1 = defpackage.atxz.a     // Catch:{ atxx -> 0x0274 }
            java.lang.String r2 = r14.a()     // Catch:{ atxx -> 0x0274 }
            java.lang.Iterable r1 = r1.a((java.lang.CharSequence) r2)     // Catch:{ atxx -> 0x0274 }
            java.util.ArrayList r1 = defpackage.anda.a((java.lang.Iterable) r1)     // Catch:{ atxx -> 0x0274 }
            int r2 = r1.size()     // Catch:{ atxx -> 0x0274 }
            if (r2 != r8) goto L_0x023e
            java.lang.Object r1 = r1.get(r3)     // Catch:{ atxx -> 0x0274 }
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ atxx -> 0x0274 }
            goto L_0x023f
        L_0x023e:
        L_0x023f:
            java.lang.String r0 = defpackage.atxz.a(r9, r0)     // Catch:{ atxx -> 0x0274 }
            java.lang.Object r13 = r13.get(r7)     // Catch:{ atxx -> 0x0274 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ atxx -> 0x0274 }
            boolean r1 = r0.isEmpty()     // Catch:{ atxx -> 0x0274 }
            if (r1 != 0) goto L_0x0258
            amre r1 = defpackage.atxz.c     // Catch:{ atxx -> 0x0274 }
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch:{ atxx -> 0x0274 }
            java.lang.String r13 = r1.a(r13, r0, r2)     // Catch:{ atxx -> 0x0274 }
            goto L_0x0259
        L_0x0258:
        L_0x0259:
            aeli r13 = r14.a(r13)     // Catch:{ atxx -> 0x0274 }
            android.net.Uri r13 = r13.a     // Catch:{ atxx -> 0x0274 }
        L_0x025f:
            java.lang.String r13 = r13.toString()
            return r13
        L_0x0264:
            atxx r13 = new atxx     // Catch:{ atxx -> 0x0274 }
            java.lang.String r14 = r14.toString()     // Catch:{ atxx -> 0x0274 }
            r13.<init>(r14)     // Catch:{ atxx -> 0x0274 }
            throw r13     // Catch:{ atxx -> 0x0274 }
        L_0x026e:
            atxx r13 = new atxx     // Catch:{ atxx -> 0x0274 }
            r13.<init>(r4)     // Catch:{ atxx -> 0x0274 }
            throw r13     // Catch:{ atxx -> 0x0274 }
        L_0x0274:
            r13 = move-exception
            aelj r14 = new aelj
            r14.<init>(r13)
            throw r14
        L_0x027b:
            throw r8
        L_0x027d:
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r14 = r12.a((int) r14)
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 15
            r1.<init>(r0)
            r1.append(r13)
            java.lang.String r13 = "?sz="
            r1.append(r13)
            r1.append(r14)
            java.lang.String r13 = r1.toString()
            return r13
        L_0x02a4:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afvg.a(android.net.Uri, int):java.lang.String");
    }

    public static String a(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("photos_filegroup_") : "photos_filegroup_".concat(valueOf);
    }

    /* access modifiers changed from: package-private */
    public final int a(int i) {
        if (i == 0) {
            return this.c.getResources().getDimensionPixelSize(R.dimen.tiny_photo_size);
        }
        if (i == 1) {
            return this.c.getResources().getDimensionPixelSize(R.dimen.small_photo_size);
        }
        if (i == 2) {
            return this.c.getResources().getDimensionPixelSize(R.dimen.medium_photo_size);
        }
        if (i != 3) {
            return this.c.getResources().getDimensionPixelSize(R.dimen.thumbnail_photo_size);
        }
        return this.c.getResources().getDimensionPixelSize(R.dimen.large_photo_size);
    }

    public final aorr a(String str, String str2) {
        String str3 = "";
        Uri parse = Uri.parse(str);
        try {
            aucd o = afjx.e.o();
            String a2 = a(str2);
            if (o.c) {
                o.c();
                o.c = false;
            }
            afjx afjx = (afjx) o.b;
            a2.getClass();
            afjx.a |= 1;
            afjx.b = a2;
            aucd o2 = afjw.f.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            afjw afjw = (afjw) o2.b;
            "tiny-photo-id".getClass();
            afjw.a |= 1;
            afjw.b = "tiny-photo-id";
            String a3 = a(parse, 0);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            afjw afjw2 = (afjw) o2.b;
            a3.getClass();
            afjw2.a |= 2;
            afjw2.c = a3;
            afjw.a(afjw2);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            afjw afjw3 = (afjw) o2.b;
            afjw3.d = 1;
            int i = afjw3.a | 8;
            afjw3.a = i;
            str3.getClass();
            afjw3.a = i | 16;
            afjw3.e = str3;
            o.h(o2);
            aucd o3 = afjw.f.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            afjw afjw4 = (afjw) o3.b;
            "small-photo-id".getClass();
            afjw4.a |= 1;
            afjw4.b = "small-photo-id";
            String a4 = a(parse, 1);
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            afjw afjw5 = (afjw) o3.b;
            a4.getClass();
            afjw5.a |= 2;
            afjw5.c = a4;
            afjw.a(afjw5);
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            afjw afjw6 = (afjw) o3.b;
            afjw6.d = 1;
            int i2 = afjw6.a | 8;
            afjw6.a = i2;
            str3.getClass();
            afjw6.a = i2 | 16;
            afjw6.e = str3;
            o.h(o3);
            aucd o4 = afjw.f.o();
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            afjw afjw7 = (afjw) o4.b;
            "medium-photo-id".getClass();
            afjw7.a |= 1;
            afjw7.b = "medium-photo-id";
            String a5 = a(parse, 2);
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            afjw afjw8 = (afjw) o4.b;
            a5.getClass();
            afjw8.a |= 2;
            afjw8.c = a5;
            afjw.a(afjw8);
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            afjw afjw9 = (afjw) o4.b;
            afjw9.d = 1;
            int i3 = afjw9.a | 8;
            afjw9.a = i3;
            str3.getClass();
            afjw9.a = i3 | 16;
            afjw9.e = str3;
            o.h(o4);
            aucd o5 = afjw.f.o();
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            afjw afjw10 = (afjw) o5.b;
            "large-photo-id".getClass();
            afjw10.a |= 1;
            afjw10.b = "large-photo-id";
            String a6 = a(parse, 3);
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            afjw afjw11 = (afjw) o5.b;
            a6.getClass();
            afjw11.a |= 2;
            afjw11.c = a6;
            afjw.a(afjw11);
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            afjw afjw12 = (afjw) o5.b;
            afjw12.d = 1;
            int i4 = afjw12.a | 8;
            afjw12.a = i4;
            str3.getClass();
            afjw12.a = i4 | 16;
            afjw12.e = str3;
            o.h(o5);
            aucd o6 = afjw.f.o();
            if (o6.c) {
                o6.c();
                o6.c = false;
            }
            afjw afjw13 = (afjw) o6.b;
            "thumbnail-photo-id".getClass();
            afjw13.a |= 1;
            afjw13.b = "thumbnail-photo-id";
            String a7 = a(parse, 4);
            if (o6.c) {
                o6.c();
                o6.c = false;
            }
            afjw afjw14 = (afjw) o6.b;
            a7.getClass();
            afjw14.a |= 2;
            afjw14.c = a7;
            afjw.a(afjw14);
            if (o6.c) {
                o6.c();
                o6.c = false;
            }
            afjw afjw15 = (afjw) o6.b;
            afjw15.d = 1;
            int i5 = afjw15.a | 8;
            afjw15.a = i5;
            str3.getClass();
            afjw15.a = i5 | 16;
            afjw15.e = str3;
            o.h(o6);
            afjx afjx2 = (afjx) o.i();
            aflk aflk = this.b;
            afjo afjo = new afjo((byte[]) null);
            afjo.b = amri.b(this.a);
            if (afjx2 != null) {
                afjo.a = afjx2;
                if (afjo.a == null) {
                    str3 = " dataFileGroup";
                }
                if (str3.isEmpty()) {
                    return aopr.a(aopr.a((aorr) aoqw.c(aflk.a((afjp) new afjr(afjo.a, afjo.b))), (aoqb) new afvb(this, str2), (Executor) aoqm.a), afvc.a, (Executor) aoqm.a);
                }
                throw new IllegalStateException(str3.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str3));
            }
            throw new NullPointerException("Null dataFileGroup");
        } catch (aelj e) {
            return aorl.a((Throwable) e);
        }
    }
}
