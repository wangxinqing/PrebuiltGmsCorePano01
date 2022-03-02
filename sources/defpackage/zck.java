package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: zck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zck extends zax {
    private final ClientContext a;
    private final ClientContext b;
    private final String c;
    private final String[] d;
    private final itv e;
    private final String f;
    private final zav g;
    private final boolean h;
    private final boolean i;

    public zck(ClientContext clientContext, ClientContext clientContext2, String[] strArr, itv itv, String str, zav zav, boolean z, boolean z2) {
        this.a = clientContext;
        this.b = clientContext2;
        this.e = itv;
        this.c = clientContext2.e;
        this.d = strArr;
        this.f = str;
        this.g = zav;
        this.h = z;
        boolean z3 = false;
        if (!z2 && ((Boolean) ysu.aa.c()).booleanValue()) {
            z3 = true;
        }
        this.i = z3;
    }

    private final void a(Context context, ConnectionResult connectionResult) {
        a(context, connectionResult, (IBinder) null, (byte[]) null);
    }

    private final void a(Context context, ConnectionResult connectionResult, IBinder iBinder, byte[] bArr) {
        int i2 = connectionResult.c;
        if (i2 == 0 || i2 == 5 || connectionResult.a()) {
            if (!connectionResult.b() && "<<default account>>".equals(this.b.a())) {
                jgu.c(context, this.c);
            }
            Bundle bundle = new Bundle();
            if (connectionResult.a()) {
                bundle.putParcelable("pendingIntent", connectionResult.d);
            }
            if (bArr != null) {
                bundle.putByteArray("loaded_person", bArr);
            }
            this.e.a(connectionResult.c, iBinder, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append("no resolution provided for status ");
        sb.append(i2);
        Log.e("ValidateAccountOperatio", sb.toString());
        throw new IllegalStateException("no resolution provided!");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02a0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02a2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02a3, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        r4 = r0.networkResponse;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02ae, code lost:
        defpackage.zaj.a(r5, r2.a(), r2.e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02b7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02c2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02c4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02c5, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02c8, code lost:
        r7 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02ca, code lost:
        a(r9, defpackage.zaw.a(r9, r1.b, r15.equals(r2.a()), r1.i));
        r7 = new byte[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02e2, code lost:
        r3 = new defpackage.yuf(r9, r2);
        r3.b = r0.a();
        a(r9, defpackage.zaw.a(r9, r1.c, 6, r3.a()));
        r7 = new byte[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b5, code lost:
        r15 = "<<default account>>";
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b9, code lost:
        r18 = r6;
        r15 = "<<default account>>";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ce, code lost:
        r18 = r6;
        r15 = "<<default account>>";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0101, code lost:
        r3.b();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x027b A[Catch:{ all -> 0x0290 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02c0 A[ExcHandler: eif (e eif), Splitter:B:100:0x0200] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02c2 A[ExcHandler: UserRecoverableAuthException (r0v13 'e' com.google.android.gms.auth.UserRecoverableAuthException A[CUSTOM_DECLARE]), Splitter:B:71:0x0162] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0306 A[EDGE_INSN: B:169:0x0306->B:164:0x0306 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b8 A[ExcHandler: eif (e eif), Splitter:B:26:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cd A[ExcHandler: IOException (e java.io.IOException), Splitter:B:26:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a1 A[SYNTHETIC, Splitter:B:79:0x01a1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r28, defpackage.yrr r29) {
        /*
            r27 = this;
            r1 = r27
            r9 = r28
            java.lang.String r10 = "plus_profiles"
            java.lang.String r11 = "PlusV1Agent"
            java.lang.String r12 = "com.google.android.gms.plus"
            com.google.android.gms.common.internal.ClientContext r0 = r1.b
            r0.b()
            boolean r0 = r1.h
            r13 = 6
            r14 = 2
            r15 = 1
            java.lang.String r8 = "<<default account>>"
            r7 = 0
            if (r0 == 0) goto L_0x001c
            r15 = r8
            goto L_0x0118
        L_0x001c:
            boolean r0 = defpackage.jgu.e(r28)
            if (r0 == 0) goto L_0x002a
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r2 = 20
            r0.<init>(r2, r7)
            goto L_0x002c
        L_0x002a:
            com.google.android.gms.common.ConnectionResult r0 = com.google.android.gms.common.ConnectionResult.a
        L_0x002c:
            boolean r2 = r0.b()
            if (r2 != 0) goto L_0x0036
            r1.a((android.content.Context) r9, (com.google.android.gms.common.ConnectionResult) r0)
            return
        L_0x0036:
            com.google.android.gms.common.internal.ClientContext r0 = r1.b
            java.lang.String r0 = r0.a()
            java.lang.String r2 = r1.c
            java.lang.String r0 = defpackage.jgu.b((android.content.Context) r9, (java.lang.String) r0, (java.lang.String) r2)
            if (r0 != 0) goto L_0x0067
            com.google.android.gms.common.internal.ClientContext r0 = r1.b
            java.lang.String r0 = r0.a()
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x005b
            java.lang.String r0 = r1.c
            r2 = 5
            com.google.android.gms.common.ConnectionResult r0 = defpackage.zaw.a((android.content.Context) r9, (java.lang.String) r0, (int) r2, (android.content.Intent) r7)
            r1.a(r9, r0, r7, r7)
            return
        L_0x005b:
            com.google.android.gms.common.internal.ClientContext r0 = r1.b
            boolean r2 = r1.i
            com.google.android.gms.common.ConnectionResult r0 = defpackage.zaw.a((android.content.Context) r9, (com.google.android.gms.common.internal.ClientContext) r0, (boolean) r15, (boolean) r2)
            r1.a(r9, r0, r7, r7)
            return
        L_0x0067:
            com.google.android.gms.common.internal.ClientContext r2 = r1.b
            r2.e(r0)
            com.google.android.gms.common.internal.ClientContext r2 = r1.a
            r2.e(r0)
            boolean r0 = r1.i
            if (r0 != 0) goto L_0x0088
            zav r0 = r1.g
            com.google.android.gms.common.internal.ClientContext r2 = r1.b
            java.lang.String[] r3 = r1.d
            com.google.android.gms.common.ConnectionResult r0 = r0.a(r9, r2, r3)
            int r2 = r0.c
            if (r2 != 0) goto L_0x0084
            goto L_0x0088
        L_0x0084:
            r1.a((android.content.Context) r9, (com.google.android.gms.common.ConnectionResult) r0)
            return
        L_0x0088:
            com.google.android.gms.common.internal.ClientContext r6 = r1.b
            zav r2 = r1.g     // Catch:{ UserRecoverableAuthException -> 0x00e7, IOException -> 0x00cd, eif -> 0x00b8 }
            java.lang.String r4 = r6.f     // Catch:{ UserRecoverableAuthException -> 0x00b4, IOException -> 0x00cd, eif -> 0x00b8 }
            int r5 = r6.b     // Catch:{ UserRecoverableAuthException -> 0x00b4, IOException -> 0x00cd, eif -> 0x00b8 }
            java.lang.String r0 = r6.g()     // Catch:{ UserRecoverableAuthException -> 0x00b4, IOException -> 0x00cd, eif -> 0x00b8 }
            java.lang.String r16 = r6.b()     // Catch:{ UserRecoverableAuthException -> 0x00b4, IOException -> 0x00cd, eif -> 0x00b8 }
            java.lang.String[] r17 = r6.h()     // Catch:{ UserRecoverableAuthException -> 0x00b4, IOException -> 0x00cd, eif -> 0x00b8 }
            r3 = r28
            r18 = r6
            r6 = r0
            r7 = r16
            r15 = r8
            r8 = r17
            com.google.android.gms.common.ConnectionResult r0 = r2.a(r3, r4, r5, r6, r7, r8)     // Catch:{ UserRecoverableAuthException -> 0x00b0, IOException -> 0x00ae, eif -> 0x00ac }
            goto L_0x010e
        L_0x00ac:
            r0 = move-exception
            goto L_0x00bc
        L_0x00ae:
            r0 = move-exception
            goto L_0x00d1
        L_0x00b0:
            r0 = move-exception
            r2 = r18
            goto L_0x00ea
        L_0x00b4:
            r0 = move-exception
            r15 = r8
            r2 = r6
            goto L_0x00ea
        L_0x00b8:
            r0 = move-exception
            r18 = r6
            r15 = r8
        L_0x00bc:
            java.lang.String r0 = r18.a()
            boolean r0 = r15.equals(r0)
            com.google.android.gms.common.internal.ClientContext r2 = r1.b
            boolean r3 = r1.i
            com.google.android.gms.common.ConnectionResult r0 = defpackage.zaw.a((android.content.Context) r9, (com.google.android.gms.common.internal.ClientContext) r2, (boolean) r0, (boolean) r3)
            goto L_0x010e
        L_0x00cd:
            r0 = move-exception
            r18 = r6
            r15 = r8
        L_0x00d1:
            yuf r0 = new yuf
            r2 = r18
            r0.<init>(r9, r2)
            r0.a = r14
            android.content.Intent r0 = r0.a()
            java.lang.String r2 = r1.c
            r3 = 8
            com.google.android.gms.common.ConnectionResult r0 = defpackage.zaw.a((android.content.Context) r9, (java.lang.String) r2, (int) r3, (android.content.Intent) r0)
            goto L_0x010e
        L_0x00e7:
            r0 = move-exception
            r2 = r6
            r15 = r8
        L_0x00ea:
            yuf r3 = new yuf
            r3.<init>(r9, r2)
            android.content.Intent r0 = r0.a()
            r3.b = r0
            r3.a = r14
            java.lang.String r0 = r2.a()
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x0104
            r3.b()
        L_0x0104:
            java.lang.String r0 = r1.c
            android.content.Intent r2 = r3.a()
            com.google.android.gms.common.ConnectionResult r0 = defpackage.zaw.a((android.content.Context) r9, (java.lang.String) r0, (int) r13, (android.content.Intent) r2)
        L_0x010e:
            boolean r2 = r0.b()
            if (r2 != 0) goto L_0x0118
            r1.a((android.content.Context) r9, (com.google.android.gms.common.ConnectionResult) r0)
            return
        L_0x0118:
            com.google.android.gms.common.internal.ClientContext r0 = r1.b
            com.google.android.gms.common.internal.ClientContext r2 = r1.a
            int r0 = r0.b
            int r2 = r2.b
            if (r0 == r2) goto L_0x0306
            hya r0 = defpackage.hya.a((android.content.Context) r28)
            java.lang.String r2 = r1.c
            boolean r0 = r0.b((java.lang.String) r2)
            if (r0 != 0) goto L_0x0306
            com.google.android.gms.common.internal.ClientContext r0 = r1.b
            java.lang.String[] r0 = r0.e()
            int r2 = r0.length
            r3 = 0
            r4 = 0
        L_0x0137:
            if (r4 >= r2) goto L_0x0306
            r5 = r0[r4]
            java.lang.String r6 = "profile"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x015e
            java.lang.String r6 = "https://www.googleapis.com/auth/userinfo.profile"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x015e
            java.lang.String r6 = "https://www.googleapis.com/auth/plus.me"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x015e
            java.lang.String r6 = "https://www.googleapis.com/auth/plus.login"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L_0x015e
            int r4 = r4 + 1
            goto L_0x0137
        L_0x015e:
            com.google.android.gms.common.internal.ClientContext r2 = r1.b
            r4 = r29
            ysb r4 = r4.d     // Catch:{ VolleyError -> 0x02c4, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            android.content.ContentResolver r5 = r28.getContentResolver()     // Catch:{ VolleyError -> 0x02c4, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            java.lang.String r0 = r2.b()     // Catch:{ VolleyError -> 0x02c4, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            java.lang.String r6 = r2.e     // Catch:{ VolleyError -> 0x02c4, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            android.content.ContentProviderClient r7 = r5.acquireContentProviderClient(r12)     // Catch:{ VolleyError -> 0x02c4, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            com.google.android.chimera.ContentProvider r8 = com.google.android.chimera.ContentProvider.getLocalContentProvider(r7)     // Catch:{ all -> 0x02b8 }
            com.google.android.gms.plus.provider.PlusChimeraContentProvider r8 = (com.google.android.gms.plus.provider.PlusChimeraContentProvider) r8     // Catch:{ all -> 0x02b8 }
            zai r8 = r8.b     // Catch:{ all -> 0x02b8 }
            android.database.sqlite.SQLiteDatabase r19 = r8.getReadableDatabase()     // Catch:{ all -> 0x02b8 }
            java.lang.String[] r8 = new java.lang.String[r14]     // Catch:{ all -> 0x02b8 }
            r8[r3] = r0     // Catch:{ all -> 0x02b8 }
            r16 = 1
            r8[r16] = r6     // Catch:{ all -> 0x02b8 }
            java.lang.String r20 = "plus_profiles"
            r21 = 0
            java.lang.String r22 = "accountName=? AND packageName=?"
            r24 = 0
            r25 = 0
            r26 = 0
            r23 = r8
            android.database.Cursor r6 = r19.query(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x02b8 }
            r7.release()     // Catch:{ VolleyError -> 0x02c4, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            java.lang.String r7 = "profileJson"
            java.lang.String r8 = "updated"
            if (r6 == 0) goto L_0x0209
            boolean r0 = r6.moveToFirst()     // Catch:{ all -> 0x0204 }
            if (r0 == 0) goto L_0x0200
            int r0 = r6.getColumnIndex(r8)     // Catch:{ all -> 0x0204 }
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0204 }
            long r19 = r6.getLong(r0)     // Catch:{ all -> 0x0204 }
            long r17 = r17 - r19
            int r0 = r6.getColumnIndex(r7)     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = r6.getString(r0)     // Catch:{ all -> 0x0204 }
            r19 = 3600000(0x36ee80, double:1.7786363E-317)
            int r21 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r21 > 0) goto L_0x0200
            r19 = 0
            int r21 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r21 <= 0) goto L_0x0200
            boolean r17 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0204 }
            if (r17 != 0) goto L_0x0200
            com.google.android.gms.common.server.response.SafeParcelResponse r3 = new com.google.android.gms.common.server.response.SafeParcelResponse     // Catch:{ all -> 0x0204 }
            java.lang.Class<com.google.android.gms.plus.internal.model.people.PersonEntity> r18 = com.google.android.gms.plus.internal.model.people.PersonEntity.class
            com.google.android.gms.common.server.response.FieldMappingDictionary r14 = com.google.android.gms.common.server.response.SafeParcelResponse.a((java.lang.Class) r18)     // Catch:{ all -> 0x0204 }
            java.lang.String r13 = r14.c     // Catch:{ all -> 0x0204 }
            r3.<init>(r14, r13)     // Catch:{ all -> 0x0204 }
            jas r13 = new jas     // Catch:{ all -> 0x0204 }
            r13.<init>()     // Catch:{ all -> 0x0204 }
            r13.a((java.lang.String) r0, (defpackage.jag) r3)     // Catch:{ jaq -> 0x01f3 }
            android.os.Parcel r0 = r3.b()     // Catch:{ jaq -> 0x01f3 }
            byte[] r0 = r0.marshall()     // Catch:{ jaq -> 0x01f3 }
            r6.close()     // Catch:{ VolleyError -> 0x02c4, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            r7 = r0
            goto L_0x02ff
        L_0x01f3:
            r0 = move-exception
            r3 = 6
            boolean r13 = android.util.Log.isLoggable(r11, r3)     // Catch:{ all -> 0x0204 }
            if (r13 == 0) goto L_0x0200
            java.lang.String r3 = "Unable to parse the cached profile data"
            android.util.Log.e(r11, r3, r0)     // Catch:{ all -> 0x0204 }
        L_0x0200:
            r6.close()     // Catch:{ VolleyError -> 0x02c4, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            goto L_0x0209
        L_0x0204:
            r0 = move-exception
            r6.close()     // Catch:{ VolleyError -> 0x02c4, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            throw r0     // Catch:{ VolleyError -> 0x02c4, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
        L_0x0209:
            java.lang.Class<com.google.android.gms.plus.internal.model.people.PersonEntity> r0 = com.google.android.gms.plus.internal.model.people.PersonEntity.class
            com.google.android.gms.common.server.response.FieldMappingDictionary r0 = com.google.android.gms.common.server.response.SafeParcelResponse.a((java.lang.Class) r0)     // Catch:{ VolleyError -> 0x02a2, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            zdd r3 = r4.a     // Catch:{ VolleyError -> 0x02a2, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            java.lang.String r4 = "me"
            java.lang.Class<com.google.android.gms.common.server.response.SafeParcelResponse> r6 = com.google.android.gms.common.server.response.SafeParcelResponse.class
            jag r0 = r3.a(r2, r4, r6, r0)     // Catch:{ VolleyError -> 0x02a2, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            com.google.android.gms.common.server.response.SafeParcelResponse r0 = (com.google.android.gms.common.server.response.SafeParcelResponse) r0     // Catch:{ VolleyError -> 0x02a2, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            android.os.Parcelable$Creator r3 = com.google.android.gms.plus.internal.model.people.PersonEntity.CREATOR     // Catch:{ VolleyError -> 0x02a2, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r3 = r0.a((android.os.Parcelable.Creator) r3)     // Catch:{ VolleyError -> 0x02a2, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            com.google.android.gms.plus.internal.model.people.PersonEntity r3 = (com.google.android.gms.plus.internal.model.people.PersonEntity) r3     // Catch:{ VolleyError -> 0x02a2, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            java.lang.String r3 = r3.toString()     // Catch:{ VolleyError -> 0x02a2, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            java.lang.String r4 = r2.b()     // Catch:{ VolleyError -> 0x02a2, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ VolleyError -> 0x02a2, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            r11 = 3
            r6.<init>(r11)     // Catch:{ VolleyError -> 0x02a2, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            java.lang.String r11 = "accountName"
            r6.put(r11, r4)     // Catch:{ VolleyError -> 0x02a2, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            java.lang.String r11 = "packageName"
            java.lang.String r13 = r2.e     // Catch:{ VolleyError -> 0x02a2, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            r6.put(r11, r13)     // Catch:{ VolleyError -> 0x02a2, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            r6.put(r7, r3)     // Catch:{ VolleyError -> 0x02a2, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            java.lang.String r3 = r2.e     // Catch:{ VolleyError -> 0x02a2, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            android.content.ContentProviderClient r7 = r5.acquireContentProviderClient(r12)     // Catch:{ VolleyError -> 0x02a2, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            com.google.android.chimera.ContentProvider r11 = com.google.android.chimera.ContentProvider.getLocalContentProvider(r7)     // Catch:{ all -> 0x029a }
            com.google.android.gms.plus.provider.PlusChimeraContentProvider r11 = (com.google.android.gms.plus.provider.PlusChimeraContentProvider) r11     // Catch:{ all -> 0x029a }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x029a }
            r12.<init>(r6)     // Catch:{ all -> 0x029a }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x029a }
            java.lang.Long r6 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x029a }
            r12.put(r8, r6)     // Catch:{ all -> 0x029a }
            zai r6 = r11.b     // Catch:{ all -> 0x029a }
            android.database.sqlite.SQLiteDatabase r6 = r6.getWritableDatabase()     // Catch:{ all -> 0x029a }
            r6.beginTransactionWithListener(r11)     // Catch:{ all -> 0x029a }
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ all -> 0x0292 }
            r11 = 0
            r8[r11] = r4     // Catch:{ all -> 0x0292 }
            r4 = 1
            r8[r4] = r3     // Catch:{ all -> 0x0292 }
            java.lang.String r3 = "accountName=? AND packageName=?"
            int r3 = r6.update(r10, r12, r3, r8)     // Catch:{ all -> 0x0292 }
            if (r3 != 0) goto L_0x027b
            r3 = 0
            r6.insert(r10, r3, r12)     // Catch:{ all -> 0x0290 }
            goto L_0x027c
        L_0x027b:
            r3 = 0
        L_0x027c:
            r6.setTransactionSuccessful()     // Catch:{ all -> 0x0290 }
            r6.endTransaction()     // Catch:{ all -> 0x0298 }
            r7.release()     // Catch:{ VolleyError -> 0x02a0, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            android.os.Parcel r0 = r0.b()     // Catch:{ VolleyError -> 0x02a0, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            byte[] r0 = r0.marshall()     // Catch:{ VolleyError -> 0x02a0, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            r7 = r0
            goto L_0x02ff
        L_0x0290:
            r0 = move-exception
            goto L_0x0294
        L_0x0292:
            r0 = move-exception
            r3 = 0
        L_0x0294:
            r6.endTransaction()     // Catch:{ all -> 0x0298 }
            throw r0     // Catch:{ all -> 0x0298 }
        L_0x0298:
            r0 = move-exception
            goto L_0x029c
        L_0x029a:
            r0 = move-exception
            r3 = 0
        L_0x029c:
            r7.release()     // Catch:{ VolleyError -> 0x02a0, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            throw r0     // Catch:{ VolleyError -> 0x02a0, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
        L_0x02a0:
            r0 = move-exception
            goto L_0x02a4
        L_0x02a2:
            r0 = move-exception
            r3 = 0
        L_0x02a4:
            com.android.volley.NetworkResponse r4 = r0.networkResponse     // Catch:{ VolleyError -> 0x02be, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            if (r4 == 0) goto L_0x02b7
            int r4 = r4.statusCode     // Catch:{ VolleyError -> 0x02be, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            r6 = 400(0x190, float:5.6E-43)
            if (r4 < r6) goto L_0x02b7
            java.lang.String r4 = r2.a()     // Catch:{ VolleyError -> 0x02be, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            java.lang.String r6 = r2.e     // Catch:{ VolleyError -> 0x02be, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            defpackage.zaj.a(r5, r4, r6)     // Catch:{ VolleyError -> 0x02be, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
        L_0x02b7:
            throw r0     // Catch:{ VolleyError -> 0x02be, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
        L_0x02b8:
            r0 = move-exception
            r3 = 0
            r7.release()     // Catch:{ VolleyError -> 0x02be, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
            throw r0     // Catch:{ VolleyError -> 0x02be, UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0 }
        L_0x02be:
            r0 = move-exception
            goto L_0x02c6
        L_0x02c0:
            r0 = move-exception
            goto L_0x02ca
        L_0x02c2:
            r0 = move-exception
            goto L_0x02e2
        L_0x02c4:
            r0 = move-exception
            r3 = 0
        L_0x02c6:
            throw r0     // Catch:{ UserRecoverableAuthException -> 0x02c2, eif -> 0x02c0, VolleyError -> 0x02c7 }
        L_0x02c7:
            r0 = move-exception
            r7 = r3
            goto L_0x02ff
        L_0x02ca:
            java.lang.String r0 = r2.a()
            boolean r0 = r15.equals(r0)
            com.google.android.gms.common.internal.ClientContext r2 = r1.b
            boolean r3 = r1.i
            com.google.android.gms.common.ConnectionResult r0 = defpackage.zaw.a((android.content.Context) r9, (com.google.android.gms.common.internal.ClientContext) r2, (boolean) r0, (boolean) r3)
            r1.a((android.content.Context) r9, (com.google.android.gms.common.ConnectionResult) r0)
            r2 = 0
            byte[] r0 = new byte[r2]
            r7 = r0
            goto L_0x02ff
        L_0x02e2:
            yuf r3 = new yuf
            r3.<init>(r9, r2)
            android.content.Intent r0 = r0.a()
            r3.b = r0
            android.content.Intent r0 = r3.a()
            java.lang.String r2 = r1.c
            r3 = 6
            com.google.android.gms.common.ConnectionResult r0 = defpackage.zaw.a((android.content.Context) r9, (java.lang.String) r2, (int) r3, (android.content.Intent) r0)
            r1.a((android.content.Context) r9, (com.google.android.gms.common.ConnectionResult) r0)
            r2 = 0
            byte[] r0 = new byte[r2]
            r7 = r0
        L_0x02ff:
            if (r7 != 0) goto L_0x0302
            goto L_0x0308
        L_0x0302:
            int r0 = r7.length
            if (r0 != 0) goto L_0x0308
            return
        L_0x0306:
            r3 = 0
            r7 = r3
        L_0x0308:
            com.google.android.gms.common.ConnectionResult r0 = com.google.android.gms.common.ConnectionResult.a
            java.lang.String r2 = r1.f
            com.google.android.gms.common.internal.ClientContext r3 = r1.a
            com.google.android.gms.common.internal.ClientContext r4 = r1.b
            zas r5 = new zas
            r5.<init>()
            android.os.IBinder r2 = com.google.android.gms.plus.service.PlusChimeraService.a(r2, r9, r3, r4, r5)
            r1.a(r9, r0, r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zck.a(android.content.Context, yrr):void");
    }
}
