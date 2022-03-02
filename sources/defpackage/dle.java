package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: dle  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dle extends dkp {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;

    public final /* bridge */ /* synthetic */ void a(dkp dkp) {
        dle dle = (dle) dkp;
        if (!TextUtils.isEmpty(this.a)) {
            dle.a = this.a;
        }
        if (!TextUtils.isEmpty(this.b)) {
            dle.b = this.b;
        }
        if (!TextUtils.isEmpty(this.c)) {
            dle.c = this.c;
        }
        if (!TextUtils.isEmpty(this.d)) {
            dle.d = this.d;
        }
        if (!TextUtils.isEmpty(this.e)) {
            dle.e = this.e;
        }
        if (!TextUtils.isEmpty(this.f)) {
            dle.f = this.f;
        }
        if (!TextUtils.isEmpty(this.g)) {
            dle.g = this.g;
        }
        if (!TextUtils.isEmpty(this.h)) {
            dle.h = this.h;
        }
        if (!TextUtils.isEmpty(this.i)) {
            dle.i = this.i;
        }
        if (!TextUtils.isEmpty(this.j)) {
            dle.j = this.j;
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", this.a);
        hashMap.put("source", this.b);
        hashMap.put("medium", this.c);
        hashMap.put("keyword", this.d);
        hashMap.put("content", this.e);
        hashMap.put("id", this.f);
        hashMap.put("adNetworkId", this.g);
        hashMap.put("gclid", this.h);
        hashMap.put("dclid", this.i);
        hashMap.put("aclid", this.j);
        return dkp.a((Object) hashMap);
    }
}
