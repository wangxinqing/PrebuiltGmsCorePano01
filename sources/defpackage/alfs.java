package defpackage;

import android.content.ContentValues;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.PlacePhotoMetadataResult;
import com.google.android.gms.location.places.internal.AutocompletePredictionEntity;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
import com.google.android.gms.location.places.personalized.PlaceUserData;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: alfs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alfs {
    public static void a(int i, String str, rka rka) {
        if (rka != null) {
            try {
                rka.a(str != null ? ris.b(i, str) : ris.h(i));
            } catch (RemoteException e) {
            }
        }
    }

    public static void b(int i, List list, rka rka) {
        ilm a = DataHolder.a(rks.c);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AutocompletePredictionEntity autocompletePredictionEntity = (AutocompletePredictionEntity) it.next();
            ContentValues contentValues = new ContentValues(rks.c.length);
            contentValues.put("ap_description", autocompletePredictionEntity.a);
            contentValues.put("ap_place_id", autocompletePredictionEntity.b);
            contentValues.put("ap_place_types", ilj.a(autocompletePredictionEntity.c));
            contentValues.put("ap_matched_subscriptions", ilj.b(autocompletePredictionEntity.d));
            contentValues.put("ap_personalization_type", Integer.valueOf(autocompletePredictionEntity.e));
            contentValues.put("data", ivy.a(autocompletePredictionEntity));
            contentValues.put("ap_primary_text", autocompletePredictionEntity.f);
            contentValues.put("ap_primary_text_matched", ilj.b(autocompletePredictionEntity.g));
            contentValues.put("ap_secondary_text", autocompletePredictionEntity.h);
            contentValues.put("ap_secondary_text_matched", ilj.b(autocompletePredictionEntity.i));
            a.a(contentValues);
        }
        DataHolder a2 = a.a(i);
        try {
            rka.b(a2);
        } catch (RemoteException e) {
            if (Log.isLoggable("Places", 4)) {
                alfy.a("Places", "query suggestion callback failed", e);
            }
        } catch (Throwable th) {
            a(rka.asBinder(), a2);
            throw th;
        }
        a(rka.asBinder(), a2);
    }

    public static void c(int i, List list, rka rka) {
        ilm d = ilk.d();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PlaceUserData placeUserData = (PlaceUserData) it.next();
            if (placeUserData != null) {
                ilk.a(d, placeUserData);
            }
        }
        DataHolder a = d.a(i);
        try {
            rka.c(a);
        } catch (RemoteException e) {
        } catch (Throwable th) {
            a(rka.asBinder(), a);
            throw th;
        }
        a(rka.asBinder(), a);
    }

    public static void a(int i, List list, int i2, rka rka) {
        ilm a = DataHolder.a(rks.b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PlaceLikelihoodEntity placeLikelihoodEntity = (PlaceLikelihoodEntity) it.next();
                a.a(placeLikelihoodEntity.c());
                linkedHashSet.addAll(placeLikelihoodEntity.a.n);
            }
        }
        Bundle bundle = new Bundle();
        String a2 = rjd.a(linkedHashSet);
        if (!TextUtils.isEmpty(a2)) {
            ria.a(bundle, a2);
        }
        bundle.putInt("com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY", i2);
        DataHolder a3 = a.a(i, bundle);
        try {
            rka.a(a3);
        } catch (RemoteException e) {
            if (Log.isLoggable("Places", 4)) {
                alfy.a("Places", "places callback failed", e);
            }
        } catch (Throwable th) {
            a(rka.asBinder(), a3);
            throw th;
        }
        a(rka.asBinder(), a3);
    }

    public static void a(int i, List list, rjx rjx) {
        DataHolder dataHolder;
        Status h = ris.h(i);
        if (h.c()) {
            ilm a = DataHolder.a(rks.d);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                rkp rkp = (rkp) it.next();
                ContentValues contentValues = new ContentValues(rks.d.length);
                contentValues.put("photo_fife_url", rkp.a);
                contentValues.put("photo_max_width", Integer.valueOf(rkp.b));
                contentValues.put("photo_max_height", Integer.valueOf(rkp.c));
                contentValues.put("photo_attributions", rkp.d.toString());
                a.a(contentValues);
            }
            dataHolder = a.a(i);
        } else {
            dataHolder = null;
        }
        try {
            rjx.a(new PlacePhotoMetadataResult(h, dataHolder));
            if (dataHolder == null) {
                return;
            }
        } catch (RemoteException e) {
            if (dataHolder == null) {
                return;
            }
        } catch (Throwable th) {
            if (dataHolder != null) {
                a(rjx.asBinder(), dataHolder);
            }
            throw th;
        }
        a(rjx.asBinder(), dataHolder);
    }

    public static void a(int i, List list, rka rka) {
        Bundle bundle;
        ilm a = DataHolder.a(rks.a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PlaceEntity placeEntity = (PlaceEntity) it.next();
            a.a(placeEntity.s());
            linkedHashSet.addAll(placeEntity.n);
        }
        String a2 = rjd.a(linkedHashSet);
        if (!TextUtils.isEmpty(a2)) {
            bundle = new Bundle();
            bundle.putString("com.google.android.gms.location.places.PlaceBuffer.ATTRIBUTIONS_EXTRA_KEY", a2);
        } else {
            bundle = null;
        }
        DataHolder a3 = a.a(i, bundle);
        try {
            rka.d(a3);
        } catch (RemoteException e) {
            if (Log.isLoggable("Places", 4)) {
                alfy.a("Places", "places callback failed", e);
            }
        } catch (Throwable th) {
            a(rka.asBinder(), a3);
            throw th;
        }
        a(rka.asBinder(), a3);
    }

    public static void a(IBinder iBinder, DataHolder dataHolder) {
        iva.a((Object) dataHolder);
        if (iBinder != null) {
            try {
                if (iBinder.queryLocalInterface(iBinder.getInterfaceDescriptor()) == null) {
                    dataHolder.close();
                }
            } catch (RemoteException e) {
                dataHolder.close();
            }
        }
    }
}
