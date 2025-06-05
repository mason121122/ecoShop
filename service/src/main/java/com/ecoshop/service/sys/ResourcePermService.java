package com.ecoshop.service.sys;

import com.ecoshop.bo.sys.ResourceBo;
import com.ecoshop.bo.sys.RouteBo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright 2025 Vance
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
public interface ResourcePermService {


    /**
     * 资源
     * @return
     */
    boolean addResource(ResourceBo resourceBo);

    boolean editResource(ResourceBo resourceBo);

    boolean delResource(Long id);


   //==================路由配置建议使用dml脚本添加，不建议作成一个web功能，这里方便开发测试就直接做成一个功能=================================
    /**
     * 路由
     * @return
     */
    boolean addRoute(RouteBo routeBo);

    /**
     * 编辑路由
     * @return
     */
    boolean editRoute(RouteBo routeBo);

    /**
     * 删除路由
     * @return
     */
    boolean delRoute(Long id);

    /**
     * 分页查询路由
     * @param routeBo
     * @param pageIndex
     * @param pageSize
     * @return
     */
    List<RouteBo> pageQueryRoute(RouteBo routeBo,Integer pageIndex,Integer pageSize);

}
