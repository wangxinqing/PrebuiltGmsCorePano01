package com.google.android.gms.family.v2.invites.contactpicker;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Toast;
import com.google.android.gms.family.v2.model.ContactPerson;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AutoCompleteTextView extends yy implements AdapterView.OnItemClickListener, TextWatcher {
    public mms a;
    public String b = "";
    private boolean c = false;

    public AutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        addTextChangedListener(this);
        setThreshold(1);
        setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }

    public final void afterTextChanged(Editable editable) {
        if (!this.c && !isPerformingCompletion()) {
            String obj = editable.toString();
            if (obj.contains(",") || obj.contains("\n")) {
                String replace = obj.replace("\n", "");
                if (replace.contains(",")) {
                    replace = replace.substring(0, replace.indexOf(","));
                }
                ContactPerson.ContactMethod a2 = a(replace.trim());
                this.c = true;
                if (a2 == null) {
                    setText(replace);
                    setSelection(replace.length());
                    Toast.makeText(getContext(), this.b, 1).show();
                } else {
                    setText("");
                    a(a2);
                }
                this.c = false;
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Pair pair = (Pair) adapterView.getItemAtPosition(i);
        ContactPerson contactPerson = (ContactPerson) pair.first;
        ContactPerson.ContactMethod contactMethod = (ContactPerson.ContactMethod) pair.second;
        if (!this.a.e(contactPerson, contactMethod)) {
            this.a.b(contactPerson, contactMethod);
            setText("");
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public static ContactPerson.ContactMethod a(String str) {
        if (PhoneNumberUtils.isGlobalPhoneNumber(str)) {
            return new ContactPerson.ContactMethod(1, PhoneNumberUtils.formatNumber(str));
        }
        if (TextUtils.isEmpty(str) || !Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
            return null;
        }
        return new ContactPerson.ContactMethod(0, str);
    }

    public final void a(ContactPerson.ContactMethod contactMethod) {
        mmf mmf = (mmf) getAdapter();
        if (mmf.getCount() > 0) {
            Pair pair = (Pair) mmf.getItem(0);
            ContactPerson contactPerson = (ContactPerson) pair.first;
            ContactPerson.ContactMethod contactMethod2 = (ContactPerson.ContactMethod) pair.second;
            if (contactMethod.equals(contactMethod2)) {
                if (!this.a.e(contactPerson, contactMethod2)) {
                    this.a.b(contactPerson, contactMethod2);
                    return;
                }
                return;
            }
        }
        mmr mmr = (mmr) this.a;
        if (!mmr.c.contains(contactMethod)) {
            mmr.d(mmr.a(contactMethod), contactMethod);
        }
    }
}
