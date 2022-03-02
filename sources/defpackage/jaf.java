package defpackage;

import android.content.ContentValues;

/* renamed from: jaf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class jaf extends jag {
    public final ContentValues a = new ContentValues();

    /* access modifiers changed from: protected */
    public final void a(String str, double d) {
        this.a.put(str, Double.valueOf(d));
    }

    /* access modifiers changed from: protected */
    public final Object c(String str) {
        return this.a.get(str);
    }

    /* access modifiers changed from: protected */
    public final boolean d(String str) {
        return this.a.containsKey(str);
    }

    /* access modifiers changed from: protected */
    public final void a(String str, float f) {
        this.a.put(str, Float.valueOf(f));
    }

    /* access modifiers changed from: protected */
    public final void a(String str, int i) {
        this.a.put(str, Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    public final void a(String str, long j) {
        this.a.put(str, Long.valueOf(j));
    }

    /* access modifiers changed from: protected */
    public final void a(String str, String str2) {
        this.a.put(str, str2);
    }

    /* access modifiers changed from: protected */
    public final void a(String str, boolean z) {
        this.a.put(str, Boolean.valueOf(z));
    }

    /* access modifiers changed from: protected */
    public final void a(String str, byte[] bArr) {
        this.a.put(str, bArr);
    }
}
