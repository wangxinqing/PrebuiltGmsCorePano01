package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: zkr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zkr implements CompoundButton.OnCheckedChangeListener {
    int a;
    AudienceMember b;
    final ImageView c;
    final TextView d;
    public final CheckBox e;

    public zkr(View view) {
        this.c = (ImageView) view.findViewById(R.id.avatar);
        this.d = (TextView) view.findViewById(R.id.display_name);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.checkbox);
        this.e = checkBox;
        checkBox.setOnCheckedChangeListener(this);
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.b.h.putBoolean("checked", z);
    }
}
