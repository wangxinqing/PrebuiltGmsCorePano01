package com.google.android.gms.smart_profile;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContactsPickerChimeraActivity extends bjs {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("com.google.android.gms.people.smart_profile.VIEWER_ACCOUNT_NAME");
        String stringExtra2 = intent.getStringExtra("com.google.android.gms.people.smart_profile.VIEWER_PAGE_ID");
        String stringExtra3 = intent.getStringExtra("com.google.android.gms.people.smart_profile.QUALIFIED_ID");
        int intExtra = intent.getIntExtra("com.google.android.gms.people.smart_profile.APPLICATION_ID", 0);
        setContentView((int) R.layout.profile_contacts_picker_activity);
        sg aE = aE();
        aE.c(true);
        aE.c((int) R.string.profile_contacts_picker_title);
        aE.p();
        Integer a = jpr.a(intent);
        if (a.equals(0)) {
            Resources resources = getResources();
            aE.b((Drawable) new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{resources.getColor(R.color.profile_header_gradient_start_color), resources.getColor(R.color.profile_header_gradient_end_color)}));
        } else {
            aE.b((Drawable) new ColorDrawable(a.intValue()));
        }
        if (bundle == null) {
            abfv abfv = new abfv();
            Bundle bundle2 = new Bundle();
            bundle2.putString("viewerAccountName", stringExtra);
            bundle2.putString("viewerPageId", stringExtra2);
            bundle2.putString("qualifiedId", stringExtra3);
            bundle2.putInt("applicationId", intExtra);
            abfv.setArguments(bundle2);
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, abfv, "ContactsPickerFragment").commit();
        }
    }
}
