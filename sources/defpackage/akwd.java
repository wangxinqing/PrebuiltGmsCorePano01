package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.concurrent.TimeoutException;

/* renamed from: akwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class akwd extends nis {
    protected PlacesParams a;
    private final akuy b;
    private final akhj c;
    private final akvn d;
    private final String e;
    private int f = 0;

    public akwd(int i, String str, PlacesParams placesParams, akuy akuy, akvn akvn, String str2, akhj akhj) {
        super(i, str);
        iva.a((Object) placesParams);
        iva.a((Object) akuy);
        iva.a((Object) akvn);
        iva.a((Object) akhj);
        this.a = placesParams;
        this.b = akuy;
        this.d = akvn;
        this.c = akhj;
        this.e = str2;
        if (!TextUtils.isEmpty(str2)) {
            if (azcx.b()) {
                this.f = this.b.a(placesParams).a(this.e, false);
            } else {
                this.f = this.b.a(placesParams).a(this.e);
            }
        }
        if (this.f != -1) {
            return;
        }
        if (!azbe.a.a().a() || !"com.google.android.gms".equals(akuy.b)) {
            String valueOf = String.valueOf(this.e);
            throw new SecurityException(valueOf.length() == 0 ? new String("Caller doesn't have access to ") : "Caller doesn't have access to ".concat(valueOf));
        } else {
            this.f = -2;
        }
    }

    private static final PlacesParams a(PlacesParams placesParams) {
        return new PlacesParams(placesParams.b, placesParams.c, (String) null, placesParams.e, placesParams.f, placesParams.g);
    }

    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract int b();

    public abstract aoei c();

    /* access modifiers changed from: protected */
    public String[] d() {
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean e() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final aksc f() {
        return this.b.a(this.a, this.c);
    }

    /* access modifiers changed from: protected */
    public final aktg g() {
        return this.b.b(this.a, this.c);
    }

    protected static nja a(Exception exc) {
        if (exc instanceof eif) {
            return new akwc(8);
        }
        if (exc instanceof TimeoutException) {
            return new akwc(7);
        }
        if (exc instanceof VolleyError) {
            return new akwc(aksc.a((VolleyError) exc));
        }
        if (exc instanceof babk) {
            return new akwc(7);
        }
        Log.wtf("Places", "Unexpected exception in convertServerException", exc);
        throw new RuntimeException(exc);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0172  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r11) {
        /*
            r10 = this;
            com.google.android.gms.location.places.internal.PlacesParams r0 = r10.a
            java.lang.String r0 = r0.b
            akuy r1 = r10.b
            java.lang.String r1 = r1.b
            java.lang.String r2 = "com.google.android.gms"
            boolean r3 = r1.equals(r2)
            r4 = 13
            if (r3 == 0) goto L_0x0013
            goto L_0x0019
        L_0x0013:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0188
        L_0x0019:
            com.google.android.gms.location.places.internal.PlacesParams r0 = r10.a
            akuy r1 = r10.b
            java.lang.String r1 = r1.b
            int r0 = r0.g
            if (r0 == 0) goto L_0x0032
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x002a
            goto L_0x0032
        L_0x002a:
            nja r11 = new nja
            java.lang.String r0 = "requestSource may only be set by com.google.android.gms"
            r11.<init>(r4, r0)
            throw r11
        L_0x0032:
            int r0 = r10.f
            r1 = -2
            if (r0 != r1) goto L_0x0055
            nja r11 = new nja
            java.lang.String r0 = r10.e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Caller doesn't have access to "
            int r2 = r0.length()
            if (r2 != 0) goto L_0x004d
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x0051
        L_0x004d:
            java.lang.String r0 = r1.concat(r0)
        L_0x0051:
            r11.<init>(r4, r0)
            throw r11
        L_0x0055:
            java.lang.String[] r0 = r10.d()
            r1 = 3
            r3 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0071
            int r6 = r0.length
            r7 = 0
        L_0x0060:
            if (r7 >= r6) goto L_0x0071
            r8 = r0[r7]
            akuy r9 = r10.b
            java.lang.String r9 = r9.b
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x00c9
            int r7 = r7 + 1
            goto L_0x0060
        L_0x0071:
            int r0 = r10.a()
            if (r0 == r5) goto L_0x00c9
            if (r0 == r3) goto L_0x00c0
            if (r0 != r1) goto L_0x00a3
            akvn r0 = r10.d
            akuy r6 = r10.b
            java.lang.String r6 = r6.b
            r0.a((android.content.Context) r11, (java.lang.String) r6)
            azcf r11 = defpackage.azcf.a
            azcg r11 = r11.a()
            boolean r11 = r11.j()
            if (r11 != 0) goto L_0x00c9
            akuy r11 = r10.b
            java.lang.String r11 = r11.b
            boolean r11 = r2.equals(r11)
            if (r11 == 0) goto L_0x009b
            goto L_0x00c9
        L_0x009b:
            nja r11 = new nja
            java.lang.String r0 = "This API is for internal (GMS Core) use only."
            r11.<init>(r4, r0)
            throw r11
        L_0x00a3:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            int r0 = r10.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 30
            r1.<init>(r2)
            java.lang.String r2 = "Unknown visibility "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.<init>(r0)
            throw r11
        L_0x00c0:
            akvn r0 = r10.d
            akuy r2 = r10.b
            java.lang.String r2 = r2.b
            r0.a((android.content.Context) r11, (java.lang.String) r2)
        L_0x00c9:
            int r11 = r10.b()
            if (r11 == r5) goto L_0x0126
            if (r11 == r3) goto L_0x0110
            if (r11 != r1) goto L_0x00f3
            com.google.android.gms.location.places.internal.PlacesParams r11 = r10.a
            java.lang.String r11 = r11.d
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x00e9
            akvn r11 = r10.d
            com.google.android.gms.location.places.internal.PlacesParams r0 = r10.a
            java.lang.String r1 = r0.b
            java.lang.String r0 = r0.e
            r11.a((java.lang.String) r1, (java.lang.String) r0)
            goto L_0x012e
        L_0x00e9:
            nja r11 = new nja
            r0 = 10
            java.lang.String r1 = "Account name can't be empty!"
            r11.<init>(r0, r1)
            throw r11
        L_0x00f3:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            int r0 = r10.b()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 35
            r1.<init>(r2)
            java.lang.String r2 = "Unknown personalization "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.<init>(r0)
            throw r11
        L_0x0110:
            akvn r11 = r10.d     // Catch:{ nja -> 0x011c }
            com.google.android.gms.location.places.internal.PlacesParams r0 = r10.a     // Catch:{ nja -> 0x011c }
            java.lang.String r1 = r0.b     // Catch:{ nja -> 0x011c }
            java.lang.String r0 = r0.e     // Catch:{ nja -> 0x011c }
            r11.a((java.lang.String) r1, (java.lang.String) r0)     // Catch:{ nja -> 0x011c }
            goto L_0x012e
        L_0x011c:
            r11 = move-exception
            com.google.android.gms.location.places.internal.PlacesParams r11 = r10.a
            com.google.android.gms.location.places.internal.PlacesParams r11 = a((com.google.android.gms.location.places.internal.PlacesParams) r11)
            r10.a = r11
            goto L_0x012e
        L_0x0126:
            com.google.android.gms.location.places.internal.PlacesParams r11 = r10.a
            com.google.android.gms.location.places.internal.PlacesParams r11 = a((com.google.android.gms.location.places.internal.PlacesParams) r11)
            r10.a = r11
        L_0x012e:
            boolean r11 = defpackage.jkr.g()
            if (r11 == 0) goto L_0x0172
            azbt r11 = defpackage.azbt.a
            azbu r11 = r11.a()
            boolean r11 = r11.a()
            if (r11 == 0) goto L_0x0172
            boolean r11 = r10.e()
            if (r11 == 0) goto L_0x0172
            akuy r11 = r10.b
            com.google.android.gms.location.places.internal.PlacesParams r0 = r10.a
            ixk r11 = r11.a((com.google.android.gms.location.places.internal.PlacesParams) r0)
            jhr r11 = r11.b
            akuy r0 = r10.b
            com.google.android.gms.location.places.internal.PlacesParams r1 = r10.a
            java.lang.String r1 = r1.b
            int r0 = r0.a((java.lang.String) r1)
            com.google.android.gms.location.places.internal.PlacesParams r1 = r10.a
            java.lang.String r1 = r1.b
            java.lang.String r2 = "android:monitor_location"
            int r11 = r11.e(r2, r0, r1)
            r0 = 4
            if (r11 == r0) goto L_0x0168
            goto L_0x0172
        L_0x0168:
            nja r11 = new nja
            r0 = 9009(0x2331, float:1.2624E-41)
            java.lang.String r1 = "Caller doesn't have required background location permission."
            r11.<init>(r0, r1)
            throw r11
        L_0x0172:
            boolean r11 = defpackage.azbe.b()
            if (r11 == 0) goto L_0x0187
            aoei r11 = r10.c()
            if (r11 == 0) goto L_0x0187
            akhj r0 = r10.c
            anui r11 = defpackage.akig.a((defpackage.aoei) r11)
            r0.a(r11)
        L_0x0187:
            return
        L_0x0188:
            nja r11 = new nja
            java.lang.String r0 = "Non-GMS Core client trying to spoof their package name"
            r11.<init>(r4, r0)
            goto L_0x0191
        L_0x0190:
            throw r11
        L_0x0191:
            goto L_0x0190
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akwd.a(android.content.Context):void");
    }
}
