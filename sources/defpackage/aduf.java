package defpackage;

import com.google.android.gms.userlocation.EstimationOptions;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;

/* renamed from: aduf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aduf {
    public int a = 2;
    public boolean b = true;
    public boolean c = true;
    private String d = null;
    private int e = 0;

    public final SemanticLocationEventRequest a() {
        if (this.e != 0) {
            int i = this.a;
            if (i != 2 && i != 1) {
                StringBuilder sb = new StringBuilder(29);
                sb.append("Invalid priority: 0");
                throw new IllegalArgumentException(sb.toString());
            } else if (!jlh.d(this.d)) {
                return new SemanticLocationEventRequest(this.d, this.a, new EstimationOptions(this.b, this.c), this.e);
            } else {
                String valueOf = String.valueOf(this.d);
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid request ID: ") : "Invalid request ID: ".concat(valueOf));
            }
        } else {
            throw new IllegalArgumentException("At least one event type must be added");
        }
    }

    public final void a(int i) {
        this.e = i | this.e;
    }

    public final void a(String str) {
        boolean z;
        iva.a(str, (Object) "Request ID cannot be empty.");
        if (str.length() <= 30) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "Request ID cannot exceed length of 30");
        this.d = str;
    }
}
