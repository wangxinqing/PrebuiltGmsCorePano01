package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;

/* renamed from: aowy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aowy implements aoul {
    private final SharedPreferences a;
    private final String b;

    public aowy(Context context, String str, String str2) {
        this.b = str;
        this.a = context.getApplicationContext().getSharedPreferences(str2, 0);
    }

    public final aoza a() {
        throw null;
    }

    public final byte[] b() {
        try {
            String string = this.a.getString(this.b, (String) null);
            if (string != null) {
                return apcq.a(string);
            }
            throw new IOException(String.format("can't read keyset; the pref value %s does not exist", new Object[]{this.b}));
        } catch (ClassCastException | IllegalArgumentException e) {
            throw new IOException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[]{this.b}), e);
        }
    }
}
