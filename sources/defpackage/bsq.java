package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcelable;
import android.os.Process;
import androidx.slice.Slice;
import androidx.slice.SliceItemHolder;
import androidx.slice.SliceSpec;
import com.google.android.chimera.ContentProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bsq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class bsq extends ContentProvider {
    private final String[] a;
    private bss b;
    private List c;

    public bsq() {
        this.a = new String[0];
    }

    public static final Uri b() {
        throw new UnsupportedOperationException("This provider has not implemented intent to uri mapping");
    }

    public abstract Slice a(Uri uri);

    public abstract boolean a();

    public void b(Uri uri) {
    }

    public final int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        return 0;
    }

    public final void c(Uri uri) {
        if (!this.c.contains(uri)) {
            this.c.add(uri);
        }
    }

    public final Bundle call(String str, String str2, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        bss bss = this.b;
        Parcelable parcelable = null;
        if (bss == null) {
            return null;
        }
        if (str.equals("bind_slice")) {
            bss.a(bundle);
            Slice a2 = bss.a((Uri) bundle.getParcelable("slice_uri"), bss.a());
            Bundle bundle2 = new Bundle();
            if ("supports_versioned_parcelable".equals(str2)) {
                synchronized (SliceItemHolder.a) {
                    if (a2 != null) {
                        parcelable = ati.a(a2);
                    }
                    bundle2.putParcelable("slice", parcelable);
                }
            } else {
                if (a2 != null) {
                    parcelable = a2.a();
                }
                bundle2.putParcelable("slice", parcelable);
            }
            return bundle2;
        } else if (str.equals("map_slice")) {
            Intent intent = (Intent) bundle.getParcelable("slice_intent");
            Uri b2 = b();
            Bundle bundle3 = new Bundle();
            if (b2 != null) {
                bss.a(bundle);
                Slice a3 = bss.a(b2, bss.a());
                if ("supports_versioned_parcelable".equals(str2)) {
                    synchronized (SliceItemHolder.a) {
                        if (a3 != null) {
                            parcelable = ati.a(a3);
                        }
                        bundle3.putParcelable("slice", parcelable);
                    }
                } else {
                    if (a3 != null) {
                        parcelable = a3.a();
                    }
                    bundle3.putParcelable("slice", parcelable);
                }
            } else {
                bundle3.putParcelable("slice", (Parcelable) null);
            }
            return bundle3;
        } else if (str.equals("map_only")) {
            Intent intent2 = (Intent) bundle.getParcelable("slice_intent");
            Uri b3 = b();
            Bundle bundle4 = new Bundle();
            bundle4.putParcelable("slice", b3);
            return bundle4;
        } else if (str.equals("pin_slice")) {
            Uri uri = (Uri) bundle.getParcelable("slice_uri");
            if (!bss.d.a(uri, bundle.getString("pkg"), bss.a(bundle))) {
                return null;
            }
            bss.b = "onSlicePinned";
            bss.a.postDelayed(bss.f, 2000);
            try {
                bss.c.c(uri);
                return null;
            } finally {
                bss.a.removeCallbacks(bss.f);
            }
        } else if (str.equals("unpin_slice")) {
            Uri uri2 = (Uri) bundle.getParcelable("slice_uri");
            if (!bss.d.a(uri2, bundle.getString("pkg"))) {
                return null;
            }
            bss.b = "onSliceUnpinned";
            bss.a.postDelayed(bss.f, 2000);
            try {
                bss.c.b(uri2);
                bss.c.d(uri2);
                return null;
            } finally {
                bss.a.removeCallbacks(bss.f);
            }
        } else if (str.equals("get_specs")) {
            Uri uri3 = (Uri) bundle.getParcelable("slice_uri");
            Bundle bundle5 = new Bundle();
            ob<SliceSpec> b4 = bss.d.b(uri3);
            if (b4.b != 0) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (SliceSpec sliceSpec : b4) {
                    arrayList.add(sliceSpec.a);
                    arrayList2.add(Integer.valueOf(sliceSpec.b));
                }
                bundle5.putStringArrayList("specs", arrayList);
                bundle5.putIntegerArrayList("revs", arrayList2);
                return bundle5;
            }
            String valueOf = String.valueOf(uri3);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
            sb.append(valueOf);
            sb.append(" is not pinned");
            throw new IllegalStateException(sb.toString());
        } else if (str.equals("get_descendants")) {
            Uri uri4 = (Uri) bundle.getParcelable("slice_uri");
            Bundle bundle6 = new Bundle();
            bss.b = "onGetSliceDescendants";
            bundle6.putParcelableArrayList("slice_descendants", new ArrayList(Collections.emptyList()));
            return bundle6;
        } else if (str.equals("check_perms")) {
            bundle.getString("pkg");
            int i2 = bundle.getInt("pid");
            int i3 = bundle.getInt("uid");
            Bundle bundle7 = new Bundle();
            bundle7.putInt("result", bss.e.a((Uri) bundle.getParcelable("slice_uri"), i2, i3));
            return bundle7;
        } else if (str.equals("grant_perms")) {
            Uri uri5 = (Uri) bundle.getParcelable("slice_uri");
            String string = bundle.getString("pkg");
            if (Binder.getCallingUid() == Process.myUid()) {
                bss.e.a(uri5, string);
                return null;
            }
            throw new SecurityException("Only the owning process can manage slice permissions");
        } else if (!str.equals("revoke_perms")) {
            return null;
        } else {
            Uri uri6 = (Uri) bundle.getParcelable("slice_uri");
            String string2 = bundle.getString("pkg");
            if (Binder.getCallingUid() == Process.myUid()) {
                aox aox = bss.e;
                aow a4 = aox.a(string2, uri6.getAuthority());
                List<String> pathSegments = uri6.getPathSegments();
                String[] strArr = (String[]) pathSegments.toArray(new String[pathSegments.size()]);
                boolean z = false;
                for (int i4 = a4.a.b - 1; i4 >= 0; i4--) {
                    if (aow.a(strArr, (String[]) a4.a.b(i4))) {
                        a4.a.c(i4);
                        z = true;
                    }
                }
                if (!z) {
                    return null;
                }
                aox.a(a4);
                return null;
            }
            throw new SecurityException("Only the owning process can manage slice permissions");
        }
    }

    public final Uri canonicalize(Uri uri) {
        return null;
    }

    public final void d(Uri uri) {
        if (this.c.contains(uri)) {
            this.c.remove(uri);
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        int i = Build.VERSION.SDK_INT;
        return "vnd.android.slice";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        int i = Build.VERSION.SDK_INT;
        this.c = new ArrayList(anw.a(getContext()).a());
        if (Build.VERSION.SDK_INT < 28) {
            String[] strArr = this.a;
            Context context = getContext();
            String valueOf = String.valueOf(getClass().getName());
            this.b = new bss(this, new aox(context, valueOf.length() == 0 ? new String("slice_perms_") : "slice_perms_".concat(valueOf), Process.myUid(), strArr), getContext());
        }
        return a();
    }

    public final Cursor query(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        return null;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public bsq(String... strArr) {
        this.a = strArr;
    }

    public final Object getChimeraImpl() {
        bst bst = Build.VERSION.SDK_INT >= 28 ? new bst(this, this.a) : null;
        return bst == null ? this : bst;
    }
}
