package defpackage;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jrz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jrz extends DialogFragment {
    private final View.OnClickListener a(Intent intent) {
        return new jry(this, intent);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        ajwe ajwe = new ajwe(getActivity(), 2132018585);
        ajwe.c(getArguments().getInt("titleId"));
        ArrayList parcelableArrayList = getArguments().getParcelableArrayList("contactInfoOptions");
        String string = getArguments().getString("viewerAccountName");
        int i = getArguments().getInt("quickActionType");
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getActivity()).inflate(R.layout.gm_contact_info_dialog, (ViewGroup) null);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.entries);
        if (i == 0) {
            int i2 = 0;
            while (i2 < parcelableArrayList.size()) {
                String string2 = ((Bundle) parcelableArrayList.get(i2)).getString("extraValue");
                String string3 = ((Bundle) parcelableArrayList.get(i2)).getString("extraFormattedType");
                jru a = a(string2, string3, ((Bundle) parcelableArrayList.get(i2)).getString("extraSourceContext"));
                i2++;
                a.f = getActivity().getString(R.string.contact_info_phone_content_description, new Object[]{Integer.valueOf(i2), Integer.valueOf(parcelableArrayList.size()), string3, string2});
                a.d = uj.b(getActivity(), R.drawable.quantum_ic_call_vd_theme_24);
                a.i = a(jrv.a(string2));
                viewGroup2.addView(a.a(getActivity(), viewGroup2));
            }
        } else if (i == 1) {
            a((List) parcelableArrayList, string, 1, viewGroup2);
        } else if (i == 2) {
            a((List) parcelableArrayList, string, 2, viewGroup2);
        }
        ajwe.c((View) viewGroup);
        return ajwe.b();
    }

    private static final jru a(String str, String str2, String str3) {
        jru a = jru.a();
        a.a = str;
        if (!TextUtils.isEmpty(str2)) {
            a.b = str2;
            a.c = str3;
        } else {
            a.b = str3;
        }
        return a;
    }

    public static jrz a(int i, int i2, String str, ArrayList arrayList) {
        boolean z;
        boolean z2 = true;
        if (arrayList != null) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "Must provide contact info to disambiguate.");
        if (arrayList.size() < 2) {
            z2 = false;
        }
        iva.b(z2, "Must have at least two options to disambiguate.");
        jrz jrz = new jrz();
        Bundle bundle = new Bundle();
        bundle.putInt("titleId", i);
        bundle.putInt("quickActionType", i2);
        bundle.putString("viewerAccountName", str);
        bundle.putParcelableArrayList("contactInfoOptions", arrayList);
        jrz.setArguments(bundle);
        return jrz;
    }

    private final void a(List list, String str, int i, ViewGroup viewGroup) {
        int i2 = 0;
        while (i2 < list.size()) {
            String string = ((Bundle) list.get(i2)).getString("extraValue");
            String string2 = ((Bundle) list.get(i2)).getString("extraFormattedType");
            jru a = a(string, string2, ((Bundle) list.get(i2)).getString("extraSourceContext"));
            i2++;
            a.f = getActivity().getString(R.string.contact_info_email_content_description, new Object[]{Integer.valueOf(i2), Integer.valueOf(list.size()), string2, string});
            a.d = uj.b(getActivity(), R.drawable.quantum_gm_ic_email_vd_theme_24);
            if (i == 1) {
                a.i = a(jrv.a(string, str));
            } else {
                a.i = a(new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra("android.intent.extra.EMAIL", string));
            }
            viewGroup.addView(a.a(getActivity(), viewGroup));
        }
    }
}
