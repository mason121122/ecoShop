package com.ecoshop.page;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Vance
 * @date 2021/10/3
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class PageResponse<T> extends Base {

    // 当前页码
    private int pageIndex;

    // 总记录数
    private int total;

    // 结果集
    private List<T> list;

}
