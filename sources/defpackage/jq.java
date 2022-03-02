package defpackage;

import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Bundle;

/* renamed from: jq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jq {
    final CharSequence a;

    public jq(jp jpVar) {
        this.a = jpVar.a;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.a);
        bundle.putBundle("icon", (Bundle) null);
        bundle.putString("uri", (String) null);
        bundle.putString("key", (String) null);
        bundle.putBoolean("isBot", false);
        bundle.putBoolean("isImportant", false);
        return bundle;
    }

    public final Person b() {
        return new Person.Builder().setName(this.a).setIcon((Icon) null).setUri((String) null).setKey((String) null).setBot(false).setImportant(false).build();
    }
}
