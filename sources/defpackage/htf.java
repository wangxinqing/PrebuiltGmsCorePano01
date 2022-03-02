package defpackage;

import java.util.Arrays;

/* renamed from: htf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class htf implements htg {
    public final void a() {
    }

    public final void a(int i) {
    }

    public final void a(avtn avtn) {
    }

    public final void a(avtn avtn, int i) {
    }

    public final void a(avtn avtn, long j) {
    }

    public final void a(hvg hvg) {
    }

    public final void b(avtn avtn, int i) {
    }

    public final void b(avtn avtn, long j) {
    }

    public final void c(avtn avtn, long j) {
    }

    public final void close() {
    }

    public final void a(int i, String str) {
        StringBuilder sb = new StringBuilder(38);
        sb.append("Get auth token with status ");
        sb.append(i);
        sb.toString();
    }

    public final void a(int i, byte[] bArr) {
        String arrays = Arrays.toString(bArr);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 69);
        sb.append("Failed to parse LogResponse with status code: ");
        sb.append(i);
        sb.append(" and bytes: ");
        sb.append(arrays);
        sb.toString();
    }

    public final void a(hva hva) {
        if (hva != null) {
            hva.toString();
        }
    }

    public final void a(String str) {
        if (str.length() == 0) {
            new String("Increment counter of ");
        } else {
            "Increment counter of ".concat(str);
        }
    }
}
