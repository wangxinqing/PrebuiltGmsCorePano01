package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: wul  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wul {
    public String a;
    public String b;
    public String c;
    private Boolean d;
    private final List e = new ArrayList();

    private static final void a(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append(str);
    }

    public final void a(Context context) {
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        try {
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(this.a)) {
                a(sb, "name");
            }
            if (TextUtils.isEmpty(this.b)) {
                a(sb, "consentText");
            }
            if (TextUtils.isEmpty(this.c)) {
                a(sb, "component");
            }
            if (this.e.isEmpty()) {
                a(sb, "at least one data source");
            }
            if (sb.length() <= 0) {
                wum wum = new wum(this.a, this.b, this.c, this.d, this.e);
                SharedPreferences sharedPreferences = context.getSharedPreferences("People-DebugUploaderService", 0);
                Set<String> stringSet = sharedPreferences.getStringSet("available_uploaders", new HashSet());
                stringSet.add(wum.a);
                try {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    String str = wum.a;
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(wum);
                    String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                    objectOutputStream.close();
                    byteArrayOutputStream.close();
                    edit.putString(str, encodeToString).putStringSet("available_uploaders", stringSet).commit();
                } catch (IOException e2) {
                    new Object[1][0] = wum.a;
                } catch (Throwable th) {
                    objectOutputStream.close();
                    byteArrayOutputStream.close();
                    throw th;
                }
            } else {
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb2.append("DebugUploader missing parameters: ");
                sb2.append(valueOf);
                sb2.append(".");
                throw new IllegalArgumentException(sb2.toString());
            }
        } catch (IllegalArgumentException e3) {
            Log.e("DebugUploader", "Could not register the debug uploader", e3);
        }
    }

    public final void a(wuk wuk) {
        this.e.add(wuk);
    }

    public final void a(boolean z) {
        this.d = Boolean.valueOf(z);
    }
}
