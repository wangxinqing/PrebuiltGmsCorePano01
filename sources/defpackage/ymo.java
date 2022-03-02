package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import java.util.ArrayList;

/* renamed from: ymo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ymo extends BaseAdapter {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public String c;
    private final Context d;
    private final LayoutInflater e;
    private ymn f;

    public ymo(Context context) {
        this.d = context;
        this.e = LayoutInflater.from(context);
    }

    private final int c(int i) {
        return i - (this.a.size() + 1);
    }

    private final int d(int i) {
        if (i >= 0 && i < this.a.size()) {
            return 0;
        }
        if (i == this.a.size()) {
            return 2;
        }
        if (i >= 0 && i < this.a.size() + this.b.size() + 1) {
            return 1;
        }
        StringBuilder sb = new StringBuilder(46);
        sb.append("Position ");
        sb.append(i);
        sb.append(" outside of expected range");
        throw new IllegalStateException(sb.toString());
    }

    public final void a(int i) {
        ymn ymn;
        int i2 = 0;
        while (true) {
            if (i2 >= this.a.size()) {
                ymn = null;
                break;
            } else if (((ymn) this.a.get(i2)).b == i) {
                ymn = (ymn) this.a.get(i2);
                break;
            } else {
                i2++;
            }
        }
        if (ymn != null) {
            this.f = ymn;
            return;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Filter Id ");
        sb.append(i);
        sb.append(" not found");
        throw new IllegalStateException(sb.toString());
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    /* renamed from: b */
    public final ymm getItem(int i) {
        ymn ymn;
        int i2 = -1;
        if (!(this.a.size() == 0 || (ymn = this.f) == null)) {
            i2 = ymn.b;
        }
        int d2 = d(i);
        if (d2 == 0) {
            return new ymm(((ymn) this.a.get(i)).b, this.c);
        }
        if (d2 != 1) {
            return new ymm(i2, this.c);
        }
        return new ymm(i2, ((ymd) this.b.get(c(i))).a);
    }

    public final int getCount() {
        return this.a.size() + (this.b.size() > 0 ? this.b.size() + 1 : 0);
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        String str;
        int i2;
        View inflate = this.e.inflate(R.layout.plus_settings_spinner_dropdown_item, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.dropdown_text_item);
        ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(R.id.dropdown_header_item);
        int size = this.a.size();
        int i3 = 8;
        if (viewGroup3 != null) {
            if (i == size) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            viewGroup3.setVisibility(i2);
        }
        if (viewGroup2 != null) {
            if (i != size) {
                i3 = 0;
            }
            viewGroup2.setVisibility(i3);
        }
        if (!(i == size || (textView = (TextView) inflate.findViewById(R.id.dropdown_item_text)) == null)) {
            if (this.a.size() <= i || this.a.size() <= 0) {
                str = "";
            } else {
                str = ((ymn) this.a.get(i)).a;
            }
            if (d(i) == 1) {
                str = ((ymd) this.b.get(c(i))).a;
            }
            textView.setText(str);
            if (d(i) == 1) {
                ImageView imageView = (ImageView) inflate.findViewById(R.id.dropdown_item_image);
                Bitmap bitmap = ((ymd) this.b.get(c(i))).b;
                if (bitmap == null) {
                    imageView.setImageResource(yml.e);
                } else {
                    imageView.setImageBitmap(bitmap);
                }
                imageView.setVisibility(0);
            }
        }
        return inflate;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        return -1;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        String str;
        if (view == null) {
            if (this.b.size() == 0) {
                view = this.e.inflate(R.layout.plus_settings_filters_spinner, viewGroup, false);
            } else {
                view = this.e.inflate(R.layout.plus_settings_account_spinner, viewGroup, false);
            }
        }
        ymn ymn = this.f;
        if (ymn == null) {
            str = this.d.getString(R.string.plus_app_settings_apps_page_label);
        } else {
            str = ymn.a;
        }
        String str2 = this.c;
        if (d(i) == 1) {
            str2 = ((ymd) this.b.get(c(i))).a;
        }
        if (d(i) == 0) {
            str = ((ymn) this.a.get(i)).a;
        }
        TextView textView = (TextView) view.findViewById(R.id.spinner_title);
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.account_name);
        if (textView2 != null) {
            textView2.setText(str2);
        }
        notifyDataSetChanged();
        return view;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final boolean isEnabled(int i) {
        return i != this.a.size();
    }
}
