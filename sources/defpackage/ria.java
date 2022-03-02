package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.HierarchicalPlaceLikelihoodEntity;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;

@Deprecated
/* renamed from: ria  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ria extends ile implements icl {
    private static final Comparator b = new rhz();
    private final String c;
    private final Status d;

    public ria(DataHolder dataHolder, int i) {
        this(dataHolder, i, (byte[]) null);
    }

    public static ria a(Intent intent) {
        ArrayList b2;
        if (intent == null || !intent.hasExtra("com.google.android.gms.location.places.PlaceLikelihoodBuffer.PLACE_LIST_EXTRA_KEY") || !intent.hasExtra("com.google.android.gms.location.places.PlaceLikelihoodBuffer.STATUS_EXTRA_KEY") || !intent.hasExtra("com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY") || (b2 = ivy.b(intent, "com.google.android.gms.location.places.PlaceLikelihoodBuffer.PLACE_LIST_EXTRA_KEY", HierarchicalPlaceLikelihoodEntity.CREATOR)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            HierarchicalPlaceLikelihoodEntity hierarchicalPlaceLikelihoodEntity = (HierarchicalPlaceLikelihoodEntity) b2.get(i);
            float f = hierarchicalPlaceLikelihoodEntity.c;
            if (f != -1.0f) {
                arrayList.add(PlaceLikelihoodEntity.a(hierarchicalPlaceLikelihoodEntity.b, f));
            }
        }
        Collections.sort(arrayList, b);
        Status status = (Status) ivy.a(intent, "com.google.android.gms.location.places.PlaceLikelihoodBuffer.STATUS_EXTRA_KEY", Status.CREATOR);
        if (status == null) {
            status = Status.c;
        }
        int intExtra = intent.getIntExtra("com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY", -1);
        ilm a = DataHolder.a(rks.b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            PlaceLikelihoodEntity placeLikelihoodEntity = (PlaceLikelihoodEntity) arrayList.get(i2);
            a.a(placeLikelihoodEntity.c());
            linkedHashSet.addAll(placeLikelihoodEntity.a.n);
        }
        String a2 = rjd.a(linkedHashSet);
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(a2)) {
            a(bundle, a2);
        }
        intent.getBooleanExtra("com.google.android.gms.location.places.PlaceLikelihoodBuffer.MOCK_PROVIDER_EXTRA_KEY", false);
        return new ria(a.a(status.i, bundle), intExtra, (byte[]) null);
    }

    public final Status aO() {
        return this.d;
    }

    public final String toString() {
        iur a = ius.a(this);
        a.a("status", this.d);
        a.a("attributions", this.c);
        return a.toString();
    }

    public ria(DataHolder dataHolder, int i, byte[] bArr) {
        super(dataHolder);
        Bundle bundle;
        this.d = ris.h(dataHolder.e);
        switch (i) {
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
                if (dataHolder == null || (bundle = dataHolder.f) == null) {
                    this.c = null;
                    return;
                } else {
                    this.c = bundle.getString("com.google.android.gms.location.places.PlaceLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY");
                    return;
                }
            default:
                StringBuilder sb = new StringBuilder(27);
                sb.append("invalid source: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public static void a(Bundle bundle, String str) {
        bundle.putString("com.google.android.gms.location.places.PlaceLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY", str);
    }

    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new rkn(this.a, i);
    }
}
