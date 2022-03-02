package defpackage;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: aeqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeqn {
    public static final afgk f = new afgk(auke.b);
    public final awdn a;
    public final File b;
    public final String c;
    public final Pattern d;
    public final Object e = new Object();
    private final FilenameFilter g;

    public aeqn(awdn awdn, File file, String str) {
        this.a = awdn;
        this.b = file;
        this.c = str;
        StringBuilder sb = new StringBuilder(str.length() + 15);
        sb.append(str);
        sb.append("_([0-9A-F]{16})");
        this.d = Pattern.compile(sb.toString());
        this.g = new aeqm(this.d);
    }

    public final void a(int i) {
        String[] a2 = a();
        if (a2 != null) {
            for (int i2 = 0; i2 < a2.length - i; i2++) {
                File file = new File(this.b, a2[i2]);
                if (!file.delete()) {
                    String valueOf = String.valueOf(file);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
                    sb.append("Couldn't delete ");
                    sb.append(valueOf);
                    ((pia) this.a.a()).d(sb.toString(), new Object[0]);
                }
            }
        }
    }

    public final String[] a() {
        String[] list = this.b.list(this.g);
        if (list == null) {
            return null;
        }
        Arrays.sort(list);
        return list;
    }
}
