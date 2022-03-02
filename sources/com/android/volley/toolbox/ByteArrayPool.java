package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ByteArrayPool {
    protected static final Comparator BUF_COMPARATOR = new bfc();
    private final List a = new ArrayList();
    private final List b = new ArrayList(64);
    private int c = 0;
    private final int d;

    public ByteArrayPool(int i) {
        this.d = i;
    }

    private final synchronized void a() {
        while (this.c > this.d) {
            byte[] bArr = (byte[]) this.a.remove(0);
            this.b.remove(bArr);
            this.c -= bArr.length;
        }
    }

    public synchronized byte[] getBuf(int i) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            byte[] bArr = (byte[]) this.b.get(i2);
            int length = bArr.length;
            if (length >= i) {
                this.c -= length;
                this.b.remove(i2);
                this.a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    public synchronized void returnBuf(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= this.d) {
                this.a.add(bArr);
                int binarySearch = Collections.binarySearch(this.b, bArr, BUF_COMPARATOR);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.b.add(binarySearch, bArr);
                this.c += length;
                a();
            }
        }
    }
}
