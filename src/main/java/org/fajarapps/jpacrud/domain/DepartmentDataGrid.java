package org.fajarapps.jpacrud.domain;

import org.fajarapps.jpacrud.entity.Department;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * DataBind untuk menampilkan data-grid dari table Department.
 *
 * @author Ahmad Fajar
 * @since 27/08/2015, modified: 27/08/2015 01:38
 */
public class DepartmentDataGrid extends AbstractDataGrid
{
    List<Department> entries;

    /**
     * Default class constructor.
     */
    public DepartmentDataGrid() {
    }

    /**
     * Class constructor.
     */
    public DepartmentDataGrid(Page<Department> pages) {
        setPageable(pages);
    }

    public List<Department> getEntries() {
        return entries;
    }

    public void setEntries(List<Department> entries) {
        this.entries = entries;
    }

    /**
     * Menempatkan data hasil query ke dalam datagrid buffer.
     *
     * @param pages Data hasil query
     * @return Fluent interface, returns itself.
     */
    public DepartmentDataGrid setPageable(Page<Department> pages) {
        setEntries(pages.getContent());
        setNumberOfItems(pages.getNumberOfElements());
        setPage(pages.getNumber() + 1);
        setTotalItems(pages.getTotalElements());
        setTotalPages(pages.getTotalPages());

        return this;
    }
}
