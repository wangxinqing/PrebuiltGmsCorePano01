package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GoogleSignInOptions extends AbstractSafeParcelable implements ReflectedParcelable, ibj, ibl {
    public static final Parcelable.Creator CREATOR = new fvu();
    public static final Scope a = new Scope("profile");
    public static final Scope b = new Scope("email");
    public static final Scope c = new Scope("openid");
    public static final Scope d = new Scope("https://www.googleapis.com/auth/games_lite");
    public static final Scope e = new Scope("https://www.googleapis.com/auth/games");
    public static final GoogleSignInOptions f;
    public static Comparator r = new fvs();
    final int g;
    public final ArrayList h;
    public Account i;
    public boolean j;
    public final boolean k;
    public final boolean l;
    public String m;
    public String n;
    public ArrayList o;
    public String p;
    public Map q;

    static {
        fvt fvt = new fvt();
        fvt.b();
        fvt.a.add(a);
        f = fvt.a();
        fvt fvt2 = new fvt();
        fvt2.a(d, new Scope[0]);
        fvt2.a();
    }

    public GoogleSignInOptions(int i2, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3) {
        this.g = i2;
        this.h = arrayList;
        this.i = account;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = str;
        this.n = str2;
        this.o = new ArrayList(map.values());
        this.q = map;
        this.p = str3;
    }

    public static GoogleSignInOptions a(String str) {
        Account account;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        String optString = jSONObject.optString("accountName", (String) null);
        if (!TextUtils.isEmpty(optString)) {
            account = new Account(optString, "com.google");
        } else {
            account = null;
        }
        return new GoogleSignInOptions(3, new ArrayList(hashSet), account, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", (String) null), jSONObject.optString("hostedDomain", (String) null), new HashMap(), (String) null);
    }

    public final Scope[] b() {
        ArrayList arrayList = this.h;
        return (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r4.i == null) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x007e
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x007d }
            java.util.ArrayList r1 = r3.o     // Catch:{ ClassCastException -> 0x007d }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x007d }
            if (r1 > 0) goto L_0x007c
            java.util.ArrayList r1 = r4.o     // Catch:{ ClassCastException -> 0x007d }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x007d }
            if (r1 > 0) goto L_0x007c
            java.util.ArrayList r1 = r3.h     // Catch:{ ClassCastException -> 0x007d }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x007d }
            java.util.ArrayList r2 = r4.a()     // Catch:{ ClassCastException -> 0x007d }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x007d }
            if (r1 != r2) goto L_0x007c
            java.util.ArrayList r1 = r3.h     // Catch:{ ClassCastException -> 0x007d }
            java.util.ArrayList r2 = r4.a()     // Catch:{ ClassCastException -> 0x007d }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x007d }
            if (r1 == 0) goto L_0x007c
            android.accounts.Account r1 = r3.i     // Catch:{ ClassCastException -> 0x007d }
            if (r1 == 0) goto L_0x003e
            android.accounts.Account r2 = r4.i     // Catch:{ ClassCastException -> 0x007d }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x007d }
            if (r1 == 0) goto L_0x007c
            goto L_0x0042
        L_0x003e:
            android.accounts.Account r1 = r4.i     // Catch:{ ClassCastException -> 0x007d }
            if (r1 != 0) goto L_0x007c
        L_0x0042:
            java.lang.String r1 = r3.m     // Catch:{ ClassCastException -> 0x007d }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x007d }
            if (r1 == 0) goto L_0x0053
            java.lang.String r1 = r4.m     // Catch:{ ClassCastException -> 0x007d }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x007d }
            if (r1 == 0) goto L_0x007c
            goto L_0x005e
        L_0x0053:
            java.lang.String r1 = r3.m     // Catch:{ ClassCastException -> 0x007d }
            java.lang.String r2 = r4.m     // Catch:{ ClassCastException -> 0x007d }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x007d }
            if (r1 != 0) goto L_0x005e
            goto L_0x007c
        L_0x005e:
            boolean r1 = r3.l     // Catch:{ ClassCastException -> 0x007d }
            boolean r2 = r4.l     // Catch:{ ClassCastException -> 0x007d }
            if (r1 != r2) goto L_0x007c
            boolean r1 = r3.j     // Catch:{ ClassCastException -> 0x007d }
            boolean r2 = r4.j     // Catch:{ ClassCastException -> 0x007d }
            if (r1 != r2) goto L_0x007c
            boolean r1 = r3.k     // Catch:{ ClassCastException -> 0x007d }
            boolean r2 = r4.k     // Catch:{ ClassCastException -> 0x007d }
            if (r1 != r2) goto L_0x007c
            java.lang.String r1 = r3.p     // Catch:{ ClassCastException -> 0x007d }
            java.lang.String r4 = r4.p     // Catch:{ ClassCastException -> 0x007d }
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch:{ ClassCastException -> 0x007d }
            if (r4 == 0) goto L_0x007c
            r4 = 1
            return r4
        L_0x007c:
            return r0
        L_0x007d:
            r4 = move-exception
        L_0x007e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((Scope) arrayList2.get(i2)).b);
        }
        Collections.sort(arrayList);
        fwk fwk = new fwk();
        fwk.a((Object) arrayList);
        fwk.a((Object) this.i);
        fwk.a((Object) this.m);
        fwk.a(this.l);
        fwk.a(this.j);
        fwk.a(this.k);
        fwk.a((Object) this.p);
        return fwk.a;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.g);
        ivx.c(parcel, 2, a(), false);
        ivx.a(parcel, 3, this.i, i2, false);
        ivx.a(parcel, 4, this.j);
        ivx.a(parcel, 5, this.k);
        ivx.a(parcel, 6, this.l);
        ivx.a(parcel, 7, this.m, false);
        ivx.a(parcel, 8, this.n, false);
        ivx.c(parcel, 9, this.o, false);
        ivx.a(parcel, 10, this.p, false);
        ivx.b(parcel, a2);
    }

    public static Map a(List list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) list.get(i2);
                hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.b), googleSignInOptionsExtensionParcelable);
            }
        }
        return hashMap;
    }

    public final ArrayList a() {
        return new ArrayList(this.h);
    }
}
