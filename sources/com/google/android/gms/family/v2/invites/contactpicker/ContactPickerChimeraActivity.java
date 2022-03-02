package com.google.android.gms.family.v2.invites.contactpicker;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.family.v2.model.ContactPickerOptionsData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ContactPickerChimeraActivity extends bjs implements mmp {
    public final void a(List list) {
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("selectedContacts", new ArrayList(list));
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.fm_activity_contact_picker);
        mfx.a(this, getIntent(), jhg.a((Activity) this));
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        mmr mmr = new mmr();
        Bundle bundle2 = new Bundle(1);
        bundle2.putParcelable("contactPickerOptionsData", (ContactPickerOptionsData) getIntent().getParcelableExtra("contactPickerOptions"));
        mmr.setArguments(bundle2);
        beginTransaction.add((int) R.id.fm_contact_picker_fragment_container, (Fragment) mmr).commit();
    }
}
