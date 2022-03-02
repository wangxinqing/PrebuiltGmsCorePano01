package defpackage;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceSpec;
import android.content.Context;
import android.net.Uri;
import android.support.v4.graphics.drawable.IconCompat;

/* renamed from: mto  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mto extends mtp {
    private static final amzy a = amzy.a((Object) "title");
    private static final amzy b = amzy.a((Object) "list_item");
    private static final amzy c = amzy.a((Object) "title", (Object) "shortcut");
    private static final amzy d = amzy.h();
    private final Context e;
    private final Slice.Builder f;

    public mto(Context context, Uri uri) {
        this.e = context;
        this.f = new Slice.Builder(uri, (SliceSpec) null);
        ((anih) ((anih) mte.a.d()).a("mto", "<init>", 190, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ListSliceBuilderWrapper: Build with NativeListSliceBuilder");
    }

    public final androidx.slice.Slice a() {
        return ans.a(this.f.build(), this.e);
    }

    /* access modifiers changed from: protected */
    public final void a(int i) {
        this.f.addInt(i, "color", d);
    }

    public final void a(PendingIntent pendingIntent, IconCompat iconCompat, String str, String str2, boolean z) {
        Slice.Builder builder = this.f;
        builder.addSubSlice(new Slice.Builder(builder).addSubSlice(new Slice.Builder(this.f).addAction(pendingIntent, new Slice.Builder(this.f).addIcon(iconCompat.e(), (String) null, d).build(), (String) null).addHints(c).build(), (String) null).addHints(b).addText(str, (String) null, a).addText(str2, (String) null, d).build(), (String) null);
    }
}
