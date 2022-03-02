package defpackage;

import java.io.Reader;
import java.nio.CharBuffer;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: anng  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anng {
    public final Queue a = new LinkedList();
    private final Readable b;
    private final Reader c;
    private final CharBuffer d;
    private final char[] e;
    private final annf f = new annf(this);

    public anng(Readable readable) {
        CharBuffer allocate = CharBuffer.allocate(2048);
        this.d = allocate;
        this.e = allocate.array();
        amrl.a((Object) readable);
        this.b = readable;
        this.c = (Reader) readable;
    }

    public final String a() {
        int i;
        while (true) {
            if (this.a.peek() != null) {
                break;
            }
            this.d.clear();
            Reader reader = this.c;
            int i2 = 0;
            if (reader != null) {
                char[] cArr = this.e;
                i = reader.read(cArr, 0, cArr.length);
            } else {
                i = this.b.read(this.d);
            }
            if (i != -1) {
                annf annf = this.f;
                char[] cArr2 = this.e;
                if (annf.b && i > 0) {
                    char c2 = cArr2[0];
                    annf.a();
                    if (c2 == 10) {
                        i2 = 1;
                    }
                }
                int i3 = i2;
                while (i2 < i) {
                    char c3 = cArr2[i2];
                    if (c3 == 10) {
                        annf.a.append(cArr2, i3, i2 - i3);
                        annf.a();
                        i3 = i2 + 1;
                    } else if (c3 == 13) {
                        annf.a.append(cArr2, i3, i2 - i3);
                        annf.b = true;
                        int i4 = i2 + 1;
                        if (i4 < i) {
                            char c4 = cArr2[i4];
                            annf.a();
                            if (c4 == 10) {
                                i2 = i4;
                            }
                        }
                        i3 = i2 + 1;
                    }
                    i2++;
                }
                annf.a.append(cArr2, i3, i - i3);
            } else {
                annf annf2 = this.f;
                if (annf2.b || annf2.a.length() > 0) {
                    annf2.a();
                }
            }
        }
        return (String) this.a.poll();
    }
}
