package defpackage;

import android.content.ContentValues;

/* renamed from: knh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class knh extends kqi {
    public static final /* synthetic */ int g = 0;
    public final String a;
    public String b;
    public String c;
    public lro d;
    public long e;
    public final long f;

    public knh(kng kng, boolean z) {
        super(kng.a, knk.a, z);
        this.a = kng.b;
        this.e = kng.f;
        this.f = kng.g;
        this.b = kng.c;
        this.c = kng.d;
        this.d = kng.e;
        boolean z2 = true;
        if (this.b == null && this.c == null) {
            z2 = false;
        }
        iva.b(z2, "At least one of internalFilename or sharedFilename must be set.");
    }

    public static kng a(kqg kqg, String str, long j, long j2) {
        return new kng(kqg, str, j, j2);
    }

    /* access modifiers changed from: protected */
    public final void b(ContentValues contentValues) {
        contentValues.put(knj.CONTENT_HASH.k.a(), this.a);
        contentValues.put(knj.LAST_ACCESSED.k.a(), Long.valueOf(this.e));
        contentValues.put(knj.SIZE_BYTES.k.a(), Long.valueOf(this.f));
        if (this.b != null) {
            contentValues.put(knj.INTERNAL_FILE_NAME.k.a(), this.b);
        } else {
            contentValues.putNull(knj.INTERNAL_FILE_NAME.k.a());
        }
        if (this.c != null) {
            contentValues.put(knj.SHARED_FILE_NAME.k.a(), this.c);
        } else {
            contentValues.putNull(knj.SHARED_FILE_NAME.k.a());
        }
        if (this.d != null) {
            contentValues.put(knj.ENCRYPTION_KEY.k.a(), this.d.a.getEncoded());
            contentValues.put(knj.ENCRYPTION_ALGORITHM.k.a(), this.d.a.getAlgorithm());
            lro lro = this.d;
            if (lro.b == null || lro.c == null) {
                contentValues.putNull(knj.ENCRYPTION_ALGORITHM_PARAMETERS.k.a());
                contentValues.putNull(knj.ENCRYPTION_ALGORITHM_IV.k.a());
                return;
            }
            contentValues.put(knj.ENCRYPTION_ALGORITHM_PARAMETERS.k.a(), this.d.b);
            contentValues.put(knj.ENCRYPTION_ALGORITHM_IV.k.a(), this.d.c);
            return;
        }
        contentValues.putNull(knj.ENCRYPTION_KEY.k.a());
        contentValues.putNull(knj.ENCRYPTION_ALGORITHM.k.a());
        contentValues.putNull(knj.ENCRYPTION_ALGORITHM_PARAMETERS.k.a());
        contentValues.putNull(knj.ENCRYPTION_ALGORITHM_IV.k.a());
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String valueOf = String.valueOf(this.d);
        long j = this.e;
        long j2 = this.f;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 145 + length2 + String.valueOf(str3).length() + String.valueOf(valueOf).length());
        sb.append("FileContent [contentHash=");
        sb.append(str);
        sb.append(", internalFilename=");
        sb.append(str2);
        sb.append(", sharedFilename=");
        sb.append(str3);
        sb.append(", encryptionSpec=");
        sb.append(valueOf);
        sb.append(", lastAccessedTime=");
        sb.append(j);
        sb.append(", size=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    public final kqy a() {
        return knj.CONTENT_HASH.k.b(this.a);
    }

    public final void a(String str) {
        if (str == null) {
            iva.a(this.c != null, (Object) "internal and shared filenames cannot both be null");
        }
        this.b = str;
    }
}
