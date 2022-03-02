package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: ahaa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahaa {
    public static final Pattern a = Pattern.compile("[a-z]+");
    static final Account b = agzv.a;
    public static final Set c = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"default", "unused", "special", "reserved", "shared", "virtual", "managed"})));
    public static final Set d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"files", "cache", "managed", "directboot-files", "directboot-cache", "external"})));

    public static agzz a(Context context) {
        return new agzz(context);
    }
}
