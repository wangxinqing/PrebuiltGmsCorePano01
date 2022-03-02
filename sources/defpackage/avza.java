package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: avza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avza {
    public final List a = new ArrayList(20);

    private static final void d(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("name == null");
        } else if (!str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= 31 || charAt >= 127) {
                    throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", new Object[]{Integer.valueOf(charAt), Integer.valueOf(i), str}));
                }
            }
            if (str2 != null) {
                int length2 = str2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    char charAt2 = str2.charAt(i2);
                    if (charAt2 <= 31 || charAt2 >= 127) {
                        throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header value: %s", new Object[]{Integer.valueOf(charAt2), Integer.valueOf(i2), str2}));
                    }
                }
                return;
            }
            throw new IllegalArgumentException("value == null");
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }

    public final avzb a() {
        return new avzb(this);
    }

    public final void b(String str, String str2) {
        d(str, str2);
        a(str);
        a(str, str2);
    }

    public final void c(String str, String str2) {
        d(str, str2);
        a(str, str2);
    }

    public final void a(String str) {
        int i = 0;
        while (i < this.a.size()) {
            if (str.equalsIgnoreCase((String) this.a.get(i))) {
                this.a.remove(i);
                this.a.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public final void a(String str, String str2) {
        this.a.add(str);
        this.a.add(str2.trim());
    }
}
