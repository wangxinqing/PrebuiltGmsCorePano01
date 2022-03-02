package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;

/* renamed from: akfl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akfl {
    public Intent.ShortcutIconResource a;
    public Uri b;
    public int c;
    public int d;
    public Context e;
    public int f;
    public Bitmap.Config g;
    private String h;

    public final String a() {
        String str;
        if (this.h == null) {
            Intent.ShortcutIconResource shortcutIconResource = this.a;
            if (shortcutIconResource != null) {
                String str2 = shortcutIconResource.packageName;
                String str3 = this.a.resourceName;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str3).length());
                sb.append(str2);
                sb.append("/");
                sb.append(str3);
                str = sb.toString();
            } else {
                str = this.b.toString();
            }
            this.h = str;
        }
        return this.h;
    }

    public final String toString() {
        Intent.ShortcutIconResource shortcutIconResource = this.a;
        if (shortcutIconResource != null) {
            String str = shortcutIconResource.packageName;
            String valueOf = String.valueOf(this.a);
            String valueOf2 = String.valueOf(this.b);
            int length = String.valueOf(str).length();
            StringBuilder sb = new StringBuilder(length + 30 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
            sb.append("PackageName: ");
            sb.append(str);
            sb.append(" Resource: ");
            sb.append(valueOf);
            sb.append(" URI: ");
            sb.append(valueOf2);
            return sb.toString();
        }
        String valueOf3 = String.valueOf(this.b);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 5);
        sb2.append("URI: ");
        sb2.append(valueOf3);
        return sb2.toString();
    }
}
