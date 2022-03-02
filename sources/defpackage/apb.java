package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.slice.Slice;
import androidx.slice.SliceItemHolder;
import androidx.slice.SliceSpec;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: apb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apb {
    public static Slice a(Context context, Uri uri, Set set) {
        apa a = a(context.getContentResolver(), uri);
        Slice slice = null;
        try {
            Bundle bundle = new Bundle();
            bundle.putParcelable("slice_uri", uri);
            a(bundle, set);
            Bundle call = a.a.call("bind_slice", "supports_versioned_parcelable", bundle);
            if (call != null) {
                synchronized (SliceItemHolder.a) {
                    try {
                        SliceItemHolder.b = new aoz(context);
                        call.setClassLoader(apb.class.getClassLoader());
                        Parcelable parcelable = call.getParcelable("slice");
                        if (parcelable == null) {
                            SliceItemHolder.b = null;
                        } else if (parcelable instanceof Bundle) {
                            Slice slice2 = new Slice((Bundle) parcelable);
                            SliceItemHolder.b = null;
                            slice = slice2;
                        } else if (parcelable instanceof ParcelImpl) {
                            Slice slice3 = (Slice) ((ParcelImpl) parcelable).a;
                            SliceItemHolder.b = null;
                            slice = slice3;
                        } else {
                            throw new IllegalArgumentException("Invalid parcel");
                        }
                    } catch (Throwable th) {
                        SliceItemHolder.b = null;
                        throw th;
                    }
                }
            }
        } catch (RemoteException e) {
            try {
                Log.e("SliceProviderCompat", "Unable to bind slice", e);
            } catch (Throwable th2) {
                a.close();
                throw th2;
            }
        }
        a.close();
        return slice;
    }

    public static apa a(ContentResolver contentResolver, Uri uri) {
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (acquireUnstableContentProviderClient != null) {
            return new apa(acquireUnstableContentProviderClient);
        }
        throw new IllegalArgumentException("No provider found for " + uri);
    }

    public static void a(Bundle bundle, Set set) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            SliceSpec sliceSpec = (SliceSpec) it.next();
            arrayList.add(sliceSpec.a);
            arrayList2.add(Integer.valueOf(sliceSpec.b));
        }
        bundle.putStringArrayList("specs", arrayList);
        bundle.putIntegerArrayList("revs", arrayList2);
    }
}
