import React, { Component } from 'react';
import ListCoursesComponent from './/ListCourseComponent';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import CourseComponent from '../component/CourseComponent';

class InstructorApp extends Component {
    render() {
        return (
            <Router>
                <div>
                    <h1>Instructor Application</h1>
                    <Switch>
                        <Route path="/" exact component={ListCoursesComponent} />
                        <Route path="/courses" exact component={ListCoursesComponent} />
                        <Route path="/courses/:id" component={CourseComponent} />
                    </Switch>
                </div>
            </Router>
        )
    }
}

export default InstructorApp