package defpackage;

import android.view.View;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;

/* renamed from: ajuk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajuk implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ ChipGroup a;

    public ajuk(ChipGroup chipGroup) {
        this.a = chipGroup;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ChipGroup chipGroup = this.a;
        if (!chipGroup.e) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < chipGroup.getChildCount(); i++) {
                View childAt = chipGroup.getChildAt(i);
                if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                    arrayList.add(Integer.valueOf(childAt.getId()));
                    if (chipGroup.a) {
                        break;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                ChipGroup chipGroup2 = this.a;
                if (chipGroup2.b) {
                    chipGroup2.a(compoundButton.getId(), true);
                    this.a.d = compoundButton.getId();
                    return;
                }
            }
            int id = compoundButton.getId();
            if (z) {
                ChipGroup chipGroup3 = this.a;
                int i2 = chipGroup3.d;
                if (!(i2 == -1 || i2 == id || !chipGroup3.a)) {
                    chipGroup3.a(i2, false);
                }
                this.a.d = id;
                return;
            }
            ChipGroup chipGroup4 = this.a;
            if (chipGroup4.d == id) {
                chipGroup4.d = -1;
            }
        }
    }
}
