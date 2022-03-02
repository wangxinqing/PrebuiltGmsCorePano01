package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;

/* renamed from: ygx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ygx {
    private static final String g;
    private static final String h;
    private static final String i;
    private static final String j;
    private static final String k;
    private static final String l;
    public final String a;
    public String b;
    String c = null;
    int d;
    String e;
    public int f;
    private final String m;

    static {
        String join = TextUtils.join(", ", yfq.a);
        g = join;
        h = join.replace("committed", "1");
        String join2 = TextUtils.join(", ", yfo.a);
        i = join2;
        j = join2.replace("isCommitted", "1");
        String join3 = TextUtils.join(", ", yfn.a);
        k = join3;
        l = join3.replace("isCommitted", "1");
    }

    public ygx(String str, String str2) {
        this.a = str;
        this.m = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00db, code lost:
        if (r5[7].equals("1") != false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0128, code lost:
        if (r5 != null) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x027a A[SYNTHETIC, Splitter:B:100:0x027a] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0287 A[Catch:{ NumberFormatException -> 0x04b6, NumberFormatException -> 0x0496, all -> 0x0462, all -> 0x046a, all -> 0x0454, all -> 0x045c, all -> 0x0446, all -> 0x044e, all -> 0x0426, all -> 0x042e, yfx -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0319 A[Catch:{ NumberFormatException -> 0x04b6, NumberFormatException -> 0x0496, all -> 0x0462, all -> 0x046a, all -> 0x0454, all -> 0x045c, all -> 0x0446, all -> 0x044e, all -> 0x0426, all -> 0x042e, yfx -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x031b A[Catch:{ NumberFormatException -> 0x04b6, NumberFormatException -> 0x0496, all -> 0x0462, all -> 0x046a, all -> 0x0454, all -> 0x045c, all -> 0x0446, all -> 0x044e, all -> 0x0426, all -> 0x042e, yfx -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013c A[Catch:{ NumberFormatException -> 0x04b6, NumberFormatException -> 0x0496, all -> 0x0462, all -> 0x046a, all -> 0x0454, all -> 0x045c, all -> 0x0446, all -> 0x044e, all -> 0x0426, all -> 0x042e, yfx -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0183 A[Catch:{ NumberFormatException -> 0x04b6, NumberFormatException -> 0x0496, all -> 0x0462, all -> 0x046a, all -> 0x0454, all -> 0x045c, all -> 0x0446, all -> 0x044e, all -> 0x0426, all -> 0x042e, yfx -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01c6 A[SYNTHETIC, Splitter:B:82:0x01c6] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01d4 A[Catch:{ NumberFormatException -> 0x04b6, NumberFormatException -> 0x0496, all -> 0x0462, all -> 0x046a, all -> 0x0454, all -> 0x045c, all -> 0x0446, all -> 0x044e, all -> 0x0426, all -> 0x042e, yfx -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01e7 A[SYNTHETIC, Splitter:B:88:0x01e7] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01f5 A[Catch:{ NumberFormatException -> 0x04b6, NumberFormatException -> 0x0496, all -> 0x0462, all -> 0x046a, all -> 0x0454, all -> 0x045c, all -> 0x0446, all -> 0x044e, all -> 0x0426, all -> 0x042e, yfx -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x020f A[SYNTHETIC, Splitter:B:94:0x020f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r20, defpackage.yfw r21) {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r2 = ") SELECT "
            java.lang.String r3 = r1.a
            r4 = 29500(0x733c, float:4.1338E-41)
            if (r3 == 0) goto L_0x04f8
            android.database.sqlite.SQLiteDatabase r3 = r21.getWritableDatabase()
            r3.beginTransaction()
            java.lang.String r5 = r1.a     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r6 = "CURRENT"
            boolean r5 = r5.startsWith(r6)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r11 = ""
            r12 = 5
            r13 = 3
            r14 = 2
            r15 = 0
            r10 = 1
            if (r5 == 0) goto L_0x0080
            java.lang.String r5 = r1.a     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r6 = ":"
            java.lang.String[] r5 = r5.split(r6, r13)     // Catch:{ yfx -> 0x04d9 }
            int r6 = r5.length     // Catch:{ yfx -> 0x04d9 }
            if (r6 == r13) goto L_0x004b
            yfy r2 = new yfy     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r5 = "Empty or malformed snapshot token: "
            java.lang.String r6 = r1.a     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ yfx -> 0x04d9 }
            int r7 = r6.length()     // Catch:{ yfx -> 0x04d9 }
            if (r7 != 0) goto L_0x0043
            java.lang.String r6 = new java.lang.String     // Catch:{ yfx -> 0x04d9 }
            r6.<init>(r5)     // Catch:{ yfx -> 0x04d9 }
            goto L_0x0047
        L_0x0043:
            java.lang.String r6 = r5.concat(r6)     // Catch:{ yfx -> 0x04d9 }
        L_0x0047:
            r2.<init>(r4, r6)     // Catch:{ yfx -> 0x04d9 }
            throw r2     // Catch:{ yfx -> 0x04d9 }
        L_0x004b:
            r6 = r5[r10]     // Catch:{ yfx -> 0x04d9 }
            r1.e = r6     // Catch:{ yfx -> 0x04d9 }
            boolean r6 = r6.equals(r11)     // Catch:{ yfx -> 0x04d9 }
            if (r6 == 0) goto L_0x0057
        L_0x0056:
            goto L_0x0062
        L_0x0057:
            java.lang.String r6 = r1.e     // Catch:{ yfx -> 0x04d9 }
            r7 = r20
            boolean r6 = defpackage.ygd.a(r6, r7)     // Catch:{ yfx -> 0x04d9 }
            if (r6 == 0) goto L_0x0078
            goto L_0x0056
        L_0x0062:
            r5 = r5[r14]     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r6 = r1.m     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r5 = defpackage.ygb.a(r5, r6)     // Catch:{ yfx -> 0x04d9 }
            r1.c = r5     // Catch:{ yfx -> 0x04d9 }
            r1.b = r5     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r6 = r1.e     // Catch:{ yfx -> 0x04d9 }
            int r5 = defpackage.yhe.b(r3, r5, r6)     // Catch:{ yfx -> 0x04d9 }
            r1.d = r5     // Catch:{ yfx -> 0x04d9 }
            goto L_0x010d
        L_0x0078:
            yfy r2 = new yfy     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r5 = "Invalid user"
            r2.<init>(r4, r5)     // Catch:{ yfx -> 0x04d9 }
            throw r2     // Catch:{ yfx -> 0x04d9 }
        L_0x0080:
            java.lang.String r5 = r1.a     // Catch:{ yfx -> 0x04d9 }
            java.lang.String[] r5 = defpackage.yhe.a((java.lang.String) r5)     // Catch:{ yfx -> 0x04d9 }
            if (r5 != 0) goto L_0x00a6
            yfy r2 = new yfy     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r5 = "Empty (package not registered?) or malformed snapshot token: "
            java.lang.String r6 = r1.a     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ yfx -> 0x04d9 }
            int r7 = r6.length()     // Catch:{ yfx -> 0x04d9 }
            if (r7 != 0) goto L_0x009e
            java.lang.String r6 = new java.lang.String     // Catch:{ yfx -> 0x04d9 }
            r6.<init>(r5)     // Catch:{ yfx -> 0x04d9 }
            goto L_0x00a2
        L_0x009e:
            java.lang.String r6 = r5.concat(r6)     // Catch:{ yfx -> 0x04d9 }
        L_0x00a2:
            r2.<init>(r4, r6)     // Catch:{ yfx -> 0x04d9 }
            throw r2     // Catch:{ yfx -> 0x04d9 }
        L_0x00a6:
            r6 = r5[r15]     // Catch:{ yfx -> 0x04d9 }
            r1.e = r6     // Catch:{ yfx -> 0x04d9 }
            r6 = r5[r10]     // Catch:{ yfx -> 0x04d9 }
            r1.b = r6     // Catch:{ yfx -> 0x04d9 }
            r6 = r5[r12]     // Catch:{ yfx -> 0x04d9 }
            r1.c = r6     // Catch:{ yfx -> 0x04d9 }
            r6 = r5[r14]     // Catch:{ NumberFormatException -> 0x04b6 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x04b6 }
            r1.d = r6     // Catch:{ NumberFormatException -> 0x04b6 }
            r6 = r5[r13]     // Catch:{ NumberFormatException -> 0x0496 }
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x0496 }
            java.lang.String r8 = r1.b     // Catch:{ NumberFormatException -> 0x0496 }
            long r8 = defpackage.yfm.a(r3, r8)     // Catch:{ NumberFormatException -> 0x0496 }
            r12 = 29501(0x733d, float:4.134E-41)
            int r16 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r16 != 0) goto L_0x0470
            int r6 = r5.length     // Catch:{ yfx -> 0x04d9 }
            r7 = 7
            if (r6 > r7) goto L_0x00d2
            goto L_0x00dd
        L_0x00d2:
            r6 = r5[r7]     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r7 = "1"
            boolean r6 = r6.equals(r7)     // Catch:{ yfx -> 0x04d9 }
            if (r6 == 0) goto L_0x010d
        L_0x00dd:
            r6 = 6
            r5 = r5[r6]     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r6 = r1.c     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r7 = r1.e     // Catch:{ yfx -> 0x04d9 }
            android.util.Pair r6 = defpackage.yfw.a((android.database.sqlite.SQLiteDatabase) r3, (java.lang.String) r6, (java.lang.String) r7)     // Catch:{ yfx -> 0x04d9 }
            if (r6 == 0) goto L_0x00fd
            java.lang.String r7 = r1.c     // Catch:{ yfx -> 0x04d9 }
            java.lang.Object r8 = r6.second     // Catch:{ yfx -> 0x04d9 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ yfx -> 0x04d9 }
            int r8 = r8.intValue()     // Catch:{ yfx -> 0x04d9 }
            java.lang.Object r6 = r6.first     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r6 = defpackage.yfo.a(r3, r7, r8, r6, r10)     // Catch:{ yfx -> 0x04d9 }
            goto L_0x00fe
        L_0x00fd:
            r6 = r11
        L_0x00fe:
            boolean r5 = r5.equals(r6)     // Catch:{ yfx -> 0x04d9 }
            if (r5 == 0) goto L_0x0105
            goto L_0x010d
        L_0x0105:
            yfy r2 = new yfy     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r4 = "Stale snapshot (committed configuration changed)"
            r2.<init>(r12, r4)     // Catch:{ yfx -> 0x04d9 }
            throw r2     // Catch:{ yfx -> 0x04d9 }
        L_0x010d:
            java.lang.String r6 = r1.c     // Catch:{ yfx -> 0x04d9 }
            int r7 = r1.d     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r8 = r1.e     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r12 = "servingVersion"
            r9 = 0
            r5 = r3
            r13 = 1
            r10 = r12
            android.database.Cursor r5 = defpackage.yfo.a(r5, r6, r7, r8, r9, r10)     // Catch:{ yfx -> 0x04d9 }
            boolean r6 = r5.moveToFirst()     // Catch:{ all -> 0x0462 }
            r7 = -1
            if (r6 == 0) goto L_0x012e
            int r7 = r5.getInt(r15)     // Catch:{ all -> 0x0462 }
            if (r5 == 0) goto L_0x0132
        L_0x012a:
            r5.close()     // Catch:{ yfx -> 0x04d9 }
            goto L_0x0131
        L_0x012e:
            if (r5 == 0) goto L_0x0131
            goto L_0x012a
        L_0x0131:
        L_0x0132:
            r1.f = r7     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r5 = r1.c     // Catch:{ yfx -> 0x04d9 }
            boolean r5 = defpackage.yhe.b(r5)     // Catch:{ yfx -> 0x04d9 }
            if (r5 == 0) goto L_0x017b
            java.lang.String r5 = r1.e     // Catch:{ yfx -> 0x04d9 }
            boolean r5 = r5.equals(r11)     // Catch:{ yfx -> 0x04d9 }
            if (r5 == 0) goto L_0x0145
            goto L_0x017b
        L_0x0145:
            yfy r2 = new yfy     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r5 = r1.e     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r6 = r1.c     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r7 = java.lang.String.valueOf(r5)     // Catch:{ yfx -> 0x04d9 }
            int r7 = r7.length()     // Catch:{ yfx -> 0x04d9 }
            int r7 = r7 + 47
            java.lang.String r8 = java.lang.String.valueOf(r6)     // Catch:{ yfx -> 0x04d9 }
            int r8 = r8.length()     // Catch:{ yfx -> 0x04d9 }
            int r7 = r7 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ yfx -> 0x04d9 }
            r8.<init>(r7)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r7 = "Can't commit to "
            r8.append(r7)     // Catch:{ yfx -> 0x04d9 }
            r8.append(r5)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r5 = " for direct boot aware package "
            r8.append(r5)     // Catch:{ yfx -> 0x04d9 }
            r8.append(r6)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r5 = r8.toString()     // Catch:{ yfx -> 0x04d9 }
            r2.<init>(r4, r5)     // Catch:{ yfx -> 0x04d9 }
            throw r2     // Catch:{ yfx -> 0x04d9 }
        L_0x017b:
            java.lang.String r4 = " FROM Flags WHERE packageName = ? AND version = ? AND user = ? AND committed = 0"
            boolean r5 = defpackage.azaf.c()     // Catch:{ yfx -> 0x04d9 }
            if (r5 == 0) goto L_0x01b8
            java.lang.String r5 = r1.b     // Catch:{ yfx -> 0x04d9 }
            int r6 = r1.d     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r7 = r1.e     // Catch:{ yfx -> 0x04d9 }
            boolean r5 = defpackage.yfe.a((android.database.sqlite.SQLiteDatabase) r3, (java.lang.String) r5, (int) r6, (java.lang.String) r7, (boolean) r15)     // Catch:{ yfx -> 0x04d9 }
            if (r5 == 0) goto L_0x0190
            goto L_0x01b8
        L_0x0190:
            yfx r2 = new yfx     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r4 = r1.c     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ yfx -> 0x04d9 }
            int r5 = r5.length()     // Catch:{ yfx -> 0x04d9 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ yfx -> 0x04d9 }
            int r5 = r5 + 66
            r6.<init>(r5)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r5 = "Can't commit to flags for package "
            r6.append(r5)     // Catch:{ yfx -> 0x04d9 }
            r6.append(r4)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r4 = " due to detected flag corruption"
            r6.append(r4)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r4 = r6.toString()     // Catch:{ yfx -> 0x04d9 }
            r2.<init>(r4)     // Catch:{ yfx -> 0x04d9 }
            throw r2     // Catch:{ yfx -> 0x04d9 }
        L_0x01b8:
            java.lang.String r5 = r1.c     // Catch:{ yfx -> 0x04d9 }
            boolean r5 = defpackage.agvj.b(r5)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r6 = "packageName = ? AND user = ? AND committed = 1"
            java.lang.String r7 = "packageName = ? AND committed = 1"
            java.lang.String r8 = "Flags"
            if (r5 == 0) goto L_0x01d4
            java.lang.String[] r5 = new java.lang.String[r14]     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r9 = r1.c     // Catch:{ yfx -> 0x04d9 }
            r5[r15] = r9     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r9 = r1.e     // Catch:{ yfx -> 0x04d9 }
            r5[r13] = r9     // Catch:{ yfx -> 0x04d9 }
            r3.delete(r8, r6, r5)     // Catch:{ yfx -> 0x04d9 }
            goto L_0x01dd
        L_0x01d4:
            java.lang.String[] r5 = new java.lang.String[r13]     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r9 = r1.c     // Catch:{ yfx -> 0x04d9 }
            r5[r15] = r9     // Catch:{ yfx -> 0x04d9 }
            r3.delete(r8, r7, r5)     // Catch:{ yfx -> 0x04d9 }
        L_0x01dd:
            java.lang.String r5 = r1.c     // Catch:{ yfx -> 0x04d9 }
            boolean r5 = defpackage.agvj.b(r5)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r8 = "FlagOverrides"
            if (r5 == 0) goto L_0x01f5
            java.lang.String[] r5 = new java.lang.String[r14]     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r7 = r1.c     // Catch:{ yfx -> 0x04d9 }
            r5[r15] = r7     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r7 = r1.e     // Catch:{ yfx -> 0x04d9 }
            r5[r13] = r7     // Catch:{ yfx -> 0x04d9 }
            r3.delete(r8, r6, r5)     // Catch:{ yfx -> 0x04d9 }
            goto L_0x01fe
        L_0x01f5:
            java.lang.String[] r5 = new java.lang.String[r13]     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r6 = r1.c     // Catch:{ yfx -> 0x04d9 }
            r5[r15] = r6     // Catch:{ yfx -> 0x04d9 }
            r3.delete(r8, r7, r5)     // Catch:{ yfx -> 0x04d9 }
        L_0x01fe:
            java.lang.String r5 = h     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r6 = r1.c     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r7 = r1.b     // Catch:{ yfx -> 0x04d9 }
            boolean r6 = r6.equals(r7)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r7 = "packageName"
            java.lang.String r9 = "'"
            if (r6 == 0) goto L_0x020f
            goto L_0x0230
        L_0x020f:
            java.lang.String r6 = r1.c     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r10 = java.lang.String.valueOf(r6)     // Catch:{ yfx -> 0x04d9 }
            int r10 = r10.length()     // Catch:{ yfx -> 0x04d9 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ yfx -> 0x04d9 }
            int r10 = r10 + r14
            r11.<init>(r10)     // Catch:{ yfx -> 0x04d9 }
            r11.append(r9)     // Catch:{ yfx -> 0x04d9 }
            r11.append(r6)     // Catch:{ yfx -> 0x04d9 }
            r11.append(r9)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r6 = r11.toString()     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r5 = r5.replace(r7, r6)     // Catch:{ yfx -> 0x04d9 }
        L_0x0230:
            java.lang.String r6 = g     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r10 = java.lang.String.valueOf(r6)     // Catch:{ yfx -> 0x04d9 }
            int r10 = r10.length()     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r11 = java.lang.String.valueOf(r5)     // Catch:{ yfx -> 0x04d9 }
            int r11 = r11.length()     // Catch:{ yfx -> 0x04d9 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ yfx -> 0x04d9 }
            int r10 = r10 + 108
            int r10 = r10 + r11
            r12.<init>(r10)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r10 = "INSERT INTO Flags ("
            r12.append(r10)     // Catch:{ yfx -> 0x04d9 }
            r12.append(r6)     // Catch:{ yfx -> 0x04d9 }
            r12.append(r2)     // Catch:{ yfx -> 0x04d9 }
            r12.append(r5)     // Catch:{ yfx -> 0x04d9 }
            r12.append(r4)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r4 = r12.toString()     // Catch:{ yfx -> 0x04d9 }
            android.database.sqlite.SQLiteStatement r4 = r3.compileStatement(r4)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r5 = r1.b     // Catch:{ all -> 0x0454 }
            r4.bindString(r13, r5)     // Catch:{ all -> 0x0454 }
            int r5 = r1.d     // Catch:{ all -> 0x0454 }
            long r5 = (long) r5     // Catch:{ all -> 0x0454 }
            r4.bindLong(r14, r5)     // Catch:{ all -> 0x0454 }
            java.lang.String r5 = r1.e     // Catch:{ all -> 0x0454 }
            r6 = 3
            r4.bindString(r6, r5)     // Catch:{ all -> 0x0454 }
            r4.execute()     // Catch:{ all -> 0x0454 }
            if (r4 != 0) goto L_0x027a
            goto L_0x027d
        L_0x027a:
            r4.close()     // Catch:{ yfx -> 0x04d9 }
        L_0x027d:
            java.lang.String r4 = r1.c     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r5 = r1.e     // Catch:{ yfx -> 0x04d9 }
            com.google.android.gms.phenotype.Flag[] r4 = defpackage.yhe.a(r3, r4, r5)     // Catch:{ yfx -> 0x04d9 }
            if (r4 == 0) goto L_0x0317
            int r5 = r4.length     // Catch:{ yfx -> 0x04d9 }
            r6 = 0
        L_0x0289:
            if (r6 >= r5) goto L_0x0317
            r10 = r4[r6]     // Catch:{ yfx -> 0x04d9 }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ yfx -> 0x04d9 }
            r11.<init>()     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r12 = r1.c     // Catch:{ yfx -> 0x04d9 }
            r11.put(r7, r12)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r12 = "user"
            java.lang.String r15 = r1.e     // Catch:{ yfx -> 0x04d9 }
            r11.put(r12, r15)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r12 = "name"
            java.lang.String r15 = r10.a     // Catch:{ yfx -> 0x04d9 }
            r11.put(r12, r15)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r12 = "flagType"
            int r15 = r10.h     // Catch:{ yfx -> 0x04d9 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ yfx -> 0x04d9 }
            r11.put(r12, r15)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r12 = "committed"
            java.lang.Integer r15 = java.lang.Integer.valueOf(r13)     // Catch:{ yfx -> 0x04d9 }
            r11.put(r12, r15)     // Catch:{ yfx -> 0x04d9 }
            int r12 = r10.g     // Catch:{ yfx -> 0x04d9 }
            if (r12 == r13) goto L_0x0300
            if (r12 == r14) goto L_0x02f2
            r15 = 3
            if (r12 == r15) goto L_0x02e4
            r15 = 4
            if (r12 == r15) goto L_0x02da
            r15 = 5
            if (r12 != r15) goto L_0x02d2
            java.lang.String r12 = "extensionVal"
            byte[] r10 = r10.e()     // Catch:{ yfx -> 0x04d9 }
            r11.put(r12, r10)     // Catch:{ yfx -> 0x04d9 }
            goto L_0x030d
        L_0x02d2:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r4 = "bad Flag type - should not happen!"
            r2.<init>(r4)     // Catch:{ yfx -> 0x04d9 }
            throw r2     // Catch:{ yfx -> 0x04d9 }
        L_0x02da:
            java.lang.String r12 = "stringVal"
            java.lang.String r10 = r10.d()     // Catch:{ yfx -> 0x04d9 }
            r11.put(r12, r10)     // Catch:{ yfx -> 0x04d9 }
            goto L_0x030d
        L_0x02e4:
            java.lang.String r12 = "floatVal"
            double r17 = r10.c()     // Catch:{ yfx -> 0x04d9 }
            java.lang.Double r10 = java.lang.Double.valueOf(r17)     // Catch:{ yfx -> 0x04d9 }
            r11.put(r12, r10)     // Catch:{ yfx -> 0x04d9 }
            goto L_0x030d
        L_0x02f2:
            java.lang.String r12 = "boolVal"
            boolean r10 = r10.b()     // Catch:{ yfx -> 0x04d9 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ yfx -> 0x04d9 }
            r11.put(r12, r10)     // Catch:{ yfx -> 0x04d9 }
            goto L_0x030d
        L_0x0300:
            java.lang.String r12 = "intVal"
            long r17 = r10.a()     // Catch:{ yfx -> 0x04d9 }
            java.lang.Long r10 = java.lang.Long.valueOf(r17)     // Catch:{ yfx -> 0x04d9 }
            r11.put(r12, r10)     // Catch:{ yfx -> 0x04d9 }
        L_0x030d:
            r10 = 0
            r12 = 5
            r3.insertWithOnConflict(r8, r10, r11, r12)     // Catch:{ yfx -> 0x04d9 }
            int r6 = r6 + 1
            r15 = 0
            goto L_0x0289
        L_0x0317:
            if (r4 == 0) goto L_0x031b
            goto L_0x0434
        L_0x031b:
            java.lang.String r4 = " FROM ExperimentTokens WHERE packageName = ? AND version = ? AND user = ? AND isCommitted = 0"
            java.lang.String r5 = r1.c     // Catch:{ yfx -> 0x04d9 }
            boolean r5 = defpackage.agvj.b(r5)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r6 = "ExperimentTokens"
            if (r5 == 0) goto L_0x0338
            java.lang.String[] r5 = new java.lang.String[r14]     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r8 = r1.c     // Catch:{ yfx -> 0x04d9 }
            r10 = 0
            r5[r10] = r8     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r8 = r1.e     // Catch:{ yfx -> 0x04d9 }
            r5[r13] = r8     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r8 = "packageName = ? AND user = ? AND isCommitted = 1"
            r3.delete(r6, r8, r5)     // Catch:{ yfx -> 0x04d9 }
            goto L_0x0344
        L_0x0338:
            java.lang.String[] r5 = new java.lang.String[r13]     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r8 = r1.c     // Catch:{ yfx -> 0x04d9 }
            r10 = 0
            r5[r10] = r8     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r8 = "packageName = ? AND isCommitted = 1"
            r3.delete(r6, r8, r5)     // Catch:{ yfx -> 0x04d9 }
        L_0x0344:
            java.lang.String r5 = j     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r6 = r1.b     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r8 = r1.c     // Catch:{ yfx -> 0x04d9 }
            boolean r6 = r6.equals(r8)     // Catch:{ yfx -> 0x04d9 }
            if (r6 == 0) goto L_0x0351
            goto L_0x0372
        L_0x0351:
            java.lang.String r6 = r1.c     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r8 = java.lang.String.valueOf(r6)     // Catch:{ yfx -> 0x04d9 }
            int r8 = r8.length()     // Catch:{ yfx -> 0x04d9 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ yfx -> 0x04d9 }
            int r8 = r8 + r14
            r10.<init>(r8)     // Catch:{ yfx -> 0x04d9 }
            r10.append(r9)     // Catch:{ yfx -> 0x04d9 }
            r10.append(r6)     // Catch:{ yfx -> 0x04d9 }
            r10.append(r9)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r6 = r10.toString()     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r5 = r5.replace(r7, r6)     // Catch:{ yfx -> 0x04d9 }
        L_0x0372:
            java.lang.String r6 = i     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r7 = java.lang.String.valueOf(r6)     // Catch:{ yfx -> 0x04d9 }
            int r7 = r7.length()     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r8 = java.lang.String.valueOf(r5)     // Catch:{ yfx -> 0x04d9 }
            int r8 = r8.length()     // Catch:{ yfx -> 0x04d9 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ yfx -> 0x04d9 }
            int r7 = r7 + 132
            int r7 = r7 + r8
            r9.<init>(r7)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r7 = "INSERT INTO ExperimentTokens ("
            r9.append(r7)     // Catch:{ yfx -> 0x04d9 }
            r9.append(r6)     // Catch:{ yfx -> 0x04d9 }
            r9.append(r2)     // Catch:{ yfx -> 0x04d9 }
            r9.append(r5)     // Catch:{ yfx -> 0x04d9 }
            r9.append(r4)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r4 = r9.toString()     // Catch:{ yfx -> 0x04d9 }
            android.database.sqlite.SQLiteStatement r4 = r3.compileStatement(r4)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r5 = r1.b     // Catch:{ all -> 0x0446 }
            r4.bindString(r13, r5)     // Catch:{ all -> 0x0446 }
            int r5 = r1.d     // Catch:{ all -> 0x0446 }
            long r5 = (long) r5     // Catch:{ all -> 0x0446 }
            r4.bindLong(r14, r5)     // Catch:{ all -> 0x0446 }
            java.lang.String r5 = r1.e     // Catch:{ all -> 0x0446 }
            r6 = 3
            r4.bindString(r6, r5)     // Catch:{ all -> 0x0446 }
            r4.execute()     // Catch:{ all -> 0x0446 }
            if (r4 != 0) goto L_0x03bc
            goto L_0x03bf
        L_0x03bc:
            r4.close()     // Catch:{ yfx -> 0x04d9 }
        L_0x03bf:
            int r4 = r1.d     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r5 = r1.e     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r6 = " FROM CrossLoggedExperimentTokens WHERE fromPackageName = ? AND fromVersion = ? AND fromUser = ? AND isCommitted = 0"
            java.lang.String[] r7 = new java.lang.String[r13]     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r8 = r1.c     // Catch:{ yfx -> 0x04d9 }
            r9 = 0
            r7[r9] = r8     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r8 = "CrossLoggedExperimentTokens"
            java.lang.String r9 = "fromPackageName = ? AND isCommitted = 1"
            r3.delete(r8, r9, r7)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r7 = r1.c     // Catch:{ yfx -> 0x04d9 }
            boolean r7 = defpackage.agvj.b(r7)     // Catch:{ yfx -> 0x04d9 }
            if (r7 != 0) goto L_0x0434
            java.lang.String r7 = k     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r8 = l     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r9 = java.lang.String.valueOf(r7)     // Catch:{ yfx -> 0x04d9 }
            int r9 = r9.length()     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r10 = java.lang.String.valueOf(r8)     // Catch:{ yfx -> 0x04d9 }
            int r10 = r10.length()     // Catch:{ yfx -> 0x04d9 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ yfx -> 0x04d9 }
            int r9 = r9 + 166
            int r9 = r9 + r10
            r11.<init>(r9)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r9 = "INSERT INTO CrossLoggedExperimentTokens ("
            r11.append(r9)     // Catch:{ yfx -> 0x04d9 }
            r11.append(r7)     // Catch:{ yfx -> 0x04d9 }
            r11.append(r2)     // Catch:{ yfx -> 0x04d9 }
            r11.append(r8)     // Catch:{ yfx -> 0x04d9 }
            r11.append(r6)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r2 = r11.toString()     // Catch:{ yfx -> 0x04d9 }
            android.database.sqlite.SQLiteStatement r2 = r3.compileStatement(r2)     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r6 = r1.c     // Catch:{ all -> 0x0426 }
            r2.bindString(r13, r6)     // Catch:{ all -> 0x0426 }
            long r6 = (long) r4     // Catch:{ all -> 0x0426 }
            r2.bindLong(r14, r6)     // Catch:{ all -> 0x0426 }
            r4 = 3
            r2.bindString(r4, r5)     // Catch:{ all -> 0x0426 }
            r2.execute()     // Catch:{ all -> 0x0426 }
            if (r2 == 0) goto L_0x0434
            r2.close()     // Catch:{ yfx -> 0x04d9 }
            goto L_0x0434
        L_0x0426:
            r0 = move-exception
            r4 = r0
            if (r2 == 0) goto L_0x0433
            r2.close()     // Catch:{ all -> 0x042e }
            goto L_0x0433
        L_0x042e:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r4, (java.lang.Throwable) r2)     // Catch:{ yfx -> 0x04d9 }
        L_0x0433:
            throw r4     // Catch:{ yfx -> 0x04d9 }
        L_0x0434:
            java.lang.String r2 = r1.e     // Catch:{ yfx -> 0x04d9 }
            int r4 = r1.d     // Catch:{ yfx -> 0x04d9 }
            long r4 = (long) r4     // Catch:{ yfx -> 0x04d9 }
            r1.a(r3, r2, r4)     // Catch:{ yfx -> 0x04d9 }
            r3.setTransactionSuccessful()     // Catch:{ yfx -> 0x04d9 }
            r3.endTransaction()
            defpackage.yhj.a()
            return
        L_0x0446:
            r0 = move-exception
            r2 = r0
            if (r4 == 0) goto L_0x0453
            r4.close()     // Catch:{ all -> 0x044e }
            goto L_0x0453
        L_0x044e:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r4)     // Catch:{ yfx -> 0x04d9 }
        L_0x0453:
            throw r2     // Catch:{ yfx -> 0x04d9 }
        L_0x0454:
            r0 = move-exception
            r2 = r0
            if (r4 == 0) goto L_0x0461
            r4.close()     // Catch:{ all -> 0x045c }
            goto L_0x0461
        L_0x045c:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r4)     // Catch:{ yfx -> 0x04d9 }
        L_0x0461:
            throw r2     // Catch:{ yfx -> 0x04d9 }
        L_0x0462:
            r0 = move-exception
            r2 = r0
            if (r5 == 0) goto L_0x046f
            r5.close()     // Catch:{ all -> 0x046a }
            goto L_0x046f
        L_0x046a:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r4)     // Catch:{ yfx -> 0x04d9 }
        L_0x046f:
            throw r2     // Catch:{ yfx -> 0x04d9 }
        L_0x0470:
            yfy r2 = new yfy     // Catch:{ NumberFormatException -> 0x0496 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0496 }
            r10 = 99
            r5.<init>(r10)     // Catch:{ NumberFormatException -> 0x0496 }
            java.lang.String r10 = "Stale snapshot (change count changed - expected "
            r5.append(r10)     // Catch:{ NumberFormatException -> 0x0496 }
            r5.append(r8)     // Catch:{ NumberFormatException -> 0x0496 }
            java.lang.String r8 = "  but was "
            r5.append(r8)     // Catch:{ NumberFormatException -> 0x0496 }
            r5.append(r6)     // Catch:{ NumberFormatException -> 0x0496 }
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ NumberFormatException -> 0x0496 }
            java.lang.String r5 = r5.toString()     // Catch:{ NumberFormatException -> 0x0496 }
            r2.<init>(r12, r5)     // Catch:{ NumberFormatException -> 0x0496 }
            throw r2     // Catch:{ NumberFormatException -> 0x0496 }
        L_0x0496:
            r0 = move-exception
            r2 = r0
            yfy r5 = new yfy     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r6 = "Malformed snapshot token (change): "
            java.lang.String r7 = r1.a     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ yfx -> 0x04d9 }
            int r8 = r7.length()     // Catch:{ yfx -> 0x04d9 }
            if (r8 != 0) goto L_0x04ae
            java.lang.String r7 = new java.lang.String     // Catch:{ yfx -> 0x04d9 }
            r7.<init>(r6)     // Catch:{ yfx -> 0x04d9 }
            goto L_0x04b2
        L_0x04ae:
            java.lang.String r7 = r6.concat(r7)     // Catch:{ yfx -> 0x04d9 }
        L_0x04b2:
            r5.<init>(r4, r7, r2)     // Catch:{ yfx -> 0x04d9 }
            throw r5     // Catch:{ yfx -> 0x04d9 }
        L_0x04b6:
            r0 = move-exception
            r2 = r0
            yfy r5 = new yfy     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r6 = "Malformed snapshot token (version): "
            java.lang.String r7 = r1.a     // Catch:{ yfx -> 0x04d9 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ yfx -> 0x04d9 }
            int r8 = r7.length()     // Catch:{ yfx -> 0x04d9 }
            if (r8 != 0) goto L_0x04ce
            java.lang.String r7 = new java.lang.String     // Catch:{ yfx -> 0x04d9 }
            r7.<init>(r6)     // Catch:{ yfx -> 0x04d9 }
            goto L_0x04d2
        L_0x04ce:
            java.lang.String r7 = r6.concat(r7)     // Catch:{ yfx -> 0x04d9 }
        L_0x04d2:
            r5.<init>(r4, r7, r2)     // Catch:{ yfx -> 0x04d9 }
            throw r5     // Catch:{ yfx -> 0x04d9 }
        L_0x04d6:
            r0 = move-exception
            r2 = r0
            goto L_0x04f4
        L_0x04d9:
            r0 = move-exception
            r2 = r0
            int r4 = r2.a     // Catch:{ all -> 0x04d6 }
            r5 = 29512(0x7348, float:4.1355E-41)
            if (r4 != r5) goto L_0x04f3
            r3.endTransaction()     // Catch:{ all -> 0x04d6 }
            r3.beginTransaction()     // Catch:{ all -> 0x04d6 }
            java.lang.String r4 = r1.b     // Catch:{ all -> 0x04d6 }
            java.lang.String r5 = r1.e     // Catch:{ all -> 0x04d6 }
            int r6 = r1.d     // Catch:{ all -> 0x04d6 }
            defpackage.yfw.a((android.database.sqlite.SQLiteDatabase) r3, (java.lang.String) r4, (java.lang.String) r5, (int) r6)     // Catch:{ all -> 0x04d6 }
            r3.setTransactionSuccessful()     // Catch:{ all -> 0x04d6 }
        L_0x04f3:
            throw r2     // Catch:{ all -> 0x04d6 }
        L_0x04f4:
            r3.endTransaction()
            throw r2
        L_0x04f8:
            yfy r2 = new yfy
            java.lang.String r3 = "No snapshot token"
            r2.<init>(r4, r3)
            goto L_0x0501
        L_0x0500:
            throw r2
        L_0x0501:
            goto L_0x0500
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygx.a(android.content.Context, yfw):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(SQLiteDatabase sQLiteDatabase, String str, long j2) {
        if (agvj.b(this.c)) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("packageName", this.c);
            contentValues.put("user", str);
            contentValues.put("version", Long.valueOf(j2));
            sQLiteDatabase.insertWithOnConflict("MultiCommitApplicationStates", (String) null, contentValues, 5);
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("packageName", this.c);
        contentValues2.put("user", str);
        contentValues2.put("version", Long.valueOf(j2));
        sQLiteDatabase.insertWithOnConflict("ApplicationStates", (String) null, contentValues2, 5);
    }
}
