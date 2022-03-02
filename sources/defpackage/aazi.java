package defpackage;

import com.google.android.gms.security.verifier.ApkUploadEntry;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: aazi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aazi implements Iterator {
    final /* synthetic */ aazk a;
    private ApkUploadEntry b = null;
    private boolean c = false;
    private ApkUploadEntry d = null;

    public aazi(aazk aazk) {
        this.a = aazk;
    }

    private final void a() {
        long j;
        if (!this.c) {
            ApkUploadEntry apkUploadEntry = this.b;
            if (apkUploadEntry != null) {
                j = apkUploadEntry.a;
            } else {
                j = -1;
            }
            this.d = this.a.a(j);
            this.c = true;
        }
    }

    public final boolean hasNext() {
        a();
        return this.d != null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        a();
        ApkUploadEntry apkUploadEntry = this.d;
        if (apkUploadEntry != null) {
            this.b = apkUploadEntry;
            this.d = null;
            this.c = false;
            return apkUploadEntry;
        }
        throw new NoSuchElementException();
    }
}
