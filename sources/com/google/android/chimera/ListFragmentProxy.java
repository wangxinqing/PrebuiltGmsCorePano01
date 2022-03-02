package com.google.android.chimera;

import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment$SavedState;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.chimera.Activity;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ListFragmentProxy extends iq implements bjl {
    private ListFragment i;

    public ListFragmentProxy() {
        this.i = null;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public boolean getAllowEnterTransitionOverlap() {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.getAllowEnterTransitionOverlap();
        }
        Log.e("ChimeraListFragmentProxy", "Provider proxy missing implementation");
        return false;
    }

    public boolean getAllowReturnTransitionOverlap() {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.getAllowReturnTransitionOverlap();
        }
        Log.e("ChimeraListFragmentProxy", "Provider proxy missing implementation");
        return false;
    }

    public Object getEnterTransition() {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.getEnterTransition();
        }
        Log.e("ChimeraListFragmentProxy", "Provider proxy missing implementation");
        return null;
    }

    public Object getExitTransition() {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.getExitTransition();
        }
        Log.e("ChimeraListFragmentProxy", "Provider proxy missing implementation");
        return null;
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.getLayoutInflater(bundle);
        }
        Log.e("ChimeraListFragmentProxy", "Provider proxy missing implementation");
        return super.getLayoutInflater();
    }

    public Activity getModuleActivity() {
        gl activity = getActivity();
        if (activity != null) {
            return ((Activity.ProxyCallbacks) activity).getModuleActivity();
        }
        return null;
    }

    public ListFragment getModuleFragment() {
        return this.i;
    }

    public Object getReenterTransition() {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.getReenterTransition();
        }
        Log.e("ChimeraListFragmentProxy", "Provider proxy missing implementation");
        return null;
    }

    public Object getReturnTransition() {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.getReturnTransition();
        }
        Log.e("ChimeraListFragmentProxy", "Provider proxy missing implementation");
        return null;
    }

    public Object getSharedElementEnterTransition() {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.getSharedElementEnterTransition();
        }
        Log.e("ChimeraListFragmentProxy", "Provider proxy missing implementation");
        return null;
    }

    public Object getSharedElementReturnTransition() {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.getSharedElementReturnTransition();
        }
        Log.e("ChimeraListFragmentProxy", "Provider proxy missing implementation");
        return null;
    }

    public View getView() {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.getView();
        }
        Log.e("ChimeraListFragmentProxy", "Provider proxy missing implementation");
        return null;
    }

    public void onActivityCreated(Bundle bundle) {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onActivityCreated(bundle);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onActivityResult(i2, i3, intent);
        }
    }

    public void onAttach(android.app.Activity activity) {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment == null) {
            Bundle arguments = super.getArguments();
            if (arguments == null) {
                Log.e("ChimeraListFragmentProxy", "Cannot instantiate implementation: fragment arguments is null");
            } else {
                String string = arguments.getString("_chimera_module_fragment_class_key");
                if (string == null) {
                    Log.e("ChimeraListFragmentProxy", "Cannot instantiate implementation: class name is missing");
                } else {
                    try {
                        Activity moduleActivity = getModuleActivity();
                        amrl.a((Object) moduleActivity);
                        this.i = (ListFragment) moduleActivity.getClassLoader().loadClass(string).newInstance();
                    } catch (ClassNotFoundException e) {
                        Log.e("ChimeraListFragmentProxy", string.length() == 0 ? new String("Can't find chimera fragment class: ") : "Can't find chimera fragment class: ".concat(string));
                    } catch (IllegalAccessException | InstantiationException e2) {
                        Log.e("ChimeraListFragmentProxy", "Failed to instantiate chimera fragment class", e2);
                    } catch (ClassCastException e3) {
                        StringBuilder sb = new StringBuilder(string.length() + 39);
                        sb.append("Class: ");
                        sb.append(string);
                        sb.append(" is not a chimera fragment class");
                        Log.e("ChimeraListFragmentProxy", sb.toString());
                    }
                    ListFragment listFragment = this.i;
                    if (listFragment != null) {
                        listFragment.setImpl(this);
                        moduleFragment = this.i;
                    } else {
                        Log.e("ChimeraListFragmentProxy", string.length() == 0 ? new String("Cannot instantiate implementation: ") : "Cannot instantiate implementation: ".concat(string));
                    }
                }
            }
        }
        if (moduleFragment != null) {
            Activity moduleActivity2 = getModuleActivity();
            amrl.a((Object) moduleActivity2);
            moduleFragment.onAttach(moduleActivity2);
            return;
        }
        super.onAttach(activity);
    }

    public void onConfigurationChanged(Configuration configuration) {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onConfigurationChanged(configuration);
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.onContextItemSelected(menuItem);
        }
        Log.e("ChimeraListFragmentProxy", "Provider proxy missing implementation");
        return false;
    }

    public void onCreate(Bundle bundle) {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onCreate(bundle);
        } else {
            Log.e("ChimeraListFragmentProxy", "Provider proxy missing implementation");
        }
    }

    public Animation onCreateAnimation(int i2, boolean z, int i3) {
        int i4;
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            Animation onCreateAnimation = moduleFragment.onCreateAnimation(i2, z, i3);
            bkn.b();
            if (!hei.g() || onCreateAnimation != null) {
                return onCreateAnimation;
            }
            if (i3 != 0) {
                return null;
            }
            if (i2 == 4097) {
                i4 = !z ? R$anim.chimera_fragment_open_exit : R$anim.chimera_fragment_open_enter;
            } else if (i2 == 4099) {
                i4 = !z ? R$anim.chimera_fragment_fade_exit : R$anim.chimera_fragment_fade_enter;
            } else if (i2 != 8194) {
                return null;
            } else {
                i4 = !z ? R$anim.chimera_fragment_close_exit : R$anim.chimera_fragment_close_enter;
            }
            return AnimationUtils.loadAnimation(getActivity().getApplicationContext(), i4);
        }
        Log.e("ChimeraListFragmentProxy", "Provider proxy missing implementation");
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onCreateOptionsMenu(menu, menuInflater);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.onCreateView(layoutInflater, viewGroup, bundle);
        }
        Log.e("ChimeraListFragmentProxy", "Provider proxy missing implementation");
        return null;
    }

    public void onDestroy() {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onDestroy();
        }
    }

    public void onDestroyOptionsMenu() {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onDestroyOptionsMenu();
        }
    }

    public void onDestroyView() {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onDestroyView();
        }
    }

    public void onDetach() {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onDetach();
        }
    }

    public void onHiddenChanged(boolean z) {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onHiddenChanged(z);
        }
    }

    public void onInflate(android.app.Activity activity, AttributeSet attributeSet, Bundle bundle) {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onInflate(((Activity.ProxyCallbacks) activity).getModuleActivity(), attributeSet, bundle);
        }
    }

    public void onListItemClick(ListView listView, View view, int i2, long j) {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onListItemClick(listView, view, i2, j);
        }
    }

    public void onLowMemory() {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onLowMemory();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.onOptionsItemSelected(menuItem);
        }
        Log.e("ChimeraListFragmentProxy", "Provider proxy missing implementation");
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onOptionsMenuClosed(menu);
        }
    }

    public void onPause() {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onPause();
        }
    }

    public void onPrepareOptionsMenu(Menu menu) {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onPrepareOptionsMenu(menu);
        }
    }

    public void onResume() {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onResume();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onSaveInstanceState(bundle);
        }
    }

    public void onStart() {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onStart();
        }
    }

    public void onStop() {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onStop();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onViewCreated(view, bundle);
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.onViewStateRestored(bundle);
        }
    }

    public void setArguments(Bundle bundle) {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.setArguments(bundle);
        } else {
            super.setArguments(bundle);
        }
    }

    public void setListAdapter(ListAdapter listAdapter) {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.setListAdapter(listAdapter);
        }
    }

    public void startActivityForResult(Intent intent, int i2) {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            moduleFragment.startActivityForResult(intent, 1);
        }
    }

    public void superDump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
    }

    public boolean superGetAllowEnterTransitionOverlap() {
        return super.getAllowEnterTransitionOverlap();
    }

    public boolean superGetAllowReturnTransitionOverlap() {
        return super.getAllowReturnTransitionOverlap();
    }

    public Bundle superGetArguments() {
        Bundle arguments = super.getArguments();
        if (arguments == null) {
            return null;
        }
        Bundle bundle = arguments.getBundle("_chimera_module_fragment_arguments_key");
        if (bundle != null) {
            ListFragment moduleFragment = getModuleFragment();
            amrl.a((Object) moduleFragment);
            ClassLoader classLoader = moduleFragment.getClass().getClassLoader();
            amrl.a((Object) classLoader);
            bundle.setClassLoader(classLoader);
        }
        return bundle;
    }

    public Object superGetEnterTransition() {
        return super.getEnterTransition();
    }

    public Object superGetExitTransition() {
        return super.getExitTransition();
    }

    public LayoutInflater superGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflater = super.getLayoutInflater(bundle);
        Activity moduleActivity = getModuleActivity();
        amrl.a((Object) moduleActivity);
        return layoutInflater.cloneInContext(moduleActivity);
    }

    public ListAdapter superGetListAdapter() {
        return super.getListAdapter();
    }

    public ListView superGetListView() {
        return super.getListView();
    }

    public Object superGetReenterTransition() {
        return super.getReenterTransition();
    }

    public Object superGetReturnTransition() {
        return super.getReturnTransition();
    }

    public long superGetSelectedItemId() {
        return super.getSelectedItemId();
    }

    public int superGetSelectedItemPosition() {
        return super.getSelectedItemPosition();
    }

    public Object superGetSharedElementEnterTransition() {
        return super.getSharedElementEnterTransition();
    }

    public Object superGetSharedElementReturnTransition() {
        return super.getSharedElementReturnTransition();
    }

    public boolean superGetUserVisibleHint() {
        return super.getUserVisibleHint();
    }

    public View superGetView() {
        return super.getView();
    }

    public void superOnActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void superOnActivityResult(int i2, int i3, Intent intent) {
    }

    public void superOnAttach(Activity activity) {
        super.onAttach(activity.getContainerActivity());
    }

    public void superOnConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public boolean superOnContextItemSelected(MenuItem menuItem) {
        return super.onContextItemSelected(menuItem);
    }

    public void superOnCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public Animation superOnCreateAnimation(int i2, boolean z, int i3) {
        return super.onCreateAnimation(i2, z, i3);
    }

    public void superOnCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void superOnCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View superOnCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void superOnDestroy() {
        super.onDestroy();
    }

    public void superOnDestroyOptionsMenu() {
    }

    public void superOnDestroyView() {
        super.onDestroyView();
    }

    public void superOnDetach() {
        super.onDetach();
    }

    public void superOnHiddenChanged(boolean z) {
    }

    public void superOnInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity.getContainerActivity(), attributeSet, bundle);
    }

    public void superOnListItemClick(ListView listView, View view, int i2, long j) {
    }

    public void superOnLowMemory() {
        super.onLowMemory();
    }

    public boolean superOnOptionsItemSelected(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }

    public void superOnOptionsMenuClosed(Menu menu) {
    }

    public void superOnPause() {
        super.onPause();
    }

    public void superOnPrepareOptionsMenu(Menu menu) {
    }

    public void superOnResume() {
        super.onResume();
    }

    public void superOnSaveInstanceState(Bundle bundle) {
    }

    public void superOnStart() {
        super.onStart();
    }

    public void superOnStop() {
        super.onStop();
    }

    public void superOnViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    public void superOnViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
    }

    public void superRegisterForContextMenu(View view) {
        super.registerForContextMenu(view);
    }

    public void superSetAllowEnterTransitionOverlap(boolean z) {
        super.setAllowEnterTransitionOverlap(z);
    }

    public void superSetAllowReturnTransitionOverlap(boolean z) {
        super.setAllowReturnTransitionOverlap(z);
    }

    public void superSetArguments(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        ListFragment moduleFragment = getModuleFragment();
        amrl.a((Object) moduleFragment);
        bundle2.putString("_chimera_module_fragment_class_key", moduleFragment.getClass().getName());
        if (bundle != null) {
            bundle2.putBundle("_chimera_module_fragment_arguments_key", bundle);
        }
        super.setArguments(bundle2);
    }

    public void superSetEmptyText(CharSequence charSequence) {
        super.setEmptyText(charSequence);
    }

    public void superSetEnterTransition(Object obj) {
        super.setEnterTransition(obj);
    }

    public void superSetExitTransition(Object obj) {
        super.setExitTransition(obj);
    }

    public void superSetHasOptionsMenu(boolean z) {
        super.setHasOptionsMenu(z);
    }

    public void superSetInitialSavedState(Fragment$SavedState fragment$SavedState) {
        super.setInitialSavedState(fragment$SavedState);
    }

    public void superSetListAdapter(ListAdapter listAdapter) {
        super.setListAdapter(listAdapter);
    }

    public void superSetListShown(boolean z) {
        super.setListShown(z);
    }

    public void superSetListShownNoAnimation(boolean z) {
        super.setListShownNoAnimation(z);
    }

    public void superSetMenuVisibility(boolean z) {
        super.setMenuVisibility(z);
    }

    public void superSetReenterTransition(Object obj) {
        super.setReenterTransition(obj);
    }

    public void superSetRetainInstance(boolean z) {
        super.setRetainInstance(z);
    }

    public void superSetReturnTransition(Object obj) {
        super.setReturnTransition(obj);
    }

    public void superSetSelection(int i2) {
        super.setSelection(i2);
    }

    public void superSetSharedElementEnterTransition(Object obj) {
        super.setSharedElementEnterTransition(obj);
    }

    public void superSetSharedElementReturnTransition(Object obj) {
        super.setSharedElementReturnTransition(obj);
    }

    public void superSetUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
    }

    public void superStartActivity(Intent intent) {
        super.startActivity(intent);
    }

    public void superStartActivityForResult(Intent intent, int i2) {
        super.startActivityForResult(intent, i2);
    }

    public void superStartIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    public String superToString() {
        return super.toString();
    }

    public void superUnregisterForContextMenu(View view) {
        super.unregisterForContextMenu(view);
    }

    public String toString() {
        ListFragment moduleFragment = getModuleFragment();
        if (moduleFragment != null) {
            return moduleFragment.toString();
        }
        Log.e("ChimeraListFragmentProxy", "Provider proxy missing implementation");
        return "(null)";
    }

    public ListFragmentProxy(ListFragment listFragment) {
        this.i = listFragment;
        superSetArguments((Bundle) null);
    }
}
