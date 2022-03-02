package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;
import java.util.ArrayList;

/* renamed from: abks  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abks extends DialogFragment {
    public static abks a(int i, int i2, String str, ArrayList arrayList) {
        abks abks = new abks();
        Bundle bundle = new Bundle();
        bundle.putInt("titleId", i);
        bundle.putInt("quickActionId", i2);
        bundle.putString("viewerAccountName", str);
        bundle.putParcelableArrayList("contactInfoOptions", arrayList);
        abks.setArguments(bundle);
        return abks;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Intent intent;
        ArrayList parcelableArrayList = getArguments().getParcelableArrayList("contactInfoOptions");
        String string = getArguments().getString("viewerAccountName");
        int i = getArguments().getInt("quickActionId");
        ViewGroup viewGroup = null;
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(getActivity()).inflate(R.layout.contact_info_dialog, (ViewGroup) null);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.entries);
        int i2 = 0;
        while (true) {
            if (i2 >= parcelableArrayList.size()) {
                viewGroup = viewGroup2;
                break;
            }
            String string2 = ((Bundle) parcelableArrayList.get(i2)).getString("extraValue");
            String string3 = ((Bundle) parcelableArrayList.get(i2)).getString("extraFormattedType");
            int i3 = R.drawable.quantum_ic_email_vd_theme_24;
            int i4 = R.string.contact_info_email_content_description;
            if (i != R.id.quick_actions_call) {
                if (i != R.id.quick_actions_email) {
                    if (i != R.id.quick_actions_schedule) {
                        break;
                    }
                    intent = new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra("android.intent.extra.EMAIL", string2);
                } else {
                    intent = abfz.a(string2, string);
                }
            } else {
                intent = abfz.a(string2);
                i4 = R.string.contact_info_phone_content_description;
                i3 = R.drawable.quantum_ic_call_vd_theme_24;
            }
            i2++;
            String string4 = getActivity().getString(i4, new Object[]{Integer.valueOf(i2), Integer.valueOf(parcelableArrayList.size()), string3, string2});
            View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.contact_info_item, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.text);
            jpr.a(getActivity(), textView, string2, string3);
            ry.a(textView, uj.b(getActivity(), i3), (Drawable) null);
            inflate.setContentDescription(string4);
            inflate.setOnClickListener(new abkr(this, intent));
            viewGroup3.addView(inflate);
        }
        AlertDialog.Builder title = new AlertDialog.Builder(getActivity()).setTitle(getArguments().getInt("titleId"));
        if (viewGroup != null) {
            title.setView(viewGroup);
        }
        return title.create();
    }
}
