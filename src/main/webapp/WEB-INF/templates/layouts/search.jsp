<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <div class="row">
      <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4">
        <div class="panel panel-primary">
          <div class="panel-heading">
            <h3 class="panel-title"><span id="result_box" class="short_text" lang="en"><span class="hps">Сategory</span></span></h3>
          </div>
          <div class="panel-body">
            <div class="checkbox">
              <label>
                <input value="true" type="checkbox">
                <b>entertainment</b>
              </label>
            </div>
            <div class="checkbox">
              <label>
                <input value="true" type="checkbox">
                <b>informative</b>
              </label>
            </div>
            <div class="checkbox">
              <label>
                <input value="true" type="checkbox">
                <b>business</b>
              </label>
            </div>
            <div class="checkbox">
              <label>
                <input value="true" type="checkbox">
                <b>sports</b>
              </label>
            </div>
            <div class="checkbox">
              <label>
                <input value="true" type="checkbox">
                <b>professional</b>
              </label>
            </div>
            <div class="checkbox">
              <label>
                <input value="true" type="checkbox">
                <b>training</b>
              </label>
            </div>
            <div class="checkbox">
              <label>
                <input value="true" type="checkbox">
                <b>other</b>
              </label>
            </div>
          </div>
        </div>
      </div>
      <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4">
        <div class="panel panel-info">
          <div class="panel-heading">
            <h3 class="panel-title">Age<br></h3>
          </div>
          <div class="panel-body">
            <select class="form-control">
              <option>From</option>
              <option>from 0</option>
              <option>from 1</option>from 2
              <option>from 3</option>
            </select>
            <select class="form-control">
              <option>TO</option>
              <option>to 1</option>
              <option>to 2</option>
              <option>to 3</option>
            </select>
          </div>
        </div>
        <div class="panel panel-info">
          <div class="panel-heading">
            <h3 class="panel-title">Region<br></h3>
          </div>
          <div class="panel-body">
            <select class="form-control">
              <option>Choose a country</option>
              <option>Russia</option>
              <option>Belarus</option>
              <option>England</option>
              <option>USA</option>
            </select>
            <select class="form-control">
              <option>Coose a city</option>
              <option>Minsk</option>
              <option>Gomel</option>
              <option>Vitebsk</option>
              <option></option>
            </select>
          </div>
        </div>
      </div>
      <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4">
        <div class="panel panel-info">
          <div class="panel-heading">
            <h3 class="panel-title">Sex</h3>
          </div>
          <div class="panel-body">
            <div class="radio">
              <label>
                <input type="radio">Mail</label>
            </div>
            <div class="radio">
              <label>
                <input type="radio">Femail</label>
            </div>
            <div class="radio">
              <label>
                <input type="radio">Any</label>
            </div>
          </div>
        </div>
        <div class="panel panel-info">
          <div class="panel-heading">
            <h3 class="panel-title">Price</h3>
          </div>
          <div class="panel-body">
            <div class="radio">
              <label>
                <input type="radio">free</label>
            </div>
            <div class="radio">
              <label>
                <input type="radio">low cost</label>
            </div>
            <div class="radio">
              <label>
                <input type="radio">usual cost</label>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div style="margin-top: 5%;" align="center">
      <button class="btn btn-primary">Search</button>
    </div>
