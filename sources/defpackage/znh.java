package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: znh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class znh extends zni {
    private final zni[] a;
    private final int b;

    public znh(zni... zniArr) {
        this.a = zniArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            zni[] zniArr2 = this.a;
            if (i < zniArr2.length) {
                zni zni = zniArr2[i];
                if (zni != null) {
                    i2 += zni.d();
                }
                i++;
            } else {
                this.b = i2;
                return;
            }
        }
    }

    public final int a(int i) {
        int i2 = 0;
        while (true) {
            zni[] zniArr = this.a;
            if (i2 < zniArr.length) {
                zni zni = zniArr[i2];
                if (zni != null) {
                    if (i < zni.d()) {
                        return this.a[i2].a(i);
                    }
                    i -= this.a[i2].d();
                }
                i2++;
            } else {
                throw new IllegalStateException("Bad item index");
            }
        }
    }

    public final Object b(int i) {
        int i2 = 0;
        while (true) {
            zni[] zniArr = this.a;
            if (i2 < zniArr.length) {
                zni zni = zniArr[i2];
                if (zni != null) {
                    if (i < zni.d()) {
                        return this.a[i2].b(i);
                    }
                    i -= this.a[i2].d();
                }
                i2++;
            } else {
                throw new IllegalStateException("Bad item index");
            }
        }
    }

    public final int d() {
        return this.b;
    }

    public final View a(int i, View view, ViewGroup viewGroup, boolean z) {
        int i2 = 0;
        while (true) {
            zni[] zniArr = this.a;
            if (i2 < zniArr.length) {
                zni zni = zniArr[i2];
                if (zni != null) {
                    if (i < zni.d()) {
                        return this.a[i2].a(i, view, viewGroup, z);
                    }
                    i -= this.a[i2].d();
                }
                i2++;
            } else {
                throw new IllegalStateException("Bad item index");
            }
        }
    }

    public final void a(ArrayList arrayList, int i) {
        int i2 = 0;
        while (true) {
            zni[] zniArr = this.a;
            if (i2 < zniArr.length) {
                zni zni = zniArr[i2];
                if (zni != null) {
                    zni.a(arrayList, i);
                    i += this.a[i2].d();
                }
                i2++;
            } else {
                return;
            }
        }
    }
}
